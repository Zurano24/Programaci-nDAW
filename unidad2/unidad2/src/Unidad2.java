import java.util.Scanner;

import Utilidades.Matemáticas;

import java.time.LocalDateTime;

public class Unidad2 {
    public static void main(String[] args) {

        // System.out.println("Hola mundo");
        // System.out.println((1 + 2 + 3) / 3);
        // System.out.println((1 + 2 + 3) / 3.0);

        // // Clase 2;
        // // Ejemplo de introducir un valor por teclado;
        // int numero;
        // Scanner sc = new Scanner(System.in);

        // // Ejemplo de pedir un numero y mostrarlo;
        // System.out.println("Introduce un numero entre 5 y 25");
        // numero = Integer.parseInt(sc.nextLine());

        // System.out.println("Introduce tu nombre:");
        // String nombre = sc.nextLine();

        // System.out.println("El numero introducido es: " + numero + " y tu nombre es: " + nombre);

        // System.out.println("Introduce tu apellido:");
        // String apellido = sc.nextLine();

        // System.out.println("Tu apellido es: " + apellido);

        // LocalDateTime hoy = LocalDateTime.now();

        // System.out.println("Hoy es: " + hoy.getDayOfWeek());
        // System.out.println("El día es: " + hoy.getDayOfMonth());
        // System.out.println("El mes es: " + hoy.getMonth());
        // System.out.println("El año es: " + hoy.getYear());
        // System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

        // int max = 15;
        // int min = 1;
        // int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        // System.out.println(aleatorio);

        // // CLASE 3
        // // Utilizar las funciones sumar y multiplicar de la clase Matemáticas
        // // int numero1=3;
        // // int numero2=5;
        // // System.out.println("La suma es:" +Matemáticas.sumar(numero1, numero2));
        // // System.out.println("La multiplicación es:" +Matemáticas.multiplicar(numero1, numero2));

        //  System.out.println("El resto de la division 5-2 es;"+(5%2));
        //  int variable=2;
        //  System.out.println("La variable vale " +variable);
        //  variable--;
        //  System.out.println("La variable vale " +variable);

        //  int valor1=3;
        //  int valor2=5;
        //  valor1+=valor2;//valor1=valor1+valor2

        // // Condiciones IF-ELSE
        // int numero2=3;
        // int numero3=5;
        // int resultado;

        // if (numero>numero2) {
        //     // Si se cumple hará esto
        //     resultado=numero2+numero3;
        // }
        // else{
        //     // Si no se cumple hará esto
        //     resultado=numero2-numero3;
        // }
        // System.out.println(numero2+" "+numero3+" "+resultado);
        
        // //Usando el operador ternario
        // resultado=(numero2>numero3)? numero2+numero3:numero-numero2;
        // System.out.println(numero2+" "+numero3+" "+resultado);
        // System.out.println("POR AQUÍ VOY");
    
        //Práctica dias de la semana
        int dia=5;
        if (dia==1) {
           System.out.println("Es lunes");
        }  
        else if (dia==2) {
           System.out.println("Es martes");
        }  
        else if (dia==3) {
           System.out.println("Es miércoles");
        }
        else if (dia==4) {
           System.out.println("Es jueves");
        }
        else if (dia==5) {
           System.out.println("Es viernes");
        }
        else if (dia==6) {
           System.out.println("Es sábado");
        }
        else {
           System.out.println("Es domingo");
        }

        //divisible
        int numero=3;
        if (numero % 2 == 0 && numero % 3 == 0 ) {
            System.out.println("El número es divisible entre 2 y 3");
        }
        else
            System.out.println("El número no es divisible entre 2 y 3");


    }   
}



