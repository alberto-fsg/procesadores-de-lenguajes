#!/bin/bash

JAR_PATH="./practica4/dist/gcl_4.jar"
SOURCE_DIR="./test"
PCODE_DIR="./compilador-profesores/pcode-jorge-alberto"
ASSEMBLER="./compilador-profesores/linux/ensamblador"
MAQUINA_P="./compilador-profesores/linux/maquinap"
BINARY_OUTPUT_DIR="./compilador-profesores/binario-jorge-alberto"

# Create P-Codes from source files, but ignore errores.gcl
for source_file in "$SOURCE_DIR"/*.gcl; do
    [[ "$(basename "$source_file")" == "errores.gcl" ]] && continue

    pcode_output="${PCODE_DIR}/$(basename "${source_file%.gcl}.pcode")"
    java -jar "$JAR_PATH" "$source_file" \
      | sed -n '/^\s*ENP/,/^\s*LVP/p' \
      > "$pcode_output"
done

# Assemble P-Codes into binaries, but ignore errores.pcode
for pcode_file in "$PCODE_DIR"/*.pcode; do
    [[ "$(basename "$pcode_file")" == "errores.pcode" ]] && continue

    pcode_input="${pcode_file%.pcode}"
    "$ASSEMBLER" "$pcode_input"
done

# Move binary files to output directory, but ignore errores.x
for binary_file in "$PCODE_DIR"/*.x; do
    [[ "$(basename "$binary_file")" == "errores.x" ]] && continue

    mv "$binary_file" "$BINARY_OUTPUT_DIR"
done

# Execute binary files and wait for user input to continue,
# but ignore errores.x
for binary_file in "$BINARY_OUTPUT_DIR"/*.x; do
    [[ "$(basename "$binary_file")" == "errores.x" ]] && continue

    echo -e "\033[0;32m---------------------------------------------------\033[0m"
    object_input="${binary_file%.x}"
    if [[ "$(basename "$object_input")" == "invertir_pgm" ]]; then
        "$MAQUINA_P" "$object_input" < "$SOURCE_DIR"/einstein.pgm \
          > "$SOURCE_DIR"/resultado.pgm
    else
        "$MAQUINA_P" "$object_input"
    fi
    echo -e "\033[0;32m$(basename "$object_input") executed ↑\033[0m"
    read -p "Press Enter to continue..."
done
echo -e "\033[0;32m---------------------------------------------------\033[0m"

# Special case for errores.gcl: just pass it through the compiler and check the .pcode file is empty
ERROR_SRC="$SOURCE_DIR/errores.gcl"
ERROR_PCODE="$PCODE_DIR/errores.pcode"

echo -e "\033[0;31m----- Processing errores.gcl -----\033[0m"

java -jar "$JAR_PATH" "$ERROR_SRC" \
  | sed -n '/^\s*ENP/,/^\s*LVP/p' \
  > "$ERROR_PCODE"

if [[ ! -s "$ERROR_PCODE" ]]; then
    echo -e "\033[0;31m$(basename "$ERROR_PCODE") is empty (no code generated)\033[0m"
fi

# Cleanup
read -p "Do you want to erase all generated P-codes, binaries, and resultado.pgm? [y/N] " clean
if [[ "$clean" =~ ^[Yy]$ ]]; then
    rm -rf "${PCODE_DIR:?}/"* \
           "${BINARY_OUTPUT_DIR:?}/"* \
           "$SOURCE_DIR/resultado.pgm"
    echo -e "\033[0;32mCleanup complete: PCODE_DIR, BINARY_OUTPUT_DIR and resultado.pgm have been erased.\033[0m"
else
    echo -e "\033[0;33mSkipping cleanup.\033[0m"
fi
