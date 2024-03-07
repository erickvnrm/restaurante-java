public class generarFactura {
    Double descuentoPorcentaje, valorDescuento, totalAPagar, subTotal, ivaFinal;
    Double iva = 0.19;
    // Genero la factura, sugun el valor de compra que llega como parametro
    public generarFactura(Double valorCompra){
        descuentoPorcentaje = calcularDescuentos(valorCompra);
        valorDescuento = valorCompra * descuentoPorcentaje;
        ivaFinal = valorCompra * iva;
        subTotal = valorCompra;
        totalAPagar = (subTotal - valorDescuento) + ivaFinal;
    }

    // Calculo y retorno el descuento, en base al valor de la compra 
    public Double calcularDescuentos(Double valorCompra){
        if (valorCompra >= 200000) {
            descuentoPorcentaje = 0.15;
        } else if(valorCompra >= 50000){
            descuentoPorcentaje = 0.02;
        }else if(valorCompra >= 20000){
            descuentoPorcentaje =  0.015;
        }else{
            descuentoPorcentaje = 0.0;
        }
        return descuentoPorcentaje;
    }
}
