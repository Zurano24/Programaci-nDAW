import java.time.LocalDateTime;
import java.util.Scanner;
public class Actividades {
    public static void main(String[] args) {
    
    // int a=3;
    // int b=9;
    // int c=1;   

    // double delta= b*b-4*a*c;

    // if (delta<0) {
    //     System.out.println("No hay soluciones");
    // }
    // else if (delta==0) {
    //     double x1= -b/2*a;
    // }
    // else {
    //     double x1= (-b + Math.sqrt(delta))/(2*a);
    //     double x2= (-b - Math.sqrt(delta))/(2*a);
    //     System.out.println("La primera solución es: " +x1);
    //     System.out.println("La segunda solución es: " +x2);
    // }


    // int nota=2;

    // if (nota<5) {
    //     System.out.println("Suspenso");
    // }
    // else if (nota<=6) {
    //     System.out.println("Aprobado");
    // }
    //   else if (nota<=7) {
    //     System.out.println("Bien");
    // }
    //  else if (nota== 7 || nota==8) {
    //     System.out.println("Notable");
    // }
    //  else if (nota== 9 || nota==10) {
    //     System.out.println("Sobresaliente");
    // }
    // else {
    //     System.out.println("Nota incorrecta");
    // }

//     int contador=0;
//     Scanner sc= new Scanner (System.in);

//     double media=0.0;
//     int suma=0;
//     int minimo=0;
//     int maximo=0;
//     int numero=0;
//     int contAdultos=0;
//     int total=0;
//     System.out.println("Escriba sus numeros:");
//     do{
//     numero=sc.nextInt(); sc.nextLine();  
//     if (contador==0) {
//         maximo=numero;
//         minimo=numero;
//         suma=numero;
//         contador++;
//     }
//     if (numero>maximo) {
//         maximo=numero;
//     }
//     if ((numero<minimo) && (numero!=-1)) {
//         minimo=numero;
//     }
//     if (numero!=-1) {
//         suma=suma+numero;
//         total++; 
//     }
//     if (numero>=18) {
//         contAdultos++;
//     }
// }while(numero!=-1);
//     System.out.println("El máximo es:" +maximo);
//     System.out.println("El mínimo es:" +minimo);
//     System.out.println("El numero de alumnos introducidos es: " +total);
//     System.out.println("La suma de las edades es:" +suma);
//     System.out.println("El promedio de edad es:" +(suma/(double)total));
// Scanner sc= new Scanner(System.in);

// int numero = (int) (Math.random()*100 +1);
// int intento;
// int contador;

// System.out.println("Adivina el numero del 1 al 100:");

// do {
//     System.out.println("Introduce tu numero");
//     intento = sc.nextInt();
//     contador++;

//     if (intento!=numero) {
//         System.out.println("Ese número es incorrecto");
//     }
//     if (intento==numero) {
//         System.out.println("El número es Correcto");
//     }

// }



    // Buenos días, tardes, noches según la hora que sea 
    LocalDateTime hoy = LocalDateTime.now();
    System.out.println("Hora: " + hoy.getHour());

    int Hora=hoy. getHour();
    if (6<=Hora) {
        System.out.println("Buenos días");
    }
    else if (13<=Hora) {
        System.out.println("Buenas tardes");
    }
    else if (21<=Hora) {
        System.out.println("Buenas noches");
    }
    else if (0<=Hora) {
        System.out.println("Buenas noches");
}
}
}