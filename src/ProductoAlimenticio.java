class ProductoAlimenticio extends Producto {
    private String fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, String fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return "Producto Alimenticio: " + getNombre() + " - Fecha de Caducidad: " + fechaDeCaducidad;
    }
}