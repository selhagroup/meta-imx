# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP

SRCBRANCH = "master"
IMXTEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-test.git;protocol=https"
SRC_URI = " \
    ${IMXTEST_SRC};branch=${SRCBRANCH} \
    file://memtool_profile \
"
SRCREV = "a26b1ee51177e317aa05251d4c8f10c4c68064f6"

PACKAGECONFIG:append:mx8m = " swpdm"
