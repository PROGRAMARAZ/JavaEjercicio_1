//  Programa que calcula el �rea y el per�metro de un c�rculo a partir de su radio:


import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del c�rculo:");
        
        double radio = entrada.nextDouble();
        double area = calcular�rea(radio);
        double per�metro = calcularPer�metro(radio);
        
        System.out.println("�rea: " + area);
        System.out.println("Per�metro: " + per�metro);
  }
  
  static double calcular�rea(double radio){
        double area = Math.PI *radio * radio;
        return area;
  }
  
  static double calcularPer�metro(double radio){
        double per�metro = 2 * Math.PI * radio;
        return per�metro;
  }
}
		

