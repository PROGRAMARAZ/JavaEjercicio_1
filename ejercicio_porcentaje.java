// El siguiente programa muestra un m�todo que, 
// dados dos valores dinero y p, calcula el p % de dinero:


public class ejercicio_porcentaje {

	public static void main(String[] args) {
		
			    System.out.println("El 10% de 5000 es: " + porcentaje(5000, 10));
			    System.out.println("El 150% de 5000 es: " + porcentaje(2000*2+1000, 100+50));
			    
			    double valor = 5000;
			    double porciento = 30;
			    
			    System.out.println("El 30% de 5000 es: " + porcentaje(valor, porciento));
			 }
			 
			 static double porcentaje(double dinero, double p){
			    return dinero * p / 100;  
			 }
			}
