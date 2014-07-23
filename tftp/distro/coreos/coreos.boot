# coreos settings for $BASE_URL
label coreos 
  menu label [^CoreOS amd64] CoreOS
  menu indent 1 
  kernel distro/coreos/linux 
  append initrd=distro/coreos/initrd.gz cloud-config-url=$BASE_URL/conf/coreos.cgi hostname=coreos interface=auto --
