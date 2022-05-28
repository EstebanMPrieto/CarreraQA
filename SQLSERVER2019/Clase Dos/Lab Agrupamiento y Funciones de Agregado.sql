-- Agrupamiento y Funciones de Agregado.

/*
Mostrar la fecha más reciente de venta.
*/

SELECT MAX(OrderDate) AS "ULTIMA VENTA" FROM SALES.SalesOrderHeader;


/*
Mostrar el precio más barato de todas
las bicicletas.
*/

SELECT MIN(ListPrice) AS "Bicicleta+Barata" FROM Production.Product WHERE Name LIKE '%Bike' AND ListPrice IS NOT NULL;

/*
Mostrar la fecha de nacimiento del
empleado más joven.
*/

SELECT MAX(BirthDate) AS "EMPLEADO MAS JOVEN" FROM HumanResources.Employee;

/*
Mostrar el promedio del listado de precios de productos
*/

SELECT AVG(ListPrice) AS "PROMEDIO DE PRECIOS" FROM Production.Product;

/*
Mostrar la cantidad de ventas y el
total vendido.
*/
SELECT	COUNT(OrderQty)	AS Cantidad, SUM(OrderQty) AS Total FROM Sales.SalesOrderDetail;
