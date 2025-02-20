package controleDeFluxo;

import java.util.Scanner;
import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); 
        }

        sc.close(); 
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) { 
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        	int cont = parametroDois - parametroUm;
        	for (int i = 1; i <= cont; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
