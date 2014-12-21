label jessie32
  menu label [^Jessie i386] Debian Lenny i386
  menu indent 1
  kernel distro/debian/jessie/i386/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/jessie/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=jessie --

label jessie64
  menu label [^Jessie amd64] Debian Lenny Amd64
  menu indent 1
  kernel distro/debian/jessie/amd64/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/jessie/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=jessie --

label -
  menu label
  menu disable

label wheezy32
  menu label [^Wheezy i386] Debian Wheezy Amd64
  menu indent 1
  kernel distro/debian/wheezy/i386/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/wheezy/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=wheezy --

label wheezy64
  menu label [^Wheezy amd64] Byte Standard
  menu indent 1
  kernel distro/debian/wheezy/amd64/linux
  append auto=true priority=critical vga=normal initrd=distro/debian/wheezy/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto console-keymaps-at/keymap=us suite=wheezy --

label -
  menu label
  menu disable

label squeeze64
  menu label [^Squeeze amd64] Byte Standard 
  menu indent 1 
  kernel distro/debian/squeeze/amd64/linux 
  append auto=true priority=critical vga=normal initrd=distro/debian/squeeze/amd64/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto suite=squeeze -- 
 
label squeeze32 
  menu label [^Squeeze  i386] Byte Standard 
  menu indent 1 
  kernel distro/debian/squeeze/i386/linux 
  append auto=true priority=critical vga=normal initrd=distro/debian/squeeze/i386/initrd.gz url=${BASE_URL}/config/preseed.cgi?distro=debian hostname=baseinstall interface=auto suite=squeeze -- 

label -
  menu label
  menu disable

