CREATE TABLE Clientes(
    identificacion varchar(15) PRIMARY KEY,
    nombres varchar(20),
    apellidos varchar(20)
);

CREATE TABLE Marcas (
	codigoMarca INTEGER,
	nombre TEXT(10),
	CONSTRAINT Marcas_PK PRIMARY KEY (codigoMarca)
);

CREATE TABLE Ventas (
	codigoVenta TEXT(5),
	total REAL,
	idCliente TEXT(15),
	CONSTRAINT Ventas_PK PRIMARY KEY (codigoVenta),
	CONSTRAINT Ventas_FK FOREIGN KEY (idCliente) REFERENCES Clientes(identificacion)
);

CREATE TABLE Productos (
	codigoBarras INTEGER,
	nombre TEXTO(10),
	precio REAL,
	talla TEXT(4),
	color TEXT(10),
	idMarca INTEGER,
	CONSTRAINT Productos_PK PRIMARY KEY (codigoBarras),
	CONSTRAINT MarcaProducto_FK FOREIGN KEY (idMarca) REFERENCES Marcas(codigoMarca)
);


CREATE TABLE ventasProductos (
	idVentasProductos INTEGER,
	cantidad INTEGER,
	idProducto INTEGER,
	idVenta TEXT(5),
	CONSTRAINT ventasProductos_PK PRIMARY KEY (idVentasProductos),
	CONSTRAINT ventasProductos_FK FOREIGN KEY (idVenta) REFERENCES Ventas(codigoVenta),
	CONSTRAINT ventasProductos_FK_1 FOREIGN KEY (idProducto) REFERENCES Productos(codigoBarras)
);