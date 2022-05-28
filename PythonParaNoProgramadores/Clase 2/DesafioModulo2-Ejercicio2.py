'''
Año Bisiesto
'''

def year():
    entrada = input("Ingrese el año a consultar: ")
    while True:
        if entrada.isnumeric() == True:
            entrada = int(entrada)
            break
        else:
            print("Ingrese un numero valido")
            entrada = input("Ingrese el año a consultar: ")
    return(entrada)

anio = year()

if anio%400 == 0:
    print("El año Ingresado es un año Bisiesto")
elif anio%4 == 0 and anio%100 != 0:
    print("El año Ingresado es un año Bisiesto")
else:
    print("El año Ingresado no es un año Bisiesto")