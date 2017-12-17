#!/bin/bash

docker-compose up -d

if [ "$(uname)" == "Darwin" ]; then
    p=''
elif [ "$(expr substr $(uname -s) 1 5)" == "Linux" ]; then
    p=''
else
    #p = prefix
    p='winpty'
fi