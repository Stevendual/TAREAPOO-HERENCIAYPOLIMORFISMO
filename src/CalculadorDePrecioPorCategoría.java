import java.util.List;

public class CalculadorDePrecioPorCategoría implements ICalculadorDePrecio {
    private Categoria categoria;

    public CalculadorDePrecioPorCategoría(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : categoria.getProductos()) {
            total += producto.calcularPrecioTotal();
        }
        return total;
    }
}
