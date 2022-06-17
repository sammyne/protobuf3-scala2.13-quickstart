#!/bin/bash

set -e

workdir=$PWD

docker run -it --rm \
  -v $workdir:/pb \
  -w /pb \
  sammyne/scalapbc:tmp  \
  --scala_out=flat_package:/pb helloworld.proto

mv $workdir/proto/* .

rm -rf $workdir/proto
