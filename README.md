# taller06

### Problema01

Se requiere desarrollar un programa en Java que permita realizar operaciones aritméticas entre dos números ingresados por teclado.

El programa debe permitir seleccionar una de las siguientes operaciones:

- Suma.
- Resta.
- Multiplicación.
- División.
- Módulo (residuo de la división).
- Potencia.

La ejecución de cualquiera de las operaciones está sujeta a una restricción: **el primer número ingresado debe ser mayor que el segundo**. Si esta condición no se cumple, el programa debe informar al usuario que no es posible realizar la operación solicitada.

Por ejemplo, si el usuario selecciona una resta e ingresa los valores `10` y `8`, la operación puede realizarse porque el primer número es mayor que el segundo.

El programa debe solicitar los datos necesarios para realizar la operación seleccionada y presentar un reporte con los valores ingresados, la operación realizada y el resultado obtenido.

**Ejemplo de reporte:**

```text
OPERACIONES ARITMÉTICAS

Primer número: 10
Segundo número: 8
Operación seleccionada: Resta

Resultado: 2
```

**Consideraciones:**

- La restricción establecida debe cumplirse para todas las operaciones.
- Si los números ingresados no cumplen la restricción, se debe presentar un mensaje informativo.
- Si el usuario selecciona una operación no contemplada, el programa debe informar que la opción no es válida.
- Las operaciones de división y módulo deben contemplar que el segundo número no puede ser cero.
- El programa debe presentar únicamente el resultado de la operación seleccionada.

**Implementaciones requeridas:**

El problema debe resolverse mediante dos programas independientes:

1. **Solución A:** utilizar exclusivamente estructuras condicionales `if / else`, incluyendo condicionales anidados.
2. **Solución B:** utilizar la estructura `switch` para seleccionar la operación aritmética, incorporando las condiciones necesarias para cumplir las restricciones del problema.

Ambas soluciones deben producir los mismos resultados cuando se ingresen los mismos datos.

### Problema02


La estación de peaje **"Buena Vía"** requiere el desarrollo de un programa en Java que permita determinar el valor que debe cancelar el propietario de un vehículo por utilizar la carretera.

El cálculo del peaje depende del tipo de vehículo y de su avalúo comercial.

La estación establece la siguiente clasificación de vehículos:

| Tipo | Descripción |
|---|---|
| 1 | Vehículo liviano particular |
| 2 | Vehículo grande particular |
| 3 | Taxi |
| 4 | Bus urbano |

Para calcular el peaje, se aplican las siguientes tarifas:

| Tipo | Porcentaje del avalúo | Valor fijo |
|---|---|---|
| 1 | 0.01 % | $2.00 |
| 2 | 0.02 % | $2.50 |
| 3 | 0.04 % | $1.50 |
| 4 | 0.05 % | $2.20 |

Adicionalmente, la estación ha establecido que los vehículos particulares (tipos 1 y 2) cuyo avalúo comercial sea superior a **$30 000** deberán cancelar un recargo de **$1.50**.

Los taxis y buses urbanos no están sujetos a este recargo, independientemente de su avalúo comercial.

El programa debe solicitar los datos necesarios para realizar los cálculos correspondientes y presentar un reporte con la información del propietario, las características del vehículo y los valores calculados.

**Ejemplo de reporte:**

```text
Peaje "Buena Vía"
Propietario: René Elizalde
Tipo: Vehículo liviano particular
    Avalúo: $35000.00
    Valor base del peaje: $5.50
    Recargo: $1.50

    Total a cancelar: $7.00
```

**Consideraciones:**

- El cálculo debe respetar las tarifas establecidas para cada tipo de vehículo.
- El recargo debe aplicarse únicamente cuando se cumplan las condiciones indicadas.
- Si se ingresa un tipo de vehículo diferente de los establecidos, el programa debe informar que no es válido.
- Los valores monetarios deben presentarse con dos decimales.
- El programa debe utilizar las estructuras de control estudiadas en clase.

### Problema03

Una empresa requiere desarrollar un programa en Java que permita calcular el nuevo sueldo de sus empleados, considerando el tipo de empleado y los años de servicio en la institución.

La empresa ha establecido los siguientes porcentajes de incremento salarial, de acuerdo con el tipo de empleado:

| Tipo de empleado | Porcentaje de incremento |
|---|---|
| 1 | 5 % |
| 2 | 7 % |
| 3 | 9 % |
| 4 | 12 % |
| 5 o cualquier otro tipo | 15 % |

Adicionalmente, la empresa reconoce una bonificación económica por antigüedad, considerando los siguientes criterios:

| Años de servicio | Bonificación |
|---|---|
| Menos de 2 años | $0.00 |
| Desde 2 hasta menos de 5 años | $30.00 |
| Desde 5 hasta menos de 10 años | $60.00 |
| 10 años o más | $100.00 |

El programa debe solicitar la información necesaria del empleado y realizar los cálculos correspondientes para determinar el incremento salarial, la bonificación por antigüedad y el nuevo sueldo que recibirá.

**Ejemplo de reporte:**

```text
REPORTE DE INCREMENTO SALARIAL

Empleado: Juan Carlos Pérez
Tipo de empleado: 3
Años de servicio: 7

Sueldo inicial: $850.00
Porcentaje de incremento: 9%
Incremento salarial: $76.50
Bonificación por antigüedad: $60.00

Nuevo sueldo: $986.50
```

**Consideraciones:**

- El incremento salarial debe calcularse sobre el sueldo inicial.
- La bonificación por antigüedad es un valor adicional al incremento salarial.
- El nuevo sueldo debe incluir el sueldo inicial, el incremento y la bonificación correspondiente.
- Se deben respetar los intervalos de años de servicio establecidos.
- Los valores monetarios deben presentarse con dos decimales.
- Las variables utilizadas en los cálculos deben tener valores correctamente asignados antes de su utilización.
- El programa debe utilizar las estructuras de control estudiadas en clase.

**Referencia del problema original:**

López Román, L. (2013). *Metodología de la programación orientada a objetos*. México.

*Nota: Problema adaptado con fines académicos mediante la incorporación de una bonificación por antigüedad.*
