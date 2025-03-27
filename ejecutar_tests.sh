#!/bin/bash

RUTA_TEST="test"
RUTA_ANALIZADOR_LEXICO="practica3/dist"

# Compilar el proyecto
echo -e "\033[0;33mCompilando el proyecto\033[0m\n"
./build.sh

# Función para ejecutar un test
execute_test() {
  FILE=$1
  echo -e "\033[0;33mEjecutando test $FILE\033[0m"
  java -jar ${RUTA_ANALIZADOR_LEXICO}/gcl_4.jar ${RUTA_TEST}/$FILE
  echo
}

# Lista de tests
TESTS=(
  "outores.gcl"
  "test_1.al"
  "test_2.al"
  "test_3.al"
  "cambio_base.gcl"
  "conjetura_goldbach.gcl"
  "criba_eratostenes.gcl"
  # "einstein.pgm"
  "expresiones_bool.gcl"
  "expresiones_integer.gcl"
  "factorial.gcl"
  "fibonacci.gcl"
  "fibonacci_iterativo.gcl"
  "hello_world.gcl"
  "invertir_pgm.gcl"
  "juego_de_la_vida.gcl"
  "mcd.gcl"
  "numero_euler.gcl"
  "numero_pi_leibnitz.gcl"
  "quicksort.gcl"
  "reinas_ajedrez.gcl"
  "torres_hanoi.gcl"
)

# Bucle para ejecutar cada test uno a uno
for TEST in "${TESTS[@]}"; do
  execute_test "$TEST"
  echo -e "\033[0;33mAcabas de ejecutar "$TEST" - Presiona Enter para continuar...\033[0m"
  read -r
done

# Limpiar el proyecto
echo -e "\033[0;33mLimpiando el proyecto\033[0m\n"
./clean.sh
