package familiafacturas;

public class FacturaLujo extends Factura{

    @Override
    public double getConIVA() {
        return this.getImporte() * 1.28;
    }
}
