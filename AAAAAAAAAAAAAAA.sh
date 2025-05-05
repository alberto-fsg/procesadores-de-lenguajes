#!/bin/bash

JAR_PATH="practica4/dist/gcl_4.jar"
SOURCE_DIR="test"

if [ ! -f "$JAR_PATH" ]; then
  echo "Error: JAR file '$JAR_PATH' not found." >&2
  exit 1
fi

if [ ! -d "$SOURCE_DIR" ]; then
  echo "Error: Source directory '$SOURCE_DIR' not found." >&2
  exit 1
fi

echo "Starting processing of files in '$SOURCE_DIR'..."
echo ""

find "$SOURCE_DIR" -type f | while IFS= read -r filepath; do
  filename=$(basename "$filepath")

  echo "--- Processing '$filename' ---"

  java -jar "$JAR_PATH" "$filepath" | sed -n '/^\s*ENP/,/^\s*LVP/p'

  if [ ${PIPESTATUS[0]} -ne 0 ]; then
      echo "Warning: Java command failed for '$filename'. No output extracted." >&2
  fi

  echo "--- Finished '$filename' ---"
  echo ""
done

echo "Processing complete."
