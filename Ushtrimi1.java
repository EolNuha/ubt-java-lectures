import java.util.Scanner;
public class Ushtrimi1{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Shtyp madhesine e vargut se paku 5: "); //5, 6, 7, 8
		int madhesia = scan.nextInt();
		
		while(madhesia < 5){
			System.out.print("Shtyp perseri madhesine e vargut se paku 5: ");
			madhesia = scan.nextInt();
		}
		
		int [] vargu = new int[madhesia];
		for(int i = 0;i < vargu.length;i++){
			System.out.print("Shtyp nje numer: ");
			vargu[i] = scan.nextInt();
		}
		
		int[] rez = findNumbers(vargu); // {1,5,9}
		int numriPare = rez[0]; // 1
		int numriTrete = rez[1]; // 5
		int numriFundit = rez[2]; // 9
		
		System.out.println("Jane shtypur gjithsej "+vargu.length+" numra, numri i pare "+numriPare+", numri i tret "+numriTrete+", numri i fundit "+numriFundit);
	}
	
	public static int[] findNumbers(int [] vargu){ // {1,5,5,7,8,9}
		int nr1 = 0; //1
		int nr3 = 0; //5
		int nrF = 0; //9
		
		// for loop - Punon me pozita(i)
		for(int i = 0;i < vargu.length;i++){
			if(i == 0){
				nr1 = vargu[i];
			}
			if(i == 2){
				nr3 = vargu[i];
			}
			if(i == vargu.length-1){
				nrF = vargu[i];
			}
		}
		
		int [] arrayToReturn = new int[3]; // {1,5,9}
		arrayToReturn[0] = nr1;
		arrayToReturn[1] = nr3;
		arrayToReturn[2] = nrF;
		
		return arrayToReturn;
	}
}