public class Main {
    public static void main(String[] args) {
        // Crear Proveedores
        Proveedor proveedor1 = new Proveedor("Proveedor 1");
        Proveedor proveedor2 = new Proveedor("Proveedor 2");

        // Crear Categorías
        Categoria categoriaElectronica = new Categoria("Electrónica");
        Categoria categoriaAlimenticia = new Categoria("Alimenticia");

        // Crear Productos
        Producto producto1 = new ProductoElectronico("Laptop", 1500.0, 5, proveedor1, 24);
        Producto producto2 = new ProductoAlimenticio("Leche", 15, 100, proveedor2, "31-08-2024");

        // Asignar Productos a Proveedores y Categorías
        proveedor1.agregarProducto(producto1);
        proveedor2.agregarProducto(producto2);

        categoriaElectronica.agregarProducto(producto1);
        categoriaAlimenticia.agregarProducto(producto2);

        // Crear Gestor de Inventario
        GestorDeInventario gestorDeInventario = new GestorDeInventario();
        gestorDeInventario.agregarProducto(producto1);
        gestorDeInventario.agregarProducto(producto2);

        // Crear Gestor de Descuentos
        Descuento descuento = new Descuento(10); // 10% de descuento
        GestorDeDescuentos gestorDeDescuentos = new GestorDeDescuentos(descuento);

        // Calcular el precio total con y sin descuento
        ICalculadorDePrecio calculadorSinDescuento = new CalculadorDePreciosSinDescuento();
        ICalculadorDePrecio calculadorConDescuento = new CalculadorDePrecioConDescuento(descuento);

        double precioTotalSinDescuento = gestorDeInventario.calcularPrecioTotalInventario(calculadorSinDescuento);
        double precioTotalConDescuento = gestorDeInventario.calcularPrecioTotalInventario(calculadorConDescuento);

        System.out.println("Precio total sin descuento: Q" + precioTotalSinDescuento);
        System.out.println("Precio total con descuento: Q" + precioTotalConDescuento);

        // Calcular precio total por categoría
        ICalculadorDePrecio calculadorPorCategoria = new CalculadorDePrecioPorCategoría(categoriaElectronica);
        double precioTotalElectronica = gestorDeInventario.calcularPrecioTotalInventario(calculadorPorCategoria);
        double precioTotalAlimenticia = gestorDeInventario.calcularPrecioTotalInventario(new CalculadorDePrecioPorCategoría(categoriaAlimenticia));
        System.out.println("\nPrecio total de productos electrónicos: Q" + precioTotalElectronica);
        System.out.println("Precio total de productos alimenticios: Q" + precioTotalAlimenticia);

    }
}