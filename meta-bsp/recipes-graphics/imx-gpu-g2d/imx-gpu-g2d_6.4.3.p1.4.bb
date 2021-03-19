require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "27f211878fb0cb9dd5073fd0689a83ac"
SRC_URI[aarch64.sha256sum] = "1e300ea145da3458f416e4429d5f2d2fe4d600bf3740f2eb5f8ae662daed2da9"
SRC_URI[arm.md5sum] = "f087803b96a4c3e2a449eba78ec33c34"
SRC_URI[arm.sha256sum] = "3a6ecbd0c536ced9658fe632d35c9528885577e57bf245dd7f02833a4a2c121e"
