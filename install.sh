#!/bin/bash
# Netboot builder - installer script

if [ "$0" != './install.sh' ]; then
    echo "Please run this script as \"cd $( dirname $0 ) ; ./install.sh\""
    exit 1
fi

# CHANGE THIS:
BASE_URL="https://host.fliphess.com/baseinstall"

function log() { echo -e "\t >>> $1"; } 
function setup_tftp() { DIR="${1}"; ( cd "$DIR" && ./setup ); }

function create_netboot_menu_header() {
  FILE="$1"
  cat << EOF > $FILE
UI bootmenu/menu.c32
menu title - Netboot -
prompt 0
timeout 300
ontimeout sda
EOF
}

function create_entry_for_distro() {
  FILE="$1"
  DISTRO="$2" 
  CONFIG_TEMPLATE="tftp/distro/$DISTRO/${DISTRO}.boot"

  if [ ! -f "$CONFIG_TEMPLATE" ]; then
    log "Configtemplate for $DISTRO not found! Not creating a bootmenu entry"
    return 1
  fi
  cat << EOF >> $FILE

label [ Distro: $DISTRO ]
menu label
menu disable

EOF

  while read line
  do  
    eval echo "$line" >> $FILE
  done < $CONFIG_TEMPLATE

}


function main() {
    MENU_FILE="tftp/bootmenu/menu.cfg"
    echo "Creating header page for bootmenu"
    create_netboot_menu_header "$MENU_FILE"

    echo "Setting up tftpboot for all available distro's"
    DISTROS=(`ls tftp/distro/`)
    for DISTRO in ${DISTROS[@]}
    do
        echo -e "\n#########################################"
        echo -e "###    Setting up tftp for $DISTRO"
        echo -e "#########################################\n"
      
        log "Setup bootmenu for $DISTRO"
        create_entry_for_distro "$MENU_FILE" "$DISTRO"

        log "setup tftp root for distro $DISTRO"
        setup_tftp "tftp/distro/$DISTRO"  
    done

    echo -e "\n#########################################"
    echo -e "###    All done!"
    echo -e "#########################################\n"
}

main

