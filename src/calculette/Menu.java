package calculette;

import java.util.Scanner;
/* 	Calcul monCalc = new Calcul(1, 4);
System.out.println(monCalc.addition());   uitlisation ac constructeur  */
public class Menu {

	public static void main(String[] args) {
		
		// affichage des choix possibles
		System.out.println("Pour effectuer une addition tapez 1"	);
		System.out.println("Pour effectuer une soustraction tapez 2");
		System.out.println("Pour effectuer une multiplication tapez 3");
		System.out.println("Pour effectuer une division tapez 4" );
		
		System.out.println("Votre temps d'attente est estimé à 10 mn" );
		
		//récupération entrée clavier 
		Scanner choix = new Scanner(System.in);
		System.out.println("Veuillez prendre une décision :");
		int saisieU = choix.nextInt();
		System.out.println("Saississez votre premier nombre :");
		int nb1 = choix.nextInt();
		System.out.println("Saississez votre second nombre :");
		int nb2 = choix.nextInt();
		
		switch (saisieU) {
		case 1:
		    System.out.println("Addition : ");		   
		
			System.out.println(Calcul.addition(nb1,nb2));
		    break;
		case 2:
		    System.out.println("Soustraction :");
		
			System.out.println(Calcul.soustraction(nb1,nb2));
		    break;
		case 3:
		    System.out.println("Multiplication " );
	
			System.out.println(Calcul.multiplication(nb1,nb2));
		    break;
		case 4:
		    System.out.println("Division :  ");
		
			System.out.println(Calcul.division(nb1,nb2));
		    break;
		}
		
		
		
		
		
		//System.out.println(Calcul.addition(2, 7));
		//System.out.println(Calcul.soustraction(12,5));
		

		
	}

}
