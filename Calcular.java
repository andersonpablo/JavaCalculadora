import java.util.Scanner;

public class Calcular {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		Operadores operadores = new Operadores();
		int valor1;
		int valor2;
		
		System.out.println("*** Calculadora certa ***");
		System.out.println("Digite o primeiro n�mero para ser calculador:");
		System.out.print("R: ");
		operadores.a = teclado.nextInt();
		System.out.println("Digite o segundo n�mero para ser calculador:");
		System.out.print("R:");
		operadores.b = teclado.nextInt();
		
		System.out.println("Qual opeara��o voc� quer realizar?");
		System.out.println("1 - Soma, 2 - Subtra��o, 3 - Multiplica��o, 4 - Divis�o");
		System.out.print("R:");
		operadores.operacao = teclado.nextInt();
		System.out.println("");
		
		if (operadores.operacao == 1){
			operadores.soma();
		}else if(operadores.operacao == 2){
			operadores.subtracao();
		}else if(operadores.operacao == 3){
			operadores.multiplicacao();
		}else if(operadores.operacao == 4){
			operadores.divisao();
        {
}

		}
		}
	}