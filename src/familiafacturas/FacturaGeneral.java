package familiafacturas;

public class FacturaGeneral extends Factura{

    @Override
    public double getConIVA() {
        return this.getImporte() * 1.21;
    }
}
