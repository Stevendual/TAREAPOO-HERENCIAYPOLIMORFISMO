public class ProductoElectronico extends Producto {
    private int garantia;

    // Constructor
    public ProductoElectronico(String nombre, double precio, int cantidad, Proveedor proveedor, int garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return getGarantia();
    }

    @Override
    public String getDetalles() {
        return "Producto Electrónico: " + getNombre() + " - Garantía: " + garantia + " meses";
    }

}