#!/bin/bash

C_LOCATION=$(pwd)
IMAGE_NAME=$1

if [[ "$C_LOCATION" != *"/target" ]]; then
    echo "please, execute the script from the target folder"
    exec 1
fi

cp ../docker/Dockerfile Dockerfile
cp ../docker/entrypoint.sh entrypoint.sh

docker build . -t "$IMAGE_NAME"