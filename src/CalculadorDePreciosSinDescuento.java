import java.util.List;

public class CalculadorDePreciosSinDescuento implements ICalculadorDePrecio {

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioTotal();
        }
        return total;
    }
}
