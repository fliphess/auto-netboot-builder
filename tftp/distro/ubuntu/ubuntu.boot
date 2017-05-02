
label trusty32
  menu label [^Trusty i386] 14.04 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/trusty/i386/linux
  append vga=normal initrd=distro/ubuntu/trusty/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label trusty64
  menu label [^Trusty amd64] 14.04 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/trusty/amd64/linux
  append vga=normal initrd=distro/ubuntu/trusty/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label -
  menu label
  menu disable

label xenial32
  menu label [^Xenial i386] 16.04 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/xenial/i386/linux
  append vga=normal initrd=distro/ubuntu/xenial/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label xenial64
  menu label [^Xenial amd64] 16.04 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/xenial/amd64/linux
  append vga=normal initrd=distro/ubuntu/xenial/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label -
  menu label
  menu disable

label zesty32
  menu label [^Zesty i386] 17.04 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/zesty/i386/linux
  append vga=normal initrd=distro/ubuntu/zesty/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label zesty64
  menu label [^Zesty amd64] 17.04 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/zesty/amd64/linux
  append vga=normal initrd=distro/ubuntu/zesty/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label -
  menu label
  menu disable

label yakkety32
  menu label [^Yakkety i386] 16.10 i386 installer regular
  menu indent 1
  kernel distro/ubuntu/yakkety/i386/linux
  append vga=normal initrd=distro/ubuntu/yakkety/i386/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label yakkety64
  menu label [^Yakkety amd64] 16.10 amd64 installer regular
  menu indent 1
  kernel distro/ubuntu/yakkety/amd64/linux
  append vga=normal initrd=distro/ubuntu/yakkety/amd64/initrd.gz ramdisk_size=16432 root=/dev/rd/0 rw  --

label -
  menu label
  menu disable
