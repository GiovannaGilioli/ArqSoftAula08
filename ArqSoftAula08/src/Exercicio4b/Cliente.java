package Exercicio4b;

public class Cliente {
	private SomadorEsperado somador;
	public Cliente(SomadorEsperado somador) {
		this.somador = somador;
	}
	public void executar() {
		int[] vetor = new int[] {1,2,3};
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado: "+soma);
	}
}
