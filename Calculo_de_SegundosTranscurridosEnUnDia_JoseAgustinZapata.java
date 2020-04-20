// Desarrollado por:
// Jose Agustín Zapata Bejarano; Cod.1524000368
 
import java.util.Scanner; 

public class JoseAgustinZapata_AldemarSanchez_DanielAlbertoRodriguez_JulianAlbertoPimienta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner entrada = new Scanner(System.in);
				System.out.println("Ingrese horas:");
				
				int a = entrada.nextInt();
				int total_a= a*3600;
				
				System.out.println("Ingrese minutos:");
				int b = entrada.nextInt();
				int total_b= b*60;
				
				System.out.println("Ingrese segundos:");
				int c = entrada.nextInt();
				int total_c= c*1;
				
				int total = total_a + total_b + total_c;
				
				
				System.out.println("        ");
				System.out.println(" ------   Resultado   ------");
				System.out.println("Horas: " + total_a + " segundos hay en: " + a + " horas");
				System.out.println("Minutos: " + total_b + " segundos hay en: " + b + " minutos");
				System.out.println("Segundos: " + total_c + " segundos hay en: " + c + " segundos");
				System.out.println("Total segundos: " + total );
	
	
				dibujar_ASCII();
	
	}			
		
	static void dibujar_ASCII( ) {
		
		System.out.println("                ");
		System.out.println("                ");
		
		System.out.println("      Dibujo de arte ASCII:          ");
		
		System.out.println("                ");
		System.out.println("                ");
		
		System.out.println("        ._T_.         -----------   ");
		System.out.println("       -|6 6|-        |   NO    |   ");
		System.out.println("      {*(_o_)*}       | SALGAS  |   ");
	    System.out.println("        | ^ |         |   DE    |   ");
	    System.out.println("        |   |    -->  |  CASA,  |   ");
	    System.out.println("      | | | | |       |  SOLO   |   ");
	    System.out.println("     | |  _  | |      |   YO    |   ");
	    System.out.println("   (__|       |__)    |  PUEDO  |   ");
	    System.out.println("                      |_________|   ");
	}

}
