package Exercicio4b;

public class SomadorTest {
	public static void main(String args[]) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
