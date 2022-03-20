import factory.FacturaFactory;
import factory.TipoFactura;
import familiafacturas.Factura;

public class Main {

    public static void main(String[] args) {

        Factura facturaUno = FacturaFactory.getFactura(TipoFactura.GENERAL);
        Factura facturaDos = FacturaFactory.getFactura(TipoFactura.REDUCIDA);
        Factura facturaTres = FacturaFactory.getFactura(TipoFactura.SUPER_REDUCIDA);
        Factura facturaCuatro = FacturaFactory.getFactura(TipoFactura.LUJO);

        facturaUno.setImporte(100);
        facturaDos.setImporte(100);
        facturaTres.setImporte(100);
        facturaCuatro.setImporte(100);

        System.out.println(facturaUno.getConIVA());
        System.out.println(facturaDos.getConIVA());
        System.out.println(facturaTres.getConIVA());
        System.out.println(facturaCuatro.getConIVA());
    }
}
