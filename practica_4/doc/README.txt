Autores:

 * Jorge Soria Romeo [872016]
 * Alberto Francisco Solaz García [873373]
 * (Esqueleto: Procesadores de Lenguajes-University of Zaragoza)

Compilador gcl.jar (V1.0)
------------------------------
Análisis léxico, sintáctico y semántico

Para ejecutar todos los tests

-------------------------------------------------------------
./ejecutar.sh
-------------------------------------------------------------

Para compilar 1 solo fichero

-------------------------------------------------------------
java -jar gcl.jar <fichero_fuente_gcl>
-------------------------------------------------------------

Alternativamente

-------------------------------------------------------------
java -jar gcl.jar <fichero_fuente_gcl.gcl>
-------------------------------------------------------------


Características generales:

    - Características de GCL en el nivel 4:

        1. Variables locales permitidas
        2. Procedimientos y funciones permitidas
        3. Parámetros escalares: por valor y por referencia
        4. Parámetros vectoriales: por valor y por referencia  

    - Errores semánticos testeados:

        1. Operador ! con tipo entero
        2. Operador - con tipo booleano
        3. Operador + con tipo booleano
        4. Operaciones aritméticas con tipos incompatibles
        5. Operaciones booleanas con enteros
        6. Asignación entre tipos incompatibles
        7. Comparaciones entre tipos incompatibles
        8. Arrays con tamaño no positivo
        9. Número insuficiente de parámetros
        10. Parámetros por valor de tipo incompatible
        11. Parámetro por referencia no es variable
        12. Parámetro por referencia de tipo incompatible

    - Clases introducidas:

        AtribExp: clase que organiza pasar información sobre expresiones (
                  sirve para responder a: ¿es la expresión constante? ¿es la
                  expresión una variable? ¿cuál es su tipo? ¿cuál es su valor
                  si es que está definido en tiempo de compilación?)
    
        AtribTipo: clase que organiza pasar información sobre los tipos de las
                   variables/funciones para hacer comprobaciones semánticas

    - Organización en directorios de las prácticas:
        procesadores-de-lenguajes
        ├── practica_4
        │   ├── build.xml
        │   ├── doc
        │   │   └── README.txt
        │   ├── lib/
        │   └── traductor
        │       ├── gcl_4.jj
        │       └── modulos // descomposición modular de nuestro traductor
        │           ├── especiales.jj
        │           ├── expresiones.jj
        │           ├── funciones.jj
        │           ├── instrucciones.jj
        │           ├── main.jj
        │           ├── programa.jj
        │           ├── tipos.jj
        │           ├── tokens.jj
        │           └── variables.jj
        ├── test
            ├── errores.gcl // banco de pruebas para errores semánticos
            ├── test_1.gcl
            ├── test_2.gcl
            ├── test_3.gcl
            └── las pruebas que nos dieron en el equeleto de la práctica 1 ...

