package demo;

import java.util.Random;

public class EssaiAnimal {
	
	//static java.util.Random alea = new java.util.Random();
	static Random alea = new Random();

	static Animal tirage() { 
		
		return (Math.abs(alea.nextInt()) % 2 == 0 ? new Oiseau() : new Chat());
	
		//another solution
		//return rn.nextInt() %2==0? new Oiseau(): new Chat();
	}
	
	public static void main(String[] args) {
		
	tirage().action();
 

}}
