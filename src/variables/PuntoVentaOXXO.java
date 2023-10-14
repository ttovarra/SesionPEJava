//Programa 2 Punto de venta tienda OXXO con nombre producto, precio y cantidad calcular venta
//venta=precio * cantidad 
//Programa 3. A el programa anterior Punto de venta se necesita capturar por teclado sus datos 
package variables;
//libreria es el conjunto de instrucciones predefinidas a utilizarse en un programa
import java.util.Scanner;//permite la entrada de los datos por medio de un Scanner
public class PuntoVentaOXXO {//inicia clase
    
    public static void main(String[] args) {//inicia main
   //entrada  declaracion de variables
  /*
  String nombreProd="Doritos";//variable inicializada lleva valor de tipo cadena
  float precio=12.5f;//variable inicializada lleva valor de tipo decimal
  int cantidad=100;//variable inicializada lleva valor de tipo entero
  */
  Scanner entradaCualquierDato=new Scanner(System.in);//genera un objeto para guardar un valor
  String nombreProd;//variable indefinida espera un valor de tipo cadena
  float precio;//variable indefinida espera un valor de tipo de decimal
  int cantidad;//variable indefinida espera un valor de tipo entero
        System.out.println("Punto venta OXXO Tovar \n Captura nombre producto: ");
        nombreProd=entradaCualquierDato.nextLine();//guarda el nombre del producto
        System.out.println("Captura precio producto: ");//guarda el precio en decimal
        precio=entradaCualquierDato.nextFloat();
        System.out.println("Captura cantidad : ");//guarda cantidad en entero
        cantidad=entradaCualquierDato.nextInt();
   //proceso  calculos, operaciones
   float venta=precio*cantidad;
   //salida   resultado final de los datos   imprimir ticket
        System.out.println("Punto venta Tienda OXXO Tovar"
                          +"\n-----------------------------"
                          +"\nProducto vendido es : "+nombreProd
                          +"\nPrecio de venta : "+precio
                          +"\nCantidad solitada : "+cantidad
                          +"\n-----------------------------"
                          +"\nVENTA TOTAL ES : "+venta  );
    }//termina  main
}//termina clase
