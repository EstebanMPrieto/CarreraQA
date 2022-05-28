'''
Se preguntará el tipo de rol que desempeña una
persona en una institución por una entrada del
tipo input. Los valores posibles son “admin” o
“profesor”.
Luego si la persona es “admin” o “profesor”, se
debería pedirla contraseña, siendo la única válida
“1234” (la contraseña se toma como string). Si
la contraseña ingresada es válida, se procederá a
pedir el nombre de la persona, y si no es vacío, se
lo saludará.
Contemplar los casos donde no se cumple como
corresponde y mostrar un mensaje en pantalla.

'''


def nombre():
    nombre = input("Ingrese su nombre: ")
    while True:
        if nombre == "" or nombre.isnumeric() == True:
            print("Nombre Invalido")
            nombre = input("Ingrese su nombre: ")
        else:
            break
    return(nombre)

def contraseña():
    contraseña = input("Ingrese su contraseña: ")
    while True:
        if contraseña == "1234":
            break
        else:
            print("Contraseña Invalida")
            contraseña = input("Intenlo Nuevamente: ")
    return(contraseña)     
        
                



login = input("¿Que Rol Desempeña?: ")

while True:
    if login == "admin":
        contraseña()
        print("Bienvenido",nombre())
        break
    elif login == "profesor":
        contraseña()
        print("Bienvenido",nombre())
        break
    else:
        print("Los datos ingresados no son validos")
        print("Gracias por utilizar LOGIN")
        break
                
               
 


    