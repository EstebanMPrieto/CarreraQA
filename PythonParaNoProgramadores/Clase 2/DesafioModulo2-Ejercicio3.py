'''
Escriba un programa que permita crear una lista
de nombres.
Para ello, el programa tiene que pedir un número
y luego solicitar esa cantidad de nombres para
crear la lista. Por último, el programa tiene que
mostrar la lista creada.
'''


def cantidadNombres():
    entrada = input("Ingrese en numero la cantidad de nombres: ")
    while True:
        if entrada.isnumeric() == True:
            entrada = int(entrada)
            break
        else:
            print("Ingrese un numero valido")
            entrada = input("Ingrese en numero la cantidad de nombres: ")
    return(entrada)

def nombre():
    nombre = input("Ingrese su nombre: ")
    while True:
        if nombre == "" or nombre.isnumeric() == True:
            print("Nombre Invalido")
            nombre = input("Ingrese su nombre: ")
        else:
            break
    return(nombre)

lista = []

cantidaNombre = cantidadNombres()

while cantidaNombre > len(lista):
    nombres = nombre()
    lista.append(nombres)


for x in lista:
    print(x)

