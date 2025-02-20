import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.print("Digite o numero da conta:");
        int numero = sc.nextInt();
        System.out.print("Digite o numero da agência:");
        String agencia = sc.next();
        System.out.println("Qual saldo inicial?");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero+ " e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
    }
}
