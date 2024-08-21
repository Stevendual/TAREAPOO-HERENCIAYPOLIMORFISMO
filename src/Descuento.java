public class Descuento{
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double total) {
        if (total > 0 && porcentaje >= 0 && porcentaje <= 100) {
            return total * (porcentaje / 100);
        } else {
            return 0;
        }
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public double getDescuento() {
        return porcentaje / 100;
    }
}
