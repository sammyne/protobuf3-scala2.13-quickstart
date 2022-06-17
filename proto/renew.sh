#!/bin/bash

set -e

workdir=$(cd $(dirname $0); pwd)

sc_outdir=$workdir/../src/main/scala/proto

rm -rf $workdir/sc && mkdir $workdir/sc

docker run -it --rm \
  -v $workdir:/pb \
  -w /pb \
  sammyne/scalapbc:tmp  \
  --scala_out=flat_package:/pb/sc helloworld.proto

rm -rf $sc_outdir && mv $workdir/sc/proto $sc_outdir

rm -rf $workdir/sc
