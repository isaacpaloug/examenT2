package examen;


public class Exercici3 {
	public void mostrarCadena(int[] valors) {
		System.out.print("[");
		String separador = "";
		for (int i = 0; i < valors.length; i++) {
			System.out.print(separador + valors[i]);
			separador = ", ";
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		Exercici3 p = new Exercici3();
		int[] vector = {3, 5, 12, 7, 8, 9, 21, 12, 129};
		p.mostrarCadena(vector);
		int maxNum = vector[0];
		int minNum = vector[0];
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > maxNum) {
				maxNum = vector[i];
			}
			if (vector[i] < minNum) {
				minNum = vector[i];
			}
			
		}
		System.out.println("El numero més gran és: " + maxNum);
		System.out.println("El numero més petit és: " + minNum);
	}
}
