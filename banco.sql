CREATE DATABASE Banco;
USE Banco;

CREATE TABLE Clientes(
	id INT PRIMARY KEY NOT NULL auto_increment,
    nombres VARCHAR(100),
    apellidoPaterno VARCHAR(50),
    apellidoMaterno VARCHAR(50),
    fechaNacimiento DATE,
    edad int,
    contraseña VARCHAR(100)
);

DELIMITER //
CREATE TRIGGER calcularEdad
BEFORE INSERT ON Clientes
FOR EACH ROW
BEGIN
    SET NEW.edad = TIMESTAMPDIFF(YEAR, NEW.FechaNacimiento, CURDATE());
END;
//
DELIMITER ;

CREATE EVENT actualizarEdadDiaria ON SCHEDULE EVERY 1 DAY
STARTS CURRENT_TIMESTAMP
DO UPDATE Clientes SET edad = TIMESTAMPDIFF(YEAR, FechaNacimiento, CURDATE());

CREATE TABLE Domicilios(
	codigo INT PRIMARY KEY NOT NULL auto_increment,
    calle VARCHAR(100),
    codigoPostal VARCHAR(30),
    noExterior int, 
    Colonia VARCHAR(50),
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES Clientes (id)
);

CREATE TABLE Cuentas(
	numeroCuenta INT PRIMARY KEY NOT NULL auto_increment,
    fechaApertura DATE,
    saldo DECIMAL(10,2),
    id INT,
    FOREIGN KEY (id) REFERENCES Clientes (id)
);

CREATE TABLE Operaciones(
	folio INT PRIMARY KEY NOT NULL auto_increment,
    fechaOperacion DATE,
    tipoOperacion VARCHAR(50),
    cuentaOrigen INT,
    cuentaDestino INT,
    monto DECIMAL(10,2),
    id INT,
    numeroCuenta INT,
    FOREIGN KEY (id) REFERENCES Clientes (id),
    FOREIGN KEY (numeroCuenta) REFERENCES Cuentas (numeroCuenta)
);