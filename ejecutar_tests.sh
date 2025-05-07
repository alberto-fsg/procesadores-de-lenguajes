#!/bin/bash

# Compilar el proyecto
echo -e "\033[0;32mCompilando el proyecto\033[0m\n"
./build.sh

if [ $? -ne 0 ]; then
  echo -e "\033[0;31mError: Falló la compilación. Abortando.\033[0m"
  exit 1
fi

# Ejecutar las pruebas
echo -e "\033[0;32mEjecutando las pruebas\033[0m\n"
./tests.sh

# Limpiar el proyecto
echo -e "\033[0;32mLimpiando el proyecto\033[0m\n"
./clean.sh
