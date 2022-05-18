package examen;

public class Exercici1 {

	public void mostrarCadena(Double[] valors) {
		System.out.print("[");
		String separador = "";
		for (int i = 0; i < valors.length; i++) {
			System.out.print(separador + valors[i]);
			separador = ", ";
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		Exercici1 p = new Exercici1();
		Double[] vector = {24.4, 2.7, 16.5, 30.8};

        Double maxNum = vector[0];

     
        for (int i = 0; i < vector.length; i++) {
			if (vector[i] > maxNum) {
				maxNum = vector[i];
			}
		}

        p.mostrarCadena(vector);
        System.out.println("El numero més gran és = " + maxNum);
	}

}
