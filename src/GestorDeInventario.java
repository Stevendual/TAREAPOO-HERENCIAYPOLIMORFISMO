import java.util.ArrayList;
import java.util.List;

public class GestorDeInventario {

    private List<Producto> productos;

    public GestorDeInventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularPrecioTotalInventario(ICalculadorDePrecio calculador) {
        return calculador.calcularPrecioTotal(productos);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}


