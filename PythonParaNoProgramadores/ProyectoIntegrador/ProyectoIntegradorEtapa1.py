'''
Una universidad desea crear un programa para
contabilizar los cursos que tiene cada alumno.
Para ello se debe realizar primero una aplicación
de consola la cual debe solicitar el nombre de un
alumno y la cantidad de cursos en la que se
encuentra inscripto.
Estos dos valores deben almacenarse como una
lista de dos elementos (el nombre y la cantidad
de cursos como un número entero) en una lista
de alumnos.

Una vez hecho esto, se debe hacer que el programa, al iniciar, pregunte cuál de las siguientes dos
operaciones se debe realizar: ingresar un
alumno o ver la lista de alumnos ingresados.
Un ejemplo de lo que debe aparecer en consola,
en una posible implementación, es lo siguiente:



Esto debe preguntarse infinitamente hasta que el
usuario escriba “3”.


En esta slide y la siguiente veremos un
ejemplo más completo de entrada y salida
(los caracteres en azul son ingresados por
el usuario).


'''
 
import os

def clear():
    os.system("cls")

def menu():
	print ("Selecciona una opción")
	print("/--------------------------------------------------/"
            "\n/	1 - Ver la lista de alumnos.               /"
            "\n/	2 - Añadir un alumno a la lista.           /"
            "\n/	3 - Salir.				   /"
            
            
            
            "\n/--------------------------------------------------/")

def imprimeNombreLista(lista): #En Lista debemos ingresar el nombre de la lista que queremos reccorer.
    for x in lista:
                nombre = x[0]
                cursos = x[1]
                imprimir = print("El alumno",nombre,"tiene",cursos,"cursos\n")
    return(imprimir)
    
def agregarAlumnoLista(listaAgregada): #En ListaAgregada debemos ingresar el nombre de nuestra lista.
    
    #Ingreso del nombre de Alumno
    
    nombre = input("Ingrese el nombre del alumno: ")
    while True:
        if nombre == "" or nombre.isnumeric() == True:
            print("Nombre Invalido")
            nombre = input("Ingrese el nombre del alumno: ")
            
        else:
            
            break
        
    #Ingreso de la cantidad de cursos
    entrada = input("Ingrese la cantidad de cursos del alumno: ")
    while True:
        if entrada.isnumeric() == True:
            entrada = int(entrada)
            break
        else:
            print("Ingrese un numero valido")
            entrada = input("Ingrese la cantidad de cursos del alumno: ")
    
    # Agrega todo a una lista
    listaAgregada.append([nombre,entrada])
    print("¡El alumno fue añadido a la lista!")

def continuar():
    continuar = input("Presione cualquier tecla para continuar...") 
    return(continuar)   

listaAlumnos = []

while True:
    os.system("cls")
    menu()
    
    opcion = input()
    
    if opcion == "1":
        if len(listaAlumnos) == 0:
            print("Lista Vacia")
            continuar()
        else:    
            imprimeNombreLista(listaAlumnos)
            continuar()
    elif opcion == "2": # Agregar Alumno a la lista
        agregarAlumnoLista(listaAlumnos)
        continuar()
        
    elif opcion == "3":
        
        break
    else:
        print("Seleccione una opcion correcta")
        continuar()
        