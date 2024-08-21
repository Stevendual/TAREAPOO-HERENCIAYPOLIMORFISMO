import java.util.List;

public class GestorDeDescuentos {
    private Descuento descuento;

    public GestorDeDescuentos(Descuento descuento) {
        this.descuento = descuento;
    }

    public double aplicarDescuento(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioTotal();
        }
        return total - descuento.aplicarDescuento(total);
    }
}
