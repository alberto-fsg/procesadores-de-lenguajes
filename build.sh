#!/bin/bash

cd ./practica3/traductor/modulos
cat main.jj tokens.jj programa.jj tipos.jj variables.jj expresiones.jj funciones.jj instrucciones.jj > gcl.jj
mv gcl.jj ..
cd ../../..

ant -f practica3