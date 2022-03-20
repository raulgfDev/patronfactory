package factory;

import familiafacturas.*;

public class FacturaFactory {

    public static Factura getFactura(TipoFactura tipoFactura){

        if (tipoFactura.toString().equals("GENERAL")) return new FacturaGeneral();
        else if(tipoFactura.toString().equals("REDUCIDA"))return new FacturaReducida();
        else if(tipoFactura.toString().equals("LUJO")) return new FacturaLujo();
        return new FacturaSuperReducida();
    }
}
