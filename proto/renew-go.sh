#!/bin/bash

set -e

workdir=$(cd $(dirname $0); pwd)

outdir=$workdir/../checker-go/pb
rm -rf $outdir

repo_tag=sammyne/protoc:3.15.0-protoc-gen-go1.25.0-ubuntu20.04

pb=helloworld.proto

docker run -it --rm   \
  -v $PWD:/pb         \
  -w /pb              \
  $repo_tag           \
  --go_out=/pb        \
  $pb

gopkg=$(grep "go_package" $pb | awk -F'"' '{print $2}')
if [ -z "$gopkg" ]; then
  echo "missing '$gopkg'"
  exit 1
fi

cp -r $gopkg $outdir

rm -rf github.com
