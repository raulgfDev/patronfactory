package familiafacturas;

public abstract class Factura {

    private double importe;

    public abstract double getConIVA();

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
