--Relacionando Conjuntos de Datos

/*
Mostrar los empleados que también son vendedores.
*/

SELECT * FROM HumanResources.Employee H 
			JOIN Person.Person AS P 
			ON H.BusinessEntityID=P.BusinessEntityID;

/*
Mostrar los empleados ordenados alfabéticamente por
apellido y por nombre.
*/

SELECT P.LastName,P.FirstName 
			FROM HumanResources.Employee H 
			JOIN Person.Person AS P 
			ON H.BusinessEntityID=P.BusinessEntityID 
			ORDER BY P.LastName;

/*
Mostrar el código de logueo, código de territorio y sueldo
básico de los vendedores.
*/

SELECT H.LoginID,S.TerritoryID,S.SalesQuota 
			FROM HumanResources.Employee AS H 
			JOIN Sales.SalesPerson AS S 
			ON H.BusinessEntityID=H.BusinessEntityID 
			AND S.SalesQuota IS NOT NULL;

/*
Mostrar los productos que sean ruedas.
*/

SELECT * FROM Production.Product AS P 
			JOIN Production.ProductSubcategory AS PS 
			ON P.ProductSubcategoryID=PS.ProductCategoryID 
			WHERE PS.Name = 'WHEELS';

/*
Mostrar los nombres de los productos que no son bicicletas.
*/

SELECT P.Name,P.ProductSubcategoryID 
			FROM Production.Product AS P 
			JOIN Production.ProductSubcategory AS PS 
			ON P.ProductSubcategoryID=PS.ProductCategoryID 
			WHERE PS.Name NOT LIKE '%Bikes';

SELECT * FROM Production.ProductSubcategory;

/*
Mostrar los precios de venta de aquellos productos donde
el precio de venta sea inferior al precio de lista recomendado
para ese producto ordenados por nombre de producto.
*/

SELECT P.Name,S.UnitPrice,P.ListPrice 
			FROM Sales.SalesOrderDetail S 
			JOIN Production.Product P 
			ON S.ProductID=P.ProductID 
			WHERE P.ListPrice>S.UnitPrice;

/*
Mostrar todos los productos que tengan igual precio. Se
deben mostrar de a pares, código y nombre de cada uno de
los dos productos y el precio de ambos. Ordenar por precio
en forma descendente.
*/

SELECT P1.ProductID,P1.Name,P1.ListPrice 
			FROM Production.Product AS P1 
			JOIN Production.Product AS P2 
			ON P1.ListPrice=P2.ListPrice 
			ORDER BY P1.ListPrice DESC;

/*
Mostrar el nombre de los productos y de los proveedores cuya subcategoría es 13 ordenados por nombre de proveedor 
*/

SELECT P.Name,PV.Name 
			FROM Production.Product AS P 
			JOIN Purchasing.ProductVendor AS V 
			ON P.ProductID=V.ProductID 
			JOIN Purchasing.Vendor PV 
			ON V.BusinessEntityID=PV.BusinessEntityID 
			WHERE P.ProductSubcategoryID=13;


/*
Mostrar el nombre de los productos y de los proveedores
cuya subcategoría es 15 ordenados por nombre de
proveedor.
*/

SELECT P.Name,PV.Name FROM Production.Product P 
			JOIN Purchasing.ProductVendor PP 
			ON P.ProductID=PP.ProductID
			JOIN Purchasing.Vendor PV
			ON PP.BusinessEntityID=PV.BusinessEntityID
			WHERE P.ProductSubcategoryID=15
			ORDER BY PV.Name;

/*
Mostrar todas las personas (nombre y apellido) y en el caso
que sean empleados mostrar también el login id, sino mostrar
null.
*/

SELECT PP.FirstName,PP.LastName,HE.LoginID 
			FROM Person.Person PP 
			LEFT JOIN HumanResources.Employee HE 
			ON PP.BusinessEntityID=HE.BusinessEntityID;

