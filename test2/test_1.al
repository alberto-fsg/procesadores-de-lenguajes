-- PUNTOS INTERESANTES EXCLUSIVOS DE ESTE TEST
-- punto 13. gcl.pdf: declaración de función y procedimiento anidado dentro de funciones
-- punto 11. gcl.pdf: instruccion nada
-- punto 22. gcl.pdf: instruccion abandonar

Programa Test1
entero[10] globalArr;
caracter c;
entero a, b;

entero funcionExterna(entero ref x; entero y)
    entero z;

    Interno(entero[10] ref arr; caracter c)
        Principio
            arr[z] := entAcar(65);
            c := 'X';
            escribir_lin("Interno:", arr[z], c);
        Fin

    entero funcionExterna(entero ref x; entero y)
        entero z;
        Interno(entero[10] ref arr; caracter c)
            Principio
                arr[z] := entAcar(65);
                c := 'X';
                escribir_lin("Interno:", arr[z], c);
            Fin
        Principio
            z := x + y;
            
            -- llamar procedimiento anidado
            Interno(globalArr, c);
            funcionExterna := z * 2;
        Fin
    Principio
        z := x + y;
        
        -- llamar procedimiento anidado
        Interno(globalArr, c);
        funcionExterna := z * 2;
    Fin

Vacio()
    Principio
        nada;
    Fin

Principio
    a := 5;
    globalArr[0] := 100;
    
    Sel
        caso a > 0:
            b := funcionExterna(a, 3);
            escribir_lin("Resultado:", b);
        caso a < 10:
            escribir("Segundo caso");
        dlc:
            abandonar;
    FSel
    
    Mq b > 0
        Vacio();
        b := b - 1;
    FMq
Fin