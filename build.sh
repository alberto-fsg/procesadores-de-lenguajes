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

# ficheros que componen gcl.jj
FILES=(
    "main.jj"
    "tokens.jj"
    "programa.jj"
    "tipos.jj"
    "variables.jj"
    "expresiones.jj"
    "funciones.jj"
    "instrucciones.jj"
    "especiales.jj"
)

# concatenar a mano todos los ficheros porque la versión de Java es prehistórica :D
for file in "${FILES[@]}"; do
    FILE_PATH="$INPUT_DIR/$file"

    # imprimir 1 WARNING por cada fichero inexistente
    if [ ! -f "$FILE_PATH" ]; then
        echo "⚠️ WARNING: El archivo $file no existe en $INPUT_DIR y será omitido." >&2
        continue
    fi

    # imprimir 1 WARNING por cada fichero que no acabe en \n (viva la consistencia)
    if [ -n "$(tail -c1 "$FILE_PATH" | tr -d '\n')" ]; then
        echo "⚠️ WARNING: El archivo $file no termina en una nueva línea (\n)." >&2
    fi

    echo "// --- INICIO DE $file ---" >> "$OUTPUT_FILE" # concatenar cabecera
    cat "$FILE_PATH" >> "$OUTPUT_FILE" # concatenar cuerpo
    echo -e "" >> "$OUTPUT_FILE" # concatenar \n
done

# compilar con Apache Ant
ant -f practica3
