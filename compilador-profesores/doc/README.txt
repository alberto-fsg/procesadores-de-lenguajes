Traductor de "gcl" a "pcode". Invocar como 

$ java -jar gcl.jar [-h|-x|-o|-t|-sym|-ast|-xml|-num|-chk] <entrada[.gcl]> [<salida[.pcode]>]
    donde:
        -h: Mostrar la ayuda.
        -x: Generar código pcode ejecutable.
        -o: Optimizar bucles de copia de vectores y cadenas.
        -t: Mostrar las posiciones de los tokens.
        -sym: Mostrar la tabla de símbolos.
        -ast: Mostrar el árbol AST.
        -xml: Incluir etiquetas XML al generar pcode.
        -num: Incluir números de línea al generar pcode.
        -chk: Incluir comprobaciones de acceso a vectores.

La invocación sin parámetros mostrará el anterior mensaje informativo. Compilará
el fichero fuente "entrada.gcl", traduciéndolo a p-código, en el fichero
"salida.pcode". En el caso de no indicar la salida, el fichero de salida será
"entrada.pcode", sin extensión.

Para su posterior ejecución, deberemos ejecutar

$ pcode_tools/mi_sistema_operativo/ensamblador salida

que generará el binario para la máquina virtal de p-código "salida.x", que se
podrá ejecutar mediante la invocación 

$ pcode_tools/mi_sistema_operativo/maquinap salida 

