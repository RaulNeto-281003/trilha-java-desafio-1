import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Por favor, digite o número da agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = Double.parseDouble(sc.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
