/*
Mostrar el ID de los empleados que tienen más de 90 horas
de vacaciones.
Tablas: HumanResources.Employee
Campos: VacationHours, BusinessEntityID
*/

SELECT BusinessEntityID 
				FROM HumanResources.Employee 
				WHERE VacationHours > 90;


/*
Mostrar el nombre, precio de lista y precio de lista con IVA de
los productos con precio distinto de cero.
Tablas: Production.Product
Campos: Name, ListPrice
*/

SELECT Name,ListPrice, ListPrice * 1.21 AS PRECIO_CON_IVA 
			FROM Production.Product 
			WHERE ListPrice > 0;

/*
. Mostrar precio de lista y nombre de los productos 776, 777, 778
Tablas: Production.Product
Campos: ProductID, Name, ListPrice
*/

SELECT ListPrice,Name 
		FROM Production.Product 
		WHERE ProductID IN(776,777,778);


/*
Mostrar el nombre concatenado con el apellido
de las personas cuyo apellido sea Johnson.
Tablas: Person.Person
Campos: FirstName, LastName
*/

SELECT FirstName, LastName 
		FROM Person.Person
		WHERE LastName LIKE ('Johnson');


/*
Mostrar todos los productos cuyo precio de lista
sea inferior a $150 de color rojo o cuyo precio
de lista sea mayor a $500 de color negro.
Tablas: Production.Product
Campos: ProductID, ListPrice, Color

*/

SELECT ProductID,ListPrice,Color 
		FROM Production.Product
		WHERE ListPrice < 150 AND Color = 'Red' OR ListPrice > 500 AND Color = 'Black'
		ORDER BY Color;

/*
Mostrar el ID, fecha de ingreso y horas de
vacaciones de los empleados que ingresaron a
partir del año 2000.
Tablas: HumanResources.Employee
Campos: BusinessEntityID, HireDate, VacationHours
*/

SELECT BusinessEntityID,HireDate,VacationHours 
		FROM HumanResources.Employee
		WHERE HireDate > '01-01-2000'
		ORDER BY HireDate;

/*
Mostrar el nombre, número de
producto, precio de lista y el precio de
lista incrementado en un 10% de los
productos cuya fecha de fin de venta
sea anterior al día de hoy.
Tablas: Production.Product
Campos: Name, ProductNumber, ListPrice,
SellEndDate
*/

SELECT Name,ProductNumber,ListPrice,SellEndDate, ListPrice * 1.1 AS PRECIO_MAS_10PORCINTO 
		FROM Production.Product
		WHERE SellEndDate < '04-28-2022' ;


/*
Mostrar los representantes de ventas (vendedores) que no
tienen definido el número de territorio.
Tablas: Sales.SalesPerson
Campos: BusinessEntityID, TerritoryID

*/

SELECT BusinessEntityID, TerritoryID 
		FROM Sales.SalesPerson
		WHERE TerritoryID IS NOT NULL;

/*
Mostrar el peso de todos los artículos. Si el peso no estuviese
definido, reemplazar por cero.
Tablas: Production.Product
Campos: ProductID, Weight
*/

SELECT ProductID,ISNULL(Weight,0) AS PESO 
		FROM Production.Product
		ORDER BY Weight DESC;

