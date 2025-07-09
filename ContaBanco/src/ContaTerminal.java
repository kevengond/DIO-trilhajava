public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        String Agencia = "067-9",  nome;
        int numero;
        float saldo;

        java.util.Scanner leitor = new java.util.Scanner(System.in);
        
        System.out.println("Por favor, digite o numero da conta:");
        numero = leitor.nextInt();
        System.out.println("Por favor, digite o nome do cliente:");
        leitor.nextLine(); 
        nome = leitor.nextLine();
        System.out.println("Por favor, digite o saldo da conta:");
        saldo = leitor.nextFloat();

        System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco, sua agencia é [%s] conta [%d] e seu saldo [%f]\n", nome, Agencia, numero, saldo);


    }
}
