package examen;

public class Exercici2 {
	
	public static void main(String[] args) {
		
		int minNum = 10;
		int maxNum = 100;
		
		for (int i = 1; i < maxNum; i++) {

			int result = i * i;
			if (result < maxNum && result > minNum) {
				System.out.print(result + " ");
			}
		}
		
	}
}