package JuegosMatematicos;
import java.util.Scanner;


public class Quizz {
private static void delaySegundos() {
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {}
}

public static void main(String[] args) {
	int minutos = 0;
	int segundos = 0;
	int Dificultad;
int Respuesta;
int Vidas = 3;
String respuesta;
Scanner entrada = new Scanner(System.in);
Scanner Respuesta1 = new Scanner(System.in);
Scanner Respuesta2 = new Scanner(System.in);
Scanner  Respuesta3 = new Scanner(System.in);




System.out.println("-----------------------------------");
System.out.println("Bienvenido al Quizz de  Ecuaciones Matematicas");
System.out.println("-----------------------------------\n");


System.out.println("Seleccione el nivel de dificultad: ");
System.out.println("\n1: Normal \n2: Avanzado\n");
Dificultad = entrada.nextInt();
switch(Dificultad) {
case 1:
System.out.println("\nPregunta Numero 1 ");

System.out.println("¿Cuanto es 3 + 3 / 3?");
Respuesta = Respuesta1.nextInt();
if(Respuesta == 4 && Vidas>0) {

System.out.println("Respuesta correcta");

System.out.println("\nPregunta Numero 2 ");

System.out.println("¿Cuanto es el 25% de 40?");
Respuesta = Respuesta1.nextInt();
if(Respuesta == 10 && Vidas>0) {

System.out.println("\nPregunta número 3");
System.out.println("\n¿Como se denomina, una recta y un plano con ningun punto común?");
respuesta = Respuesta2.nextLine();
if(respuesta.equalsIgnoreCase("Paralelos") && Vidas>0) {

System.out.println("\nPregunta número 4");
System.out.println("\n¿Cual es el valor de la potencia del exponente cero?");
Respuesta = Respuesta1.nextInt();
if(Respuesta == 1 && Vidas>0) {

System.out.println("\nPregunta número 5");
System.out.println("\nLos triangulos cuyos  lados  tienen la misma medida son:");
String [] Arreglo = new String [10];
Arreglo [0] = "(A) Isoceles";
Arreglo [1] = "(B) Fraccion";
Arreglo [2] = "(C) Equilatero";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);

respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("C") && Vidas>0) {

System.out.println("\n Pregunta Numero 6");
System.out.println("Uno de los Elementos de la potenciacion es: ");
Arreglo [0] = "(A) Raiz";
Arreglo [1] = "(B) Base";
Arreglo [2] = "(C) Diferencia";
Arreglo [3] = "(D) Divisor";
System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);


respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("B") && Vidas>0) {

System.out.println("\n Pregunta Numero 7");
System.out.println("El conjunto de los numeros reales esta formado por los numeros:");
Arreglo [0] = "(A) Complementarios";
Arreglo [1] = "(B) Racionales e Irracionales";
Arreglo [2] = "(C) Impares";
Arreglo [3] = "(D) Pares";
System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);


respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("B")&& Vidas>0) {

System.out.println("\n Pregunta Numero 8");
System.out.println("\n La propiedad conmutativa de la multiplicacion nos dice:");
Arreglo [0] = "(A) El orden de los sumandos no altera el resultado ";
Arreglo [1] = "(B) El orden de los factores no altera el Producto ";
Arreglo [2] = "(C) El orden de los factores multiplica el producto ";
Arreglo [3] = "(D) El orden de los Factores se le suma al producto ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("B") && Vidas>0) {

System.out.println("\n Pregunta Numero 9");
System.out.println("\n Es una ecuacion:");
Arreglo [0] = "(A) Es una igualdad donde la cual conoce todos sus terminos ";
Arreglo [1] = "(B) Es una igualdad en la cual se desconoce un valor llamado incognita ";
Arreglo [2] = "(C) Es una desigualdad en la cual se desconoce un valor llamado incognita ";
Arreglo [3] = "(D) Es una proporcion en la cual se desconoce un valor llamado incognita ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);
respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("B") && Vidas>0) {

System.out.println("\n Pregunta Numero 10");
System.out.println("\n En estadistica el concepto de mediana es:");
Arreglo [0] = "(A) Es la medida de tendencia central en el punto medio de un grupo de datos ordenados ";
Arreglo [1] = "(B) Es una medida de tendencia central que se encuentra en el punto derecho de un grupo de datos ordenados ";
Arreglo [2] = "(C) Es una medida de tendencia central que se encuentra en el punto izquierdo de un grupo de datos ordenados ";
Arreglo [3] = "(D) Es una medida de tendencia central que se encuentra en el punto de los extremos de un grupo de datos ordenados ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("B")&& Vidas>0) {
System.out.println("Felicidades has completado el Quizz\n");
System.out.println("Tus vidas son: " + Vidas + " Tu puntuacion fue de:" +  " 5.0");

}
}else {
System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}

}else {
System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}


}else {
System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");

}
}else {
System.out.println("X\nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}
}else {
System.out.println("X\nRespuesta Erronea \n" + Vidas + " Vidas restantes ");

}
}else {
System.out.println("\nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}

}else {
System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}
}else {
Vidas-=1;
System.out.println("Respuesta Erronea \n" + Vidas +  " Vidas restantes ");
}
}else {
System.out.println("Respuesta Erronea \n" + Vidas +  " Vidas restantes ");
}
break;







case 2:

System.out.println("Pregunta N1\n");
System.out.println("¿Cual es el valor de PI:\n");
String [] Arreglo = new String[4];

Arreglo[0]= "(A) 3.14 ";
Arreglo[1]= "(B) 14.3 ";
Arreglo[2]= "(C) 48.14";
Arreglo[3]= "(D) 3.15 ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("A")&& Vidas >0) {
System.out.println(" Respuesta correcta\n ");

System.out.println(" Pregunta N2 \n");
System.out.println(" Los elementos de una proporcion son :\n ");

Arreglo[0]= "(A) Cociente ";
Arreglo[1]= "(B) Numero ";
Arreglo[2]= "(C) Medios y extremos ";
Arreglo[3]= "(D) Numerador ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);
respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("C")&& Vidas >0) {
System.out.println(" Respuesta correcta ");

System.out.println(" Pregunta N3 \n ");
System.out.println(" Unos de los metodos de solucion de un sistema de ecuaciones lineales con 2 incognita es:\n ");

Arreglo[0]= "(A) Cociente ";
Arreglo[1]= "(B) Sustitucion ";
Arreglo[2]= "(C) Potencia";
Arreglo[3]= "(D) Base ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);
respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("B")&& Vidas >0) {
System.out.println(" Respuesta correcta \n");
System.out.println(" Pregunta N3 \n");
System.out.println(" En estadistica las frecuencias son: ");

Arreglo[0]= "(A) Supuesto ";
Arreglo[1]= "(B) Agudos ";
Arreglo[2]= "(C) Absolutas";
Arreglo[3]= "(D) Suplementarias ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("C") && Vidas>0) {
System.out.println(" Respuesta correcta \n");
System.out.println(" Pregunta N4 \n ");
System.out.println(" En Matematicas Financiera es el interes \n ");

Arreglo[0]= "(A) Utilidad que se obtiene al prestar un determinado Capital ";
Arreglo[1]= "(B) Es el tiempo que se obtiene por prestar un determinado Capital ";
Arreglo[2]= "(C) Es la suma que se obtiene por prestar un determinado Capital";
Arreglo[3]= "(D) Es la funcion que se obtiene por prestar un determinado Capital ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("A") && Vidas>0) {
System.out.println(" Respuesta correcta \n ");
System.out.println(" Pregunta N5 \n");
System.out.println(" Que son angulos opuestos por el Vertice");


Arreglo[0]= "(A) Son aquellos que se encuentran dentro del vertice que los forma  ";
Arreglo[1]= "(B) Son aquellos que se encuentran a cada lado del vertice que los forma  ";
Arreglo[2]= "(C) Son aquellos que se encuentran fuera del vertice que los forma  ";
Arreglo[3]= "(D) Son aquellos que se encuentran lejos del vertice que los forma  ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();

if(respuesta.equalsIgnoreCase("B") && Vidas>0) {
System.out.println(" Respuesta correcta \n ");
System.out.println(" Pregunta N6 \n");

System.out.println("En estadistica que se entiende por Moda");

Arreglo[0]= "(A) Es la medida de tendencia central formada por el dato de menor frecuencia o que menos se repite  ";
Arreglo[1]= "(B) Es la medida de tendencia central formada por el dato de poca frecuencia o que mas se repite ";
Arreglo[2]= "(C) Es la medida de tendencia central formada por el dato de mayor frecuencia o que mas se repite   ";
Arreglo[3]= "(D) Es la medida de tendencia central formada por los extremos de los datos  ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);
respuesta = Respuesta3.nextLine();

if(respuesta.equalsIgnoreCase("C") && Vidas>0) {
System.out.println(" Respuesta correcta \n ");
System.out.println(" Pregunta N7  \n");
System.out.println(" Si los lados de un triangulo miden 11 cm, 18 cm, y 20 cm, entonces el número de centimetros que se debe restar a cada uno de sus  lados para que resulte un triangulo rectangulo es \n ");

Arreglo[0]= "(A) 7 ";
Arreglo[1]= "(B) 4 ";
Arreglo[2]= "(C) 5  ";
Arreglo[3]= "(D) 3  ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();

if(respuesta.equals("D") && Vidas>0) {
System.out.println(" Respuesta correcta \n ");
System.out.println(" Pregunta N8  \n");
System.out.println("El valor de  K en la Ecuacion 3x^2 - 2Kx + 25 = 0 Teniendo en cuenta que una de sus raices es igual a 5 es:");

Arreglo[0]= "(A) 20 ";
Arreglo[1]= "(B) 12 ";
Arreglo[2]= "(C) 10  ";
Arreglo[3]= "(D) -40  ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();

if(respuesta.equals("C") && Vidas>0) {
System.out.println(" Respuesta correcta \n ");
System.out.println(" Pregunta N9  \n");
System.out.println(" Cuantos numeros de 3 cifras se pueden formar con los digitos  0,1,2,3 si el ultimo numero debe ser 0 y un numero digito no se puede repetir al formar cada numero");


Arreglo[0]= "(A) 20 ";
Arreglo[1]= "(B) 30 ";
Arreglo[2]= "(C) 18  ";
Arreglo[3]= "(D) 4  ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("C") && Vidas>0) {


System.out.println(" Pregunta N10  \n");
System.out.println("Cual es la probabilidad que al tirar dos dados el resultado sea un numero primo");


Arreglo[0]= "(A) 5% ";
Arreglo[1]= "(B) 75% ";
Arreglo[2]= "(C) 42%  ";
Arreglo[3]= "(D) 15%  ";

System.out.println(Arreglo[0]);
System.out.println(Arreglo[1]);
System.out.println(Arreglo[2]);
System.out.println(Arreglo[3]);

respuesta = Respuesta3.nextLine();
if(respuesta.equalsIgnoreCase("C")&& Vidas>0) {
System.out.println("Felicidades has completado el Quizz ");
}
}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}
}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}
}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}


}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}
}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}

}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}

}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}

}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}

}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}








}else {
	System.out.println("X \nRespuesta Erronea \n" + Vidas + " Vidas restantes ");
}


}
}

}
