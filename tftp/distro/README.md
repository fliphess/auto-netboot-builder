## Freebsd MSF Images 

This image is downloaded from http://mfsbsd.vx.sk/

FreeBSD MSF is a custom build freebsd image that is somewhat equal to "linux live" 




Root password for all images: mfsroot
All images have mfsbsd.autodhcp set - all network cards are configured for DHCP.

The following kernel modules are included in all ISO's:
acpi (preloaded), ahci (preloaded), ext2fs, geom_mirror, ipmi, ntfs, opensolaris, smbus, snp, zfs 

The following packages are included in all ISO's:
cpdup, dmidecode, e2fsprogs, ipmitool, nano, rsync, smartmontools, tmux 

The special edition contains a special distribution file and the zfsinstall script.
You can easily install ZFS-on-root FreeBSD with this script.
Example: zfsinstall -d /dev/da0 -u /cdrom/9.2-RELEAE-amd64 -s 4G
This will install a GPT partition table and ZFS on /dev/da0, including a 4 GB GPT freebsd-swap partiton. 
