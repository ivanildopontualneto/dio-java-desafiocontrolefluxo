import java.util.Scanner;
import java.util.Locale;

/**
 * @author IvanildoPontualNeto
 * @version 1.0.0
 * @since 12/12/2022
 */

public class Contador {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Informe o primeiro parâmetro");
		int param1 = scanner.nextInt();
		System.out.println("Informe um segundo parâmetro.");
		int param2 = scanner.nextInt();

		try{
			contarIntervaloInteiros(param1, param2);

		}catch(ParametrosInvalidosException e){
			System.err.println("O segundo parâmetro deve ser maior do que primeiro.");
		}
	}

	static void contarIntervaloInteiros(int param1, int param2) throws ParametrosInvalidosException{

		if(param1>param2){
			throw new ParametrosInvalidosException();
		}

		int contador = param2 - param1;
		//System.out.println(contador);

		for (int i = 0; i <= contador; i++) {
			System.out.println("Imprimindo o número " + (param1) +".");
			param1++;
		}
	}

}