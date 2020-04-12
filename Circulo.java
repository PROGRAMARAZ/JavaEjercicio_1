//  Programa que calcula el área y el perímetro de un círculo a partir de su radio:


import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo:");
        
        double radio = entrada.nextDouble();
        double area = calcularÁrea(radio);
        double perímetro = calcularPerímetro(radio);
        
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perímetro);
  }
  
  static double calcularÁrea(double radio){
        double area = Math.PI *radio * radio;
        return area;
  }
  
  static double calcularPerímetro(double radio){
        double perímetro = 2 * Math.PI * radio;
        return perímetro;
  }
}
		

