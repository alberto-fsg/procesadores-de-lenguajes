-- Declaración de variables globales
Programa test_1.al
  entero a, b, resultado;
  booleano flag;
  caracter c;

-- Procedimiento para calcular el factorial de un número
entero factorial(entero n)
Principio
  entero res;
  res := 1;
  Mq n > 1
    res := res * n;
    n := n - 1;
  FMq
  factorial := res;
Fin

-- Procedimiento para verificar si un número es primo
booleano esPrimo(entero n)
Principio
  entero i;
  booleano primo;
  primo := verdadero;
  Si n <= 1 Entonces
    primo := falso;
  Sino
    i := 2;
    Mq i * i <= n y primo
      Si n mod i = 0 Entonces
        primo := falso;
      FMq
      i := i + 1;
    FMq
  Fin
  esPrimo := primo;
Fin

-- Función para calcular el n-ésimo número de Fibonacci
entero fibonacci(entero n)
Principio
  entero a, b, temp;
  a := 0;
  b := 1;
  Mq n > 0
    temp := a + b;
    a := b;
    b := temp;
    n := n - 1;
  FMq
  fibonacci := a;
Fin

-- Programa principal
Principio
  escribir_lin("Introduce un número para calcular su factorial:");
  leer(a);
  escribir_lin("Factorial de ", a, " es ", factorial(a));

  escribir_lin("Introduce un número para verificar si es primo:");
  leer(b);
  Si esPrimo(b) Entonces
    escribir_lin(b, " es un número primo.");
  Sino
    escribir_lin(b, " no es un número primo.");
  Fin

  escribir_lin("Introduce un índice para calcular el número de Fibonacci:");
  leer(resultado);
  escribir_lin("El número de Fibonacci en la posición ", resultado, " es ", fibonacci(resultado));

  escribir_lin("Pruebas avanzadas completadas.");
Fin
