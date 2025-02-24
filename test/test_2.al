-- PUNTOS INTERESANTES EXCLUSIVOS DE ESTE TEST
-- punto 21. gcl.pdf: string con carácter literal "

programa Test2
booleano[5] flags;
entero[9] matriz;

entero i, j, k;
booleano b1, b2;
caracter c;

caracter procesarCar(entero codigo)
principio
    Sel
        caso codigo mod 2 = 0:
            procesarCar := entAcar(codigo);
        dlc:
            procesarCar := '?';
    FSel
fin

principio

    i := (5 * (3 + matriz[1*3 + 0])) mod (carAent(procesarCar(65)) - 10);

    b1 := ((i > 10) & (procesarCar(66) = 'B')) | !(j < 5);
    
    flags[(i + j) mod 5] := b1 & (b2 | (i <> j));
    
    Mq i < 10
        Sel
            caso i = 0:
                escribir_lin("Cero");
            caso i > 5:
                escribir("Mayor que 5");
                leer_lin(k);
            dlc:
                j := j + carAent(procesarCar(i + 65));
        FSel
        
        i := i + 1;
    FMq
    
    escribir_lin("Mensaje ""importante"": ", 'A');
fin