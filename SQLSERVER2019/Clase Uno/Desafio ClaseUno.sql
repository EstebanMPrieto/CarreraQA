-- Desafio Clase1

/*
. Recupere los diferentes tipos de contactos que son managers,
ordenados alfabéticamente por nombre de z ? a.
*/

SELECT * FROM Person.ContactType WHERE Name LIKE '%Manager' ORDER BY Name DESC;


/*
Recupere los datos indicados en el ejemplo de resultado anterior, de los
empleados con cargo de Gerente de Marketing o Senior Tool Designer.
*/

SELECT * FROM Person.ContactType WHERE Name LIKE 'Marketing Manager' OR Name LIKE 'Senior Tool Designer';

/*
Recuperar datos de los productos con color y tamaño
informado, según el ejemplo:
*/

SELECT Name,Size,Color FROM Production.Product WHERE Size IN ('58','M','L','S') AND Color IN('BLACK','RED','WHITE','MULTI') ORDER BY Size;
/*. Liste datos de la facturación de los meses de 06/2011 y
07/2011, respetando la salida de ejemplo:*/SELECT SalesOrderID,OrderDate,TotalDue FROM SALES.SalesOrderHeader WHERE OrderDate BETWEEN '2011/06/01' AND '2011/07/31';/*A los datos de la facturación de los meses de 06/2011 y 07/2011, obtenidos
agréguele el cálculo de 21% de IVA.*/SELECT SalesOrderID,OrderDate,TotalDue, (TotalDue * 21)/100 AS "IVA" FROM SALES.SalesOrderHeader WHERE OrderDate BETWEEN '2011/06/01' AND '2011/07/31';



