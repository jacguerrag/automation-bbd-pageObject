Feature: Carrito de Compras
	Scenario: Suma total correcta al agregar multiples productos
		Given el usuario esta en la pagina de productos
		When el usuario agrega el producto "Producto A" al carrito
		And el usuario agrega el producto "Producto B" al carrito
		And el usuario navega a la pagina del carrito
		Then el total en el carrito debe ser la suma de los precios de los productos agregados
		