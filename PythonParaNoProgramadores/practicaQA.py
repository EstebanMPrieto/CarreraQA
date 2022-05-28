
'''
Averiguar si un numero ingresado es positivo,negativo o 0

'''

from ctypes.wintypes import PINT
from logging import exception


def year():
    """ Solicita un valor entero y lo devuelve.
        Si el valor ingresado no es entero, da 5 intentos para ingresarlo
        correctamente, y de no ser así, lanza una excepción. """
    intentos = 0
    while intentos < 5:
        valor = input("Ingrese un número entero: ")
        try:
            valor = int(valor)
            return valor
        except ValueError("Intentelo Nuevamente"):
            intentos += 1
    raise TypeError("Valor incorrecto ingresado en 5 intentos")

numero = year()

if numero == 0:
    print("El numero ingresado es 0")
elif numero > 0:
    print("El numero ingresado es Positivo")
else:
    print("El numero ingresado es Negativo")

print("Gracias por utilizar nuestro programa")

