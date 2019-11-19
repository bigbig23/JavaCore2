package demo;

public class App {

	public static void main(String[] args) {
 
		
		//Un tableau tab est construit et rempli de 10 valeurs. Le tableau est ensuite envoyé en
		//paramètre à la méthode auxiliaire tableaux qui, à son tour, appelle 6 méthodes
		//auxiliaires en leur envoyant le même tableau en paramètre
		//Un deuxième tableau tab1 est construit par l'intermédiaire de la méthode auxiliaire
		
		
		Table table = new Table();
		
		int[] tab = {3,7,1,9,2,8,9,1,2,5};
		table.tableaux(tab);
		System.out.println();
		 int[] tab1 = table.remplir1(5);
		 table.tableaux(tab1);
		System.out.println();
		 
		 int[] tab2 = table.remplir2(10);
		 table.tableaux(tab1);
		 

		 
		 int[] tab3 = table.remplir3(5);
		 table.tableaux(tab3);
		
 
		
	}

}
