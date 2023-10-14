//Programa 1 declaracion y clasificacion de variables 
//Variable (un espacio asignado en memoria) por su tipo de datos (entero int, decimal float, cadena String )
package variables;


public class DeclaracionVariables {//inicia programa
    
    public static void main(String[] args) {//inicia main (compilar 110100), (ejecutar elaborar un programa)
        //entrada
        System.out.println("Declaracion de variables\n----------------------\n");//imprimir, visualizar, consultar resultado, datos 
        int numeroEntero=1234;//declaracion de una varaible tipo entero inicializada
        float numeroDecimal=10.1f;//declaracion de una variables tipo decimal punto flotante
        String cadenaCaracteres="Mtro SI y TI Hildeberto Tovar Moreño";
        
        //Proceso
        
        //salida          concatenacion: union elemento programable   "+"
        System.out.println("Salida Valores de Variables\n"
                           +"Variable entera es : "+numeroEntero
                           +"\nVariable decimal es : "+numeroDecimal
                           +"\nVariable Cadena es : "+cadenaCaracteres);
        
    }//termina main
    
}//termina programa
