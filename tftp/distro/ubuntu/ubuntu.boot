label lucid32
  menu label [^Lucid i386] 10.04 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/lucid/i386/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/lucid/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label lucid64
  menu label [^Lucid amd64] 10.04 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/lucid/amd64/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/lucid/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label - 
  menu label  
  menu disable 

label precise32
  menu label [^Precise i386] 12.04 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/precise/i386/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/precise/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label precise64
  menu label [^Precise amd64] 12.04 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/precise/amd64/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/precise/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label - 
  menu label  
  menu disable 

label quantal32
  menu label [^Quantal i386] 12.10 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/quantal/i386/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/quantal/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label quantal64
  menu label [^Quantal amd64] 12.10 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/quantal/amd64/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/quantal/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label - 
  menu label  
  menu disable 

label raring32
  menu label [^Raring i386] 13.04 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/raring/i386/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/raring/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label raring64
  menu label [^Raring amd64] 13.04 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/raring/amd64/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/raring/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label - 
  menu label  
  menu disable 

label saucy32
  menu label [^Saucy i386] 13.10 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/saucy/i386/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/saucy/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label saucy64
  menu label [^Saucy amd64] 13.10 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/saucy/amd64/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/saucy/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label - 
  menu label  
  menu disable 

label trusty32
  menu label [^Trusty i386] 14.04 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/trusty/i386/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/trusty/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label trusty64
  menu label [^Trusty amd64] 14.04 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/trusty/amd64/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/trusty/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label utopic32
  menu label [^Utopic Unicorn i386] 14.10 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/utopic/i386/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/utopic/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label utopic_unicorn64
  menu label [^Utopic Unicorn amd64] 14.10 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/utopic/amd64/linux
  append ks=$BASE_URL/config/ks.cfg vga=normal initrd=distro/ubuntu/utopic/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label - 
  menu label  
  menu disable 
