 
"""

Un empleado cobró 300 dólares por mes desde enero
a junio, 500 dólares de julio a octubre, y 700 dólares
por mes en noviembre y en diciembre.
Hace un programa que calcule el sueldo promedio. Y
que diga si este “empleado” está cobrando un sueldo
bajo, normal o mejor de lo normal.
● Sueldo bajo: por debajo de 300 dólares.
● Sueldo normal: entre 300 a 900.
● Sueldo mejor de lo normal: más de 900 dólares.

"""

eneroAjunio = 300 * 6

julioAoctubre = 500 * 4

noviembreAdiciembre = 700 * 2

promedio = (eneroAjunio+julioAoctubre+noviembreAdiciembre) / 12

if promedio > 900:
    print("Sueldo mejor de lo normal: más de 900 dólares")
elif promedio > 300 and promedio < 900:
    print("Sueldo normal: entre 300 a 900")
else:
    print("Sueldo bajo: por debajo de 300 dólares.")

