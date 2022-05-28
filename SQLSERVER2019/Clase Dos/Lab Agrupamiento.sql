-- Agrupamiento

/*
Mostrar el c�digo de subcategor�a y el
precio del producto m�s barato de cada
una de ellas.
*/

SELECT ProductSubcategoryID, MIN(ListPrice) AS PRECIO_MINIMO FROM Production.Product GROUP BY ProductSubcategoryID;

/*
Mostrar los productos y la cantidad total
vendida de cada uno de ellos.
*/

SELECT ProductID,SUM(OrderQty) AS CANTIDAD_VENDIDA FROM Sales.SalesOrderDetail GROUP BY ProductID;

/*
Mostrar los productos y el total vendido de
cada uno de ellos, ordenados por el total
vendido.
*/

SELECT ProductID,SUM(OrderQty) AS CANTIDAD_VENDIDA FROM Sales.SalesOrderDetail GROUP BY ProductID ORDER BY CANTIDAD_VENDIDA;

/*
Mostrar el promedio vendido por factura.
*/

SELECT SalesOrderID,AVG(LineTotal) AS PROMEDIO_POR_FACTURA FROM Sales.SalesOrderDetail GROUP BY SalesOrderID;

/*
Mostrar todas las facturas realizadas y
el total facturado de cada una de ellas
ordenado por n�mero de factura pero s�lo
de aquellas �rdenes superen un total de
$10.000.
*/

SELECT SalesOrderID,SUM(LineTotal) AS TOTAL_FACTURADO FROM Sales.SalesOrderDetail GROUP BY SalesOrderID HAVING SUM(LineTotal)>10000 ORDER BY SalesOrderID;


/*
Mostrar la cantidad de facturas que
vendieron m�s de 20 unidades.
*/

SELECT SalesOrderID,SUM(OrderQty) AS CANTIDAD_VENDIDA FROM Sales.SalesOrderDetail GROUP BY SalesOrderID HAVING SUM(OrderQty)>20 ORDER BY CANTIDAD_VENDIDA;

/*
Mostrar las subcategor�as de los productos
que tienen dos o m�s productos que cuestan
menos de $150.
*/

SELECT ProductSubcategoryID, COUNT(ProductSubcategoryID) AS TOTAL FROM Production.Product GROUP BY ProductSubcategoryID HAVING COUNT(ProductSubcategoryID)>2 ORDER BY TOTAL;

/*
Mostrar todos los c�digos de subcategor�as
existentes junto con la cantidad para los
productos cuyo precio de lista sea mayor a $
70 y el precio promedio sea mayor a $ 300.
*/

SELECT * FROM Production.Product;

SELECT ProductSubcategoryID,COUNT(ProductSubcategoryID) AS TOTAL, AVG(ListPrice) AS PROMEDIO FROM Production.Product WHERE ListPrice > 70 GROUP BY ProductSubcategoryID HAVING AVG(ListPrice)>300;

/*
Mostrar el n�mero de factura, el monto vendido, y al final,
totalizar la facturaci�n.
*/

SELECT SalesOrderID,SUM(UnitPrice*OrderQty) AS TOTAL FROM Sales.SalesOrderDetail GROUP BY SalesOrderID WITH ROLLUP;

