import java.util.List;


public class CalculadorDePrecioConDescuento implements ICalculadorDePrecio {
    private Descuento descuento;

    public CalculadorDePrecioConDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioTotal();
        }
        return total - descuento.aplicarDescuento(total);

    }
}
