package jetaKrasniqi2;

public class Klasa_testuese {

	public static void main(String[] args) {
		int[][] matricaA = TestMatrixAdvanced.vargu_dydimendsional(3, 4);
		int[][] matricaB = TestMatrixAdvanced.vargu_dydimendsional(4, 3);
		System.out.println("Matrica A:");
		for (int[] rresht : matricaB) {
		    for (int element : rresht) {
		        System.out.print(element + " ");
		    }
		    System.out.println(); 
		    }
		System.out.println("Matrica B:");
		for (int[] rresht : matricaA) {
		    for (int element : rresht) {
		        System.out.print(element + " ");
		    }
		    System.out.println(); 
		    }
		int[][] matrica_e_transponuar = Veprime_me_matrica.matrica_e_transponuar(matricaA);
		System.out.println("Matrica A e transponuar:");
		for (int[] rresht : matrica_e_transponuar) {
		    for (int element : rresht) {
		        System.out.print(element + " ");
		    }
		    System.out.println(); 
		    }
		int [][] matrica_e_shumezuar = Veprime_me_matrica.matrica_e_shumezuar(matricaA, matricaB);
		System.out.println("Shumezimi i matricave A dhe B:");
		for (int[] rresht : matrica_e_shumezuar) {
		    for (int element : rresht) {
		        System.out.print(element + " ");
		    }
		    System.out.println(); 
		    } 
	}

}
