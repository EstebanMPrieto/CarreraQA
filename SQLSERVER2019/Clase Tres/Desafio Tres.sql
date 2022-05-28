--DESAFIO

/*
Liste los apellidos y nombres de los representantes de ventas,
en orden alfabético por apellido.
*/

SELECT PP.LastName,PP.FirstName 
		FROM HumanResources.Employee HE 
		JOIN Person.Person PP 
		ON HE.BusinessEntityID=PP.BusinessEntityID 
		WHERE HE.JobTitle='Sales Representative' 
		ORDER BY PP.LastName;

/*
Genere una lista de contactos y calcule cuántos hay de c/u,
ordenados desde los más numerosos a los menos numerosos.
*/

SELECT PC.ContactTypeID,PC.Name AS ContactTypeName,COUNT(*) AS Numero_Contactos FROM Person.BusinessEntityContact BC
		JOIN Person.ContactType PC
		ON BC.ContactTypeID=PC.ContactTypeID
		GROUP BY PC.ContactTypeID,PC.Name
		ORDER BY COUNT(*) DESC;

/*
Restrinja la lista del Lab anterior, sólo a aquellos contactos con
más de 100 ocurrencias.
*/

SELECT PC.ContactTypeID,PC.Name AS ContactTypeName,COUNT(*) AS Numero_Contactos FROM Person.BusinessEntityContact BC
		JOIN Person.ContactType PC
		ON BC.ContactTypeID=PC.ContactTypeID
		GROUP BY PC.ContactTypeID,PC.Name
		HAVING COUNT(*)>100
		ORDER BY COUNT(*);

/*
 Liste los nombres de los productos, junto a las reseñas que puedan tener.
*/

SELECT PP.Name,PR.Comments 
		FROM Production.Product PP 
		JOIN Production.ProductReview PR 
		ON PP.ProductID=PR.ProductID;

/*
Determine si el código de producto 718 tiene ventas con precio
menor al de lista.
*/
SELECT DISTINCT p.Name Producto, p.ListPrice Precio, sd.UnitPrice 'Precio Vta'
		FROM Sales.SalesOrderDetail AS sd
		JOIN Production.Product AS p ON sd.ProductID = p.ProductID
		AND sd.UnitPrice < p.ListPrice
		WHERE p.ProductID = 718;
