
public class Main {

	public static void main(String[] args) {
		Cliente michelle = new Cliente();
		michelle.setNome("Venilton");
		
		Conta cc = new ContaCorrente(michelle);
		Conta poupanca = new ContaPoupanca(michelle);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}