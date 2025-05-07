#!/bin/bash

JAR_PATH="./practica4/dist/gcl_4.jar"
SOURCE_DIR="./test"
PCODE_DIR="./compilador-profesores/pcode-jorge-alberto"
ASSEMBLER="./compilador-profesores/linux/ensamblador"
MAQUINA_P="./compilador-profesores/linux/maquinap"
BINARY_OUTPUT_DIR="./compilador-profesores/binario-jorge-alberto"

# Create P-Codes from source files
for source_file in "$SOURCE_DIR"/*.gcl; do
    pcode_output="${PCODE_DIR}/$(basename "${source_file%.gcl}.pcode")"
    java -jar "$JAR_PATH" "$source_file" | sed -n '/^\s*ENP/,/^\s*LVP/p' > "$pcode_output"
done

# Assemble P-Codes into binaries
for pcode_file in "$PCODE_DIR"/*.pcode; do
    pcode_input="${pcode_file%.pcode}"
    "$ASSEMBLER" "$pcode_input"
done

# Move binary files to output directory
for binary_file in "$PCODE_DIR"/*.x; do
    mv "$binary_file" "$BINARY_OUTPUT_DIR"
done

# Execute binary files and wait for user input to continue
for binary_file in "$BINARY_OUTPUT_DIR"/*.x; do
    echo -e "\033[0;32m---------------------------------------------------\033[0m\n"
    object_input="${binary_file%.x}"
    "$MAQUINA_P" "$object_input"
    echo "\033[0;32m$(basename ${object_input}) executed\033[0m\n"
    read -p "Press Enter to continue..."  # Wait for user input to continue
done
