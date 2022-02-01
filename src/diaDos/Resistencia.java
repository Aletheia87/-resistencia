package diaDos;

import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
			Scanner sc= new Scanner (System.in);
		float resUno;
		float resDos;
		float resTres;
		float resTotal;
			System.out.println("Por favor tenga en cuenta que los valores solicitados sean mayores a cero");
			System.out.println("Ingrese resistencia 1:");
			resUno = Float.parseFloat (sc.nextLine());
			if (resUno> 0) {
				System.out.println("Ingrese resistencia 2:");
		}else{
		System.out.println("Error");}
		resDos = Float.parseFloat (sc.nextLine());
		if (resDos> 0) {
			System.out.println("Ingrese resistencia 3:");
		}else{
			System.out.println("Error");}
		resTres = Float.parseFloat (sc.nextLine());
		if (resTres> 0) {
			resTotal = 1/ (1/resUno + 1/resDos + 1/resTres);
			System.out.println("La resistencia total es de " + resTotal);
		}else{
			System.out.println("Error");
			}

			
			sc.close();
		}
	}
		
	
