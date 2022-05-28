--Tablas temporales

/*
Clonar estructura y datos de los campos nombre,
color y precio de lista de la tabla Production.Product
en una tabla llamada #Productos.
*/

SELECT Name,Color,ListPrice INTO #PRODUCTOS FROM Production.Product;

SELECT * FROM #PRODUCTOS;

/*
Clonar solo estructura de los campos identificador,
nombre y apellido de la tabla Person.Person en una
tabla llamada #Personas
*/

SELECT BusinessEntityID,FirstName,LastName INTO #PERSONAS FROM Person.Person;

SELECT * FROM #PERSONAS;

/*
Eliminar si existe la tabla #Productos
*/

DROP TABLE #PRODUCTOS;

/*
Eliminar si existe la tabla #Personas
*/

DROP TABLE #PERSONAS;