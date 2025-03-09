#!/bin/bash

INPUT_DIR="./practica3/traductor/modulos"
OUTPUT_FILE="./practica3/traductor/gcl.jj"

# si los directorios no existen abortar en lugar de estamparse
if [ ! -d "$INPUT_DIR" ]; then
    echo "Error: El directorio $INPUT_DIR no existe."
    exit 1
fi

# añadir advertencia épica
echo "// AUTOGENERADO - NO EDITAR MANUALMENTE" > "$OUTPUT_FILE"
echo "// Este archivo se genera automáticamente por build.sh" >> "$OUTPUT_FILE"
echo "" >> "$OUTPUT_FILE"

# concatenar a mano todos los ficheros porque la versión de Java es prehistórica :D
cat "$INPUT_DIR/main.jj" "$INPUT_DIR/tokens.jj" "$INPUT_DIR/programa.jj" \
    "$INPUT_DIR/tipos.jj" "$INPUT_DIR/variables.jj" "$INPUT_DIR/expresiones.jj" \
    "$INPUT_DIR/funciones.jj" "$INPUT_DIR/instrucciones.jj" >> "$OUTPUT_FILE"

# compilar con Apache Ant
ant -f practica3
