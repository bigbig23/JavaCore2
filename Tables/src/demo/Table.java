package demo;

public class Table {
	
	public void tableaux(int[] tab) {
		afficher(tab);
		operation1(tab);
		operation2(tab);
		operation3(tab);
		operation4(tab);
		operation5(tab);
 
	}


	//affichage du plus grand élément du tableau.
	public void operation5(int[] table) {
		int max = table[0];
		for(int i = 0;i<table.length;i++) {
			if(table[i] > max) {
				max = table[i];
			}
		}
		System.out.println("le plus grand numero est : " +max);
	}
	
	

	//affichage de la moyenne arithmétique de tous les d'éléments du tableau. La moyenne arithmétique est
	//la somme de tous les éléments divisé par le nombre
	//d'éléments. Faites attention à afficher le résultat sous forme de double.
	public void operation4(int[] table) {
		 double moyenne,somme =0.0;
		 for(int i = 0;i<table.length;i++) {
			 somme+=table[i];
			}
		 moyenne = somme/table.length;
		 System.out.println("la moyenne est : " + moyenne);
 	}
	
	//affichage de la somme de tous les éléments du tableau.
	public void operation3(int[] table) {
		int sum = 0;
		for(int i = 0;i<table.length;i++) {
			sum+=table[i];
		}
		System.out.println("le plus grand numero est : " +sum);
	}
	
	
	//affichage du nombre d'éléments qui sont plus grands que 4 ou plus petits que 2.
	public void operation2(int[] table) {
		int sum = 0;
		for(int i = 0;i<table.length;i++) {
			 if(table[i] >= 4 || table[i] <= 2) {
				 sum ++;
			 }
		}
		System.out.println("Y a " +sum+" plus grand que 4 et moins grand que 2");
	}
	
	
	//calcule et affiche le nombre d'éléments de valeur 9.
	public void operation1(int[] table) {
		int n=0;
		for(int i = 0;i<table.length;i++) {
			if(table[i]==9) {
				n++;
			}
		}
		System.out.println("Y a  : " +n +"d'éléments de valeur 9. ");
	}

		
	
	//afficher la table
	public void afficher(int[] table) {
 		for(int i = 0;i<table.length;i++) {
 			System.out.print(table[i]+" ");
		}
 		System.out.println();
	}
	
	
	
	//remplir1. Les éléments sont initialisés en ordre croissant de 0 à 4. Ensuite, la méthode auxiliaire tableaux 
	//est appelée pour effectuer les mêmes opérations sur ce deuxième
	public int[] remplir1(int tab) {
		int[] t = new int[tab];
		for(int i=0;i<t.length;i++) {
			t[i]+=i;
		}
		return t;	
	}
	
	//remplissage du tableau en ordre croissant à partir de 5.
	public int[] remplir2(int tab) {
		int[] t = new int[tab];
		for(int i=0;i<t.length;i++) {
			t[i]+=i+5;
		}
		return t;	
	}
	
	
	//remplissage du tableau en ordre décroissant de nb à 1 où nb est le nombre d'éléments du tableau.
	public int[] remplir3(int tab) {
		int[] t = new int[tab];
		for(int i=0;i<t.length;i++) {
			t[i]+=t.length-i;
		}
		return t;	
	}
	
	

}
