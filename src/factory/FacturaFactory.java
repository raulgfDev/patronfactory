package factory;

import familiafacturas.Factura;
import familiafacturas.FacturaGeneral;
import familiafacturas.FacturaReducida;
import familiafacturas.FacturaSuperReducida;

public class FacturaFactory {

    public static Factura getFactura(TipoFactura tipoFactura){

        if (tipoFactura.toString().equals("GENERAL")) return new FacturaGeneral();
        else if(tipoFactura.toString().equals("REDUCIDA"))return new FacturaReducida();
        return new FacturaSuperReducida();
    }
}
