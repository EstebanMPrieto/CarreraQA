-- Laboratorio de Recuperacion de Datos.

/*
Mostrar los diferentes productos vendidos.
*/

SELECT DISTINCT ProductID FROM Sales.SalesOrderDetail;

/*
Mostrar todos los productos vendidos y ordenados
*/

SELECT ProductID FROM Sales.SalesOrderDetail
UNION ALL
SELECT ProductID FROM Production.WorkOrder
ORDER BY ProductID;


/*
SELECT DISTINCT ProductID FROM Sales.SalesOrderDetail
*/

SELECT ProductID FROM Sales.SalesOrderDetail
UNION
SELECT ProductID FROM Production.WorkOrder
ORDER BY ProductID;

/*
Obtener el id y una columna denominada sexo cuyo valores disponibles sean “Masculino” y ”Femenino”
*/

SELECT 
CASE WHEN Gender = 'M' THEN 'MASCULINO' 
ELSE 'FEMENINO' 
END AS GENERO
FROM HumanResources.Employee;

/*
Mostrar el id de los empleados si tiene salario deberá mostrarse descendente de lo contrario ascendente
*/

SELECT BusinessEntityID,SalariedFlag FROM HumanResources.Employee 
ORDER BY 
CASE SalariedFlag WHEN 1
THEN BusinessEntityID END DESC;