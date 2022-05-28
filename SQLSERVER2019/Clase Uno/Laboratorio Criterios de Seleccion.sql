
--Criterios de Seleccion.

/*
 Mostrar el ID de los empleados que tienen más de 90 horas
de vacaciones.
*/

SELECT BusinessEntityID FROM HumanResources.Employee
				WHERE VacationHours < 90;

/*
Mostrar el nombre, precio de lista y precio de lista con IVA de
los productos con precio distinto de cero.
*/

SELECT Name,ListPrice,ListPrice * 1.21 AS "Precio Con IVA" FROM Production.Product 
				WHERE ListPrice > 0;

/*
Mostrar precio de lista y nombre de los productos 776, 777, 778
*/

SELECT ListPrice, Name FROM Production.Product 
				WHERE ProductID IN ('776','777','778');

/*
Mostrar el nombre concatenado con el apellido
de las personas cuyo apellido sea Johnson.
*/

SELECT CONCAT(FirstName,' ',LastName) AS 'Nombre y Apellido' 
					FROM Person.Person 
					WHERE LastName LIKE 'Johnson';


/*
Mostrar todos los productos cuyo precio de lista
sea inferior a $150 de color rojo o cuyo precio
de lista sea mayor a $500 de color negro.
*/

SELECT * FROM Production.Product 
			WHERE ListPrice < 150 AND Color = 'Red' OR ListPrice > 500 AND Color = 'Black';

/*
Mostrar el ID, fecha de ingreso y horas de
vacaciones de los empleados que ingresaron a
partir del año 2000.

*/

SELECT BusinessEntityID,HireDate,VacationHours FROM HumanResources.Employee 
						WHERE HireDate > '2000/01/01';

/*
Mostrar el nombre, número de
producto, precio de lista y el precio de
lista incrementado en un 10% de los
productos cuya fecha de fin de venta
sea anterior al día de hoy.

*/

SELECT Name,ProductNumber,ListPrice,ListPrice * 1.10 AS "PrecLista Mas 10%"  FROM Production.Product WHERE SellEndDate < '2022/09/05';

/*
Mostrar los representantes de ventas (vendedores) que no
tienen definido el número de territorio.

*/

SELECT * FROM Sales.SalesPerson WHERE TerritoryID IS NULL;

/*
Mostrar el peso de todos los artículos. Si el peso no estuviese
definido, reemplazar por cero.
*/

SELECT 
	CASE WHEN Weight IS NULL THEN 0 
	ELSE Weight 
	END PESO 
	FROM Production.Product;



