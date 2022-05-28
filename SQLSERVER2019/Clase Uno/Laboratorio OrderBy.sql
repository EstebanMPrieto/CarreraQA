-- Order By

/*
Mostrar las personas ordenadas, primero por su
apellido y luego por su nombre.
*/

SELECT FirstName,LastName FROM Person.Person ORDER BY LastName,FirstName;

/*
Mostrar los cinco productos más caros y su nombre,
ordenados en forma alfabética.
*/

SELECT TOP 5 ListPrice,Name FROM Production.Product ORDER BY ListPrice DESC,Name;

