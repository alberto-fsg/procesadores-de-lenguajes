-- PUNTOS INTERESANTES EXCLUSIVOS DE ESTE TEST
-- punto 7. gcl.pdf: caracter literal '
-- punto 4. gcl.pdf: probar que el lenguaje es case-insensitive

pRogRAMa Test3
ENTERo VaLor_123;
CARacTeR _var_mixta;

ENTERo[2] x;
BOOlEANO B;

BOOlEANO FuncionConfusa(ENTERo[2] REf arr)
PRinCIPIO
    arr[0] := arr[0] * 2;
    FuncionConfusa := (arr[0] > 100) & (arr[1] < 50);
Fin

Mix(ENTERo REf a; ENTERo[2] b)
PRinCIPIO
    a := b[0] + b[1];
Fin

PRinCIPIO
    
    VALOR_123 := 42;
    _Var_Mixta := ''';
    
    B := funcionconfusa(x);
    
    LeEr_liN();
    
    x[1] := (5 + 3 * (2 - (4 MOD (1 + 1)))) / entAcar(_var_mixta);
    
    sel
        Caso B | (x[0] <> x[1]):
            escRibir_Lin("Caso 1");
        Caso !B & (x[0] = 0):
            mQ x[1] >= 0
                mQ x[1] >= 0
                    mQ x[1] >= 0
                        NaDa;
                    FmQ
                FmQ
            FmQ
        dlC:
            escRibir_Lin("Último Caso");
    Fsel

    Mix(x[0], x);
Fin
