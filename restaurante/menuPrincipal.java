import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menuPrincipal{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opciones = 0;
        String nombre;
        Double valorCompra;

        // sistema de registro de compras
        do {
            System.out.println("****************************************");
            System.out.println("----------------------------------------");
            System.out.println("------------Hola Bienvenido!------------");
            System.out.println("----------------------------------------");
            System.out.println("-> Presiona opcion(1) si desea registrar su compra.");
            System.out.println("-> Presiona opcion(0) si desea salir del sistema.");
            System.out.print("=> ");
            opciones = Integer.parseInt(br.readLine());
            System.out.println("----------------------------------------");
            System.out.println("****************************************");

            if (opciones == 1) {
                System.out.println("----------------------------------------");
                System.out.println("--------------Menú Opciónes-------------");
                System.out.println("----------------------------------------");
                System.out.print("-> Por favor ingrese su nombre: => ");
                nombre = br.readLine();
                System.out.println();
                System.out.print("-> Ahora, ingrese el valor de su compra: => ");
                valorCompra = Double.parseDouble(br.readLine());
                System.out.println("----------------------------------------");
                
                if (nombre != null && valorCompra != null ) {
                    generarFactura f = new generarFactura(valorCompra);
                    System.out.println("****************************************");
                    System.out.println("----------------Factura-----------------");
                    System.out.println("........................................");
                    System.out.println("---> Nombre del cliente: " + nombre);
                    System.out.println("---> Valor de la compra: $" + valorCompra);
                    System.out.println("---> Descuento del " + f.descuentoPorcentaje + "% = $" + f.valorDescuento);
                    System.out.println("---> Iva %19: " + f.ivaFinal);
                    System.out.println("---> Subtotal sin iva: $" + f.subTotal);
                    System.out.println("---> Total a pagar: $" + f.totalAPagar);
                    System.out.println("----------------------------------------");
                    System.out.println("<-------GRACIAS POR SU COMPRA-----------");
                    System.out.println("****************************************");  
                } 
            } else if (opciones == 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("-> ....Saliendo................................");
                System.out.println("-----------------------------------------------");
            }else{
                System.out.println("-----------------------------------------------");
                System.out.println("-> Opción incorrecta: Ingresa una opción valida.");
                System.out.println("-----------------------------------------------");
            }
        } while (opciones != 0);

    }
}
