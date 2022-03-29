package familiafacturas;

public class FacturaSuperLujo extends Factura{

    @Override
    public double getConIVA() {
        return this.getImporte() * 1.33;
    }
}
