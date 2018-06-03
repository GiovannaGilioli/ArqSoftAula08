package Exercicio7a;

public class TransformadorUpper extends TransformadorTemplate {

	@Override
	public String transform(String s) {
		return s.toUpperCase();
	}
}
