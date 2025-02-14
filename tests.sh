#!/bin/bash

python --version > /dev/null 2>&1
python_code=$?

python3 --version > /dev/null 2>&1
python3_code=$?

./build.sh > /dev/null 2>&1

if [ $python_code -eq 0 ]; then 
  python test_gcl.py ./practica2/dist/gcl.jar test
elif [ $python3_code -eq 0 ]; then
  python3 test_gcl.py ./practica2/dist/gcl.jar test
else
  echo "Python no está instalado en el dispositivo."
fi

./clean.sh > /dev/null 2>&1