-- Desafio Clase Dos

/*
Informe todos los cargos (de los empleados) existentes,
ordenados alfab�ticamente.	
*/

SELECT DISTINCT JobTitle FROM HumanResources.Employee ORDER BY JobTitle;

/*
Genere una lista completa y �nica de los c�digos de moneda
(contemple [Sales].[Currency] y [Sales].[CountryRegionCurrency])
*/

SELECT CurrencyCode FROM SALES.Currency
UNION
SELECT CurrencyCode FROM Sales.CountryRegionCurrency;

/*
Totalizar las ventas a la fecha (YTD) de US, por regi�n
*/

SELECT Name,SUM(SalesYTD) AS TOTAL FROM Sales.SalesTerritory WHERE CountryRegionCode = 'US' GROUP BY Name;

/*
 Recupere los productos sin �rdenes
*/

SELECT ProductID FROM Production.Product 
EXCEPT
SELECT ProductID
FROM Production.WorkOrder;

/*
A las vtas. a la fecha de Estados Unidos (por regi�n) del punto 1,
agr�guele el total gral.
*/

SELECT Name,SUM(SalesYTD) AS TOTAL FROM Sales.SalesTerritory WHERE CountryRegionCode = 'US' GROUP BY Name WITH ROLLUP;