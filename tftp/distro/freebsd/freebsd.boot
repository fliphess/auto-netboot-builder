label freebsd64SE
  menu label [^M-FreeBSD SE amd64] FreeBSD 10.0 amd64 Special Edition with zfsinstall
  menu indent 1
  kernel memdisk iso
  append initrd=distro/freebsd/freebsd_amd64.iso harddisk raw

label freebsd64
  menu label [^M-FreeBSD amd64] FreeBSD 10.0 amd64
  menu indent 1
  kernel memdisk iso
  append initrd=distro/freebsd/freebsd_i386.iso harddisk raw
