#!/bin/bash

RUTA_TEST="test"
RUTA_ANALIZADOR_LEXICO="practica4/dist"

# Compilar el proyecto
echo -e "\033[0;33mCompilando el proyecto\033[0m\n"
./build.sh

# Ejecutar las pruebas
echo -e "\033[0;Ejecutando las pruebas\033[0m\n"
./tests.sh

# Limpiar el proyecto
echo -e "\033[0;33mLimpiando el proyecto\033[0m\n"
./clean.sh
