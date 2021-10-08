import javax.swing.JOptionPane;

public class ImprimeQuantidadeEspecifica {
	public static void main(String[] args) {
		int numeroDigitado = Integer
				.parseInt(JOptionPane.showInputDialog("Digite quantos numeros da sequencia fibonnaci devem aparecer"));
		int primeiroNumero = 0;
		int segundoNumero = 1;
		int resultado = 0;

		int contador = 1;

		if (numeroDigitado == 0) {
			System.out.println("Este não é um numero valido");

		} else {	
			
			System.out.println(contador + " = " + primeiroNumero);
			contador++;

			for (int numero = 0; numero < numeroDigitado; numero++){
				
				if (numeroDigitado == 1) {
					break;
				}

				if (numero == 1) {
					resultado = primeiroNumero + segundoNumero;

				} else {
					primeiroNumero = segundoNumero;
					segundoNumero = resultado;

					resultado = primeiroNumero + segundoNumero;

					System.out.println(contador + " = " + resultado);
					contador++;

				}
			}
		}
	}
}
