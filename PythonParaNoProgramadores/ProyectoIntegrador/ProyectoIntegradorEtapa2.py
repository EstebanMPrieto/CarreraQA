'''
Etapa 2
La lista de alumnos que creamos en el módulo
anterior ahora debe ser un diccionario, en donde
las claves serán nombres de alumnos y los
valores sus respectivas cantidades de cursos.
Para esto se debe modificar el código de las
opciones 1 y 2 (agregar un nuevo alumno y ver la
lista de alumnos).
La tercera opción será “Ver la cantidad de cursos
de un alumno”. Deberá solicitar el nombre de un
alumno e imprimir en pantalla el número de
cursos que tiene asociados como clave. La cuarta
opción es la de salir, como en la versión anterior.
Usar todo lo aprendido hasta el momento, el
programa no debe de frenar de forma imprevista
a causa de un error. Ya que en el material de
lectura se vieron todas las posibles soluciones
frente a los problemas que se puedan presentar.

'''


import os
import msvcrt as m

def clear():
    os.system("cls")

def menu():
	print ("Selecciona una opción")
	print("/--------------------------------------------------/"
            "\n/	1 - Ver la lista de alumnos.               /"
            "\n/	2 - Añadir un alumno a la lista.           /"
            "\n/	3 - Ver la cantidad de cursos de un alumno /"
            "\n/	4 - Salir.				   /"
            
            
            
            "\n/--------------------------------------------------/")

def imprimeNombreLista(diccionario): #En Lista debemos ingresar el nombre de la lista que queremos reccorer.
    for clave in diccionario:
                nombre = clave
                cursos = diccionario[clave]
                imprimir = print("El alumno",nombre,"tiene",cursos,"cursos\n")
    return(imprimir)

def comprobarNombre():
    nombre = input("Ingrese el nombre del alumno: ")
    while True:
        if nombre == "" or nombre.isnumeric() == True:
            print("Nombre Invalido")
            nombre = input("Ingrese el nombre del alumno: ")
            
        else:
            break
    return(nombre)

def comprobarNumero():
    entrada = input("Ingrese la cantidad de cursos del alumno: ")
    while True:
        if entrada.isnumeric() == True:
            entrada = int(entrada)
            break
        else:
            print("Ingrese un numero valido")
            entrada = input("Ingrese la cantidad de cursos del alumno: ")
    return(entrada)

def imprimirCantDeCursos(diccionario): # Funcion para imprimir el numero de la cantidad de cursos que tiene el alumno ingresado.
    nombre = comprobarNombre()
    if nombre in dicAlumnos:
        cursos = diccionario[nombre]
        imprimir1 = print("El alumno",nombre,"tiene",cursos,"cursos")
    else:
        imprimir1 = print("No se encontro el alumno especificado.")
    
    return(imprimir1)
    
def agregarAlumnoLista(dicAgregada): # Funcion que agregar nombre del alumno y la cantidad de cursos en un numero entero.
    
    #Ingreso del nombre de Alumno
    
    nombre = comprobarNombre()
        
    #Ingreso de la cantidad de cursos
    entrada = comprobarNumero()
    
    # Agrega todo a una lista
    dicAgregada[nombre] = entrada 
    print("¡El alumno fue añadido al Diccionario!")

def continuar(): # Funcion para 
    print("Presione cualquier tecla para continuar...",)
    m.getch() 
    return()   

dicAlumnos = {}

while True:
    os.system("cls")
    menu()
    
    opcion = input()
    
    if opcion == "1":
        if len(dicAlumnos) == 0:
            print("Diccionario Vacio")
            continuar()
        else:    
            imprimeNombreLista(dicAlumnos)
            continuar()
    elif opcion == "2": # Agregar Alumno a la lista
        agregarAlumnoLista(dicAlumnos)
        continuar()
    elif opcion == "3": # Ver Lista de alumnos
        imprimirCantDeCursos(dicAlumnos)
        continuar()
        
        
    elif opcion == "4":
        clear()
        print("Gracias por utilizar nuestro programa")
        break
    else:
        print("Seleccione una opcion correcta")
        continuar()
        