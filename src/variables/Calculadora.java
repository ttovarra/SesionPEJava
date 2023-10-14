//Programa 4 calculadora operaciones matematicas basicas con valores decimal capturados
package variables;
import java.util.Scanner;

public class Calculadora {//Inicia programa
    
    public static void main(String[] args) {//inicia main
        //entrada declaracion de variables y entrada de datos 
    Scanner entradaDato=new Scanner(System.in);
    float num1,num2,rs,rr,rm,rd;//variables indefinidas porque esperan valor
        System.out.println("Calculadora Tovar Matematicas\n Captura numero 1: ");
        num1=entradaDato.nextFloat();//guarda valor numero 1 capturado
        System.out.println("Captura numero 2 : ");
        num2=entradaDato.nextFloat();//guarda valor numero 2 capturado
        //proceso 
         rs=num1+num2;//suma
         rr=num1-num2;//resta
         rm=num1*num2;//multi
         rd=num1/num2;//divi
        //salida
        System.out.println("Resultados de Calculadora TOVAR"
                         +"\nSuma es : "+rs+"\nResta es : "+rr+"\nMulti es : "+rm+"\nDivi es : "+rd);
        
    }//termina main
    
}//termina programa
