label jessie32
  menu label [^Jessie i386] Debian Jessie i386
  menu indent 1
  kernel distro/debian/jessie/i386/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/jessie/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=jessie --

label jessie64
  menu label [^Jessie amd64] Debian Jessie Amd64
  menu indent 1
  kernel distro/debian/jessie/amd64/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/jessie/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=jessie --

label -
  menu label
  menu disable

label stretch32
  menu label [^Stretch i386] Debian Stretch i386
  menu indent 1
  kernel distro/debian/stretch/i386/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/stretch/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=stretch --

label stretch64
  menu label [^Stretch amd64] Debian Stretch Amd64
  menu indent 1
  kernel distro/debian/stretch/amd64/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/stretch/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=stretch --

label -
  menu label
  menu disable

label buster32
  menu label [^Buster i386] Debian Buster i386
  menu indent 1
  kernel distro/debian/buster/i386/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/buster/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=buster --

label buster64
  menu label [^Buster amd64] Debian Buster Amd64
  menu indent 1
  kernel distro/debian/buster/amd64/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/buster/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=buster --

label -
  menu label
  menu disable

