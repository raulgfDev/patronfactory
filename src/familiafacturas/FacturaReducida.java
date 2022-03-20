package familiafacturas;

public class FacturaReducida extends Factura{

    @Override
    public double getConIVA() {
        return this.getImporte() * 1.10;
    }
}
