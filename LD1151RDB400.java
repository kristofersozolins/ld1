import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LD1151RDB400 {
	
	/*
	 * Kristofers Ozoliņš
	 * 4.grupa IT
	 * 151RDB400
	 * 
	 * 4
	 * 00 piemērs
	 *
	 */

	public static void main(String[] args) {
		
		System.out.println("Izveidoja Kristofers Ozoliņš, 4.grupa IT, 151RDB400");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double x = 0,y = 0;
		
		try {
			
			System.out.print("x: ");
			String inputX = reader.readLine();
			x = Double.parseDouble(inputX);
			
			System.out.print("y: ");
			String inputY = reader.readLine();
			y = Double.parseDouble(inputY);
			
			
		} catch (NumberFormatException e) {
			System.out.println("KĻŪDA - Netika ievadīts reāls skaitlis!");
			return;
		} catch (Exception e){
			System.out.println("Kļūda datu ievadē");
			return;
		}
		
		if(irZils(x,y)){
			System.out.println("Zils");
		}else 
		if(irZals(x,y)){
			System.out.println("Zaļš");
		}else
		if(irSarkans(x,y)){
			System.out.println("Sarkans");
		}else{
			System.out.println("Balts");
		}
		
	}
	
	private static boolean irZils(double x, double y){
		
		if( x >= 1 && x <= 6 && y <= (x+3) && y >= 4 ){
			return true;
		}
		
		if( x >= 8 && x <= 13 && y <= (17-x) && y >= 4 ){
			return true;
		}
		
		if( y <= (x+5) && y <= (19-x) && y >= 11 ){
			return true;
		}
		
		return false;
	}
	
	private static boolean irSarkans(double x, double y){
		
		if( x >= 3 && x <= 4 && y <= 8 && y >= (x+3) ){
			return true;
		}
		
		if( x >= 6 && x <= 8 && y >= 3 && y <= 11 ){
			return true;
		}
		
		if( x >= 10 && x<= 11 && y <= 8 && y >= (19-x) ){
			return true;
		}
		
		return false;
	}
	
	private static boolean irZals(double x, double y){
		
		double rinkis1 = Math.pow((x - 3.5), 2) + Math.pow((y - 8), 2);
		double rinkis2 = Math.pow((x - 10.5), 2) + Math.pow((y - 8), 2);
		
		if( y >= 8 && rinkis1 <= 0.25){
			return true;
		}
		
		if( y >= 8 && rinkis2 <= 0.25 ){
			return true;
		}
		
		return false;
	}

}
