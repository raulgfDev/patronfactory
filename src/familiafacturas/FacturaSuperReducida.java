package familiafacturas;

public class FacturaSuperReducida extends Factura{

    @Override
    public double getConIVA() {
        return this.getImporte() * 1.04;
    }

}
