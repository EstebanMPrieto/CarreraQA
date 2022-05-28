import tkinter as tk
import os

def clears():
    os.system("cls")

def comprobarEntrada():
    clears()
    cursos = ingresoCursos.get()
    nombre = ingresoNombre.get()
 
    if cursos.isnumeric() == False or cursos == "" or nombre == "" or nombre.isnumeric() == True:
        print("Los datos ingresados no son validos")
    else:
        cursos = int(cursos)
        print("¡El alumno fue añadido al Diccionario!")
        dicAlumnos[nombre] = cursos
    
    
def verLista():
    clears()
    if len(dicAlumnos) < 1:
        print("Lista Vacia")
    else:
        for clave in dicAlumnos:
                cursos = dicAlumnos[clave]
                print("El alumno",clave,"tiene",cursos,"cursos\n")
    
def verCursos():
    clears()
    nombre = ingresoNombre.get()
    if nombre in dicAlumnos:
        cursos = dicAlumnos[nombre]
        print("El alumno tiene",cursos,"cursos")
    elif len(dicAlumnos) < 1:
        print("No se encontro el alumno especificado.")
    

dicAlumnos = {}

ventana = tk.Tk()
ventana.title("Proyecto Integrador")
ventana.config(width=400,height=300)

verAlumno = tk.Button(text="Ver lista de alumnos",command=verLista)
verAlumno.place(x=30,y=30)

etiquetaNombre = tk.Label(text="Ingrese Nombre:")
etiquetaNombre.place(x=30,y=100)

ingresoNombre = tk.Entry()
ingresoNombre.place(x=125,y=100,width=150,height=20)

etiquetaCursos = tk.Label(text="Cursos:")
etiquetaCursos.place(x=30,y=150)

ingresoCursos = tk.Entry()
ingresoCursos.place(x=125,y=150,width=50,height=20)

btnAgregarAlumno = tk.Button(text="Agregar a la lista",command=comprobarEntrada)
btnAgregarAlumno.place(x=30,y=200)

btnVerCursos = tk.Button(text="Ver cantidad de cursos",command=verCursos)
btnVerCursos.place(x=140,y=200)


ventana.mainloop()
