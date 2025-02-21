entero n, i, suma, minimo, maximo;
entero[100] datos;

Principio
   escribir_lin("Introduce la cantidad de datos (hasta 100):");
   leer(n);

   -- Para asegurar que n no exceda el tamaño del array
   Sel n > 100:
      escribir_lin("Has excedido el número máximo de datos (100).");
      abandonar;
   FSel

   -- Lectura de los datos
   i := 0;
   Mq i < n
      escribir("Introduce el dato ", i, ": ");
      leer(datos[i]);
      i := i + 1;
   FMq

   -- Inicialización de variables para calcular estadísticos
   suma := 0;
   minimo := datos[0];
   maximo := datos[0];

   -- Cálculo de suma, mínimo y máximo
   i := 0;
   Mq i < n
      suma := suma + datos[i];

      Sel datos[i] < minimo:
         minimo := datos[i];
      datos[i] > maximo:
         maximo := datos[i];
      FSel

      i := i + 1;
   FMq

   -- Cálculo e impresión de resultados
   escribir_lin("Resultados:");
   escribir_lin(" - Suma: ", suma);
   escribir_lin(" - Mínimo: ", minimo);
   escribir_lin(" - Máximo: ", maximo);
   escribir_lin(" - Media (entera): ", suma / n);
Fin
