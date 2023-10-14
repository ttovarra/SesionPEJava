//Programa 5 captura de 3 calificaciones obtener suma y promedio, imprimir boleta
//cali1,cali2,cali2,suma,promedio
package variables;
import java.util.Scanner;

public class Calificaciones {//inicia
    
    public static void main(String[] args) {//main
        //E
    Scanner entrada=new Scanner(System.in);
    float cali1,cali2,cali3,suma,promedio;
        System.out.println("Control escolar Tovar \nCaptura Calificacion 1: ");
        cali1=entrada.nextFloat();
        System.out.println("Captura calificacion 2:  ");
        cali2=entrada.nextFloat();
        System.out.println("Captura calificacion 3:  ");
        cali3=entrada.nextFloat();
        //P
        suma=cali1+cali2+cali3;
        promedio=suma/3;
        //S
        System.out.println("Boleta de calificaciones TOVAR"
                          + "\nCalificacion 1 es : "+cali1
                          + "\nCalificacion 2 es : "+cali2
                          + "\nCalificacion 3 es : "+cali3
                          + "\nSuma de califiaciones es  :"+suma
                          + "\nPromedio final es : "+promedio);
    }//main
    
}//termina
