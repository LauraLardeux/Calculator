package calculette;

import java.util.Scanner;

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
		System.out.println("Veuillez saisir un nombre :");
		int saisieU = choix.nextInt();
		System.out.println("Vous avez saisi le nombre : " + saisieU);
		
		Calcul monCalc = new Calcul(1, 4);
		System.out.println(monCalc.addition());
		
		System.out.println(Calcul.addition(2, 7));
		

		// appel des différentes fonctions suivant le choix 
	}

}
