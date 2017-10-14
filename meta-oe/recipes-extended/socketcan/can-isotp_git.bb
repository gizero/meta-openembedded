LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/hartkopp/can-isotp.git;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "4410847df488aed82d7e975294e5f2b070713848"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE += "KERNELDIR=${STAGING_KERNEL_DIR}"
