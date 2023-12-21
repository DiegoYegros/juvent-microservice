IF NOT EXISTS (
    SELECT name
FROM master.dbo.sysdatabases
WHERE name = N'juvent'
)
CREATE DATABASE juvent;
GO

USE juvent;
GO

IF OBJECT_ID('dbo.alumno', 'U') IS NOT NULL
    DROP TABLE dbo.alumno;
GO

IF OBJECT_ID('dbo.persona', 'U') IS NOT NULL
    DROP TABLE dbo.persona;
GO

CREATE TABLE persona
(
    id INT IDENTITY(1,1) PRIMARY KEY,
    cedula INT UNIQUE NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    celular INT,
    correo_electronico VARCHAR(255)
);
GO

CREATE TABLE alumno
(
    id INT IDENTITY(1,1) PRIMARY KEY,
    alumno_ci INT UNIQUE,
    FOREIGN KEY (alumno_ci) REFERENCES persona(cedula)
);
GO
