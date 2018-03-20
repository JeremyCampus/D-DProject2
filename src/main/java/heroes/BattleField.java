package main.java.heroes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;


class BattleField {

	static List<Character> listeHeroes = new ArrayList<Character>();
	// static Object listeHeroes[] = new warr() ;
	
	public BattleField(){
		// for (Guerrier heroes : listeHeroes) {   
		// 	heroes = new Guerrier("Guerrier du Nord");
		// }	
	}
		
	public void newCharacter(){
	}

	public static void clearZone()
	{
		System.out.print("\033[H\033[2J");  //CLEAR TERMINAL
		System.out.flush();					//CLEAR TERMINAL
	}

	public static void main(String[] args) {
		creationALaChaine();
		Scanner sc = new Scanner(System.in);
		boolean quitter = false;	
		clearZone();		  
			do{
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("_____________________________________________________________________");
				System.out.println("|||||||||||||||||||||| QUE VOULEZ VOUS FAIRE ? ||||||||||||||||||||||");
				System.out.println("_____________________________________________________________________");
				System.out.println("---");
				System.out.println("Creer un/des personnages ? = 1");
				System.out.println("Afficher la liste des personnages ? = 2");
				System.out.println("Menu de gestion des personnages ? = 3");
				System.out.println("Afficher un tableau de 5 objet ? = 4");
				System.out.println("Quitter = 5");
				System.out.println("---");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				String str2 = sc.nextLine();
				clearZone();
				System.out.println("_____________________________________________________________________");
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("_____________________________________________________________________");
				switch (str2)
				{
					case "1":
						Character myHero = null;
						String vocation = "";
						System.out.println("Guerrier(1) ou Mage(2) ?");
						vocation = sc.nextLine();

						String myName ="";
						System.out.println("Quel est son nom ?");
						myName = sc.nextLine();

						String newImage ="X";

						int newLife =1;
						System.out.println("Quel est votre life ?");
						newLife = sc.nextInt();

						int newStrenght = 1;
						System.out.println("Quel est votre Strenght ?");
						newStrenght = sc.nextInt();	

						if(vocation == "1"){
							myHero = new Guerrier(myName, newImage, newLife, newStrenght);
						}else{
							myHero = new Mage(myName, newImage, newLife, newStrenght);
						}
						listeHeroes.add(myHero);
						break;        
					case "2":
						for(int i = 0; i < listeHeroes.size(); i++){
							System.out.println("");
							System.out.println("");
							System.out.println("Voici le hero : " + listeHeroes.get(i).getName());
							listeHeroes.get(i).afficher();
						}			  
						break;        
					case "3":
						// myHero.attaquer();			  
						break;        
					case "4":
					creationALaChaine();
						;
						break;       
					case "5":
						quitter = true;
						break;   
					default:
						System.out.println("Erreur");
						break;        
				}
			}while(quitter != true);
		System.out.println("___________________Merci d'avoir joué (^_^)_______________________");



	}

	

//-------------------------AFFICHER TEMPORAIRE
		public static void creationALaChaine(){
			Guerrier[] tableauGuerrier = new Guerrier[6];

			Guerrier myHero = new Guerrier("Guerrier n1 pour la competence");
			Guerrier myHero2 = new Guerrier("Guerrier n2 pour la competence");
			Guerrier myHero3 = new Guerrier("Guerrier n3 pour la competence");
			Guerrier myHero4 = new Guerrier("Guerrier n4 pour la competence");
			Guerrier myHero5 = new Guerrier("Guerrier n5 pour la competence");
			tableauGuerrier[0]=myHero;
			tableauGuerrier[1]=myHero2;
			tableauGuerrier[2]=myHero3;
			tableauGuerrier[3]=myHero4;
			tableauGuerrier[4]=myHero4;
			System.out.println("Voici le hero : " + tableauGuerrier[0].getName());
			System.out.println("Voici le hero : " + tableauGuerrier[1].getName());
			System.out.println("Voici le hero : " + tableauGuerrier[2].getName());
			System.out.println("Voici le hero : " + tableauGuerrier[3].getName());
			System.out.println("Voici le hero : " + tableauGuerrier[4].getName());

		}


//-------------------------CREATION PERSONNAGE OLD
	public static void createCharacter()
	{
		Character heroes = new Character();
		
	// myHero.mettreAJour();

		boolean exitTotal = false;			  
		do{
	// 		System.out.println("-BATTLEFIELD-");
	// 		System.out.println("Guerrier, ou Mage ?");
	// 		System.out.println("Guerrier = 1 |  Mage = 2");
	// 		Scanner sc = new Scanner(System.in);
	// 		System.out.println("Veuillez saisir une valeur :");
	// 		int str = sc.nextInt();
	// 		Character myHero = null;
			
	// 		if(str!=1 && str!=2)
	// 		{			
	// 			System.out.println("Vous avez saisi : " + str + " C'est incorrecte");
	// 		}else {			
	// 			if(str==1)
	// 			{			
	// 				myHero = new Guerrier("Guerrier du Nord");
	// 			}else if(str==2)
	// 			{			
	// 				myHero = new Mage("Mage de l'Ouest");
	// 			} 
				
	// 			myHero.afficher();
	// 			boolean exit = false;			  

	// 			do{
	// 				myHero.mettreAJour();
	// 				System.out.println("");
	// 				System.out.println("");
	// 				System.out.println("");
	// 				System.out.println("_____________________________________________________________________");
	// 				System.out.println("|||||||||||||||||||||| QUE VOULEZ VOUS FAIRE ? ||||||||||||||||||||||");
	// 				System.out.println("_____________________________________________________________________");
	// 				System.out.println("---");
	// 				System.out.println("Afficher votre personnage ? = 1");
	// 				System.out.println("Modifier les infos de votre personnage? = 2");
	// 				System.out.println("Attaquer ? = 3");
	// 				System.out.println("Ajouter une arme ou un sort?  = 4");
	// 				System.out.println("Faire la saisie de plusieurs personnages  = 5");
	// 				System.out.println("Quitter  = 6");
	// 				System.out.println("---");
	// 				System.out.println("");
	// 				System.out.println("");
	// 				System.out.println("");
	// 				System.out.println("");
	// 				System.out.println("");
	// 				String str2 = sc.nextLine();
	// 				System.out.println("_____________________________________________________________________");
	// 				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	// 				System.out.println("_____________________________________________________________________");
	// 				switch (str2)
	// 				{
	// 					case "1":
	// 						myHero.afficher();			  
	// 						break;        
	// 					case "2":
	// 						myHero.modifier();			  
	// 						break;        
	// 					case "3":
	// 						myHero.attaquer();			  
	// 						break;        
	// 					case "4":
	// 						myHero.ajouterArmeSpell();			  
	// 						break;        
	// 					case "5":
	// 						exit = true;
	// 						break; 
	// 					case "6":
	// 						exit = true;
	// 						exitTotal = true;		  
	// 						break;        
	// 					default:
	// 				System.out.println("Erreur");
	// 						break;        
	// 				}
	// 			}while(exit != true);
			// }
		}while(exitTotal != true);
	}
}