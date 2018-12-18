DESCRIPTION = "WAM demo applications for AGL"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10 \
"

inherit aglwgt

DEPENDS = "zip-native"
RDEPENDS_${PN} = "virtual/webruntime"

PR = "r0"

SRC_URI = "git://github.com/jaragunde/wam-demo-applications.git;branch=master"

S = "${WORKDIR}/git"
SRCREV = "892583bfbbc251d69e9ada655b18cbb834da161a"
