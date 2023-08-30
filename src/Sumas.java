import java.util.*;

public class Sumas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double suma=0;       //Definicion de variable y valor =0
        double x=20;         //Asignacion de valor a la variable x=20
        suma=suma+x;         //Suma de la variable suma=0 mas x=20
                             //Suma toma el nuevo valor de= 20
        double y=40;         //Asignacion de valor a la variable y=40
        x=x+(Math.pow(y,2)); //Se actualiza el valor de x al elevar
                             // la variable y al cuadrado y se le
                             // suma la variable x, el nuevo valor de x=1620
        System.out.println(Math.round(x));  //Se muestra el resultado de
                                            // la variable x=1620
        suma=(suma+(x/y));                  // Se actualiza la variable suma al dividir x=1620
                                            // and y=40 y se le suma la variable suma=20

        System.out.println("La suma es = "+suma);  //Se muestra el nuevo valor de suma=60.5

    }
}