// imprimir 20 primeiros numeros da sequencia fibonacci
public class ImprimeSequenciaFibonacci {

	public static void main(String[] args) {

		int primeiroNumero = 0;
		int segundoNumero = 1;
		int resultado = 0;
		
		int contador = 1; 

		System.out.println(contador + " = " + primeiroNumero);
		contador++;

		for (int numero = 0; numero <= 19; numero++) {


			if (numero == 1) {
				resultado = primeiroNumero + segundoNumero;
				
			} else {
				primeiroNumero = segundoNumero;
				segundoNumero = resultado;

				resultado = primeiroNumero + segundoNumero;

				System.out.println(contador + " = " + resultado);
				contador ++; 
				
			}

		}
	}

}
