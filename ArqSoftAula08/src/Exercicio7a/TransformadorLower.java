package Exercicio7a;

public class TransformadorLower extends TransformadorTemplate {

	@Override
	public String transform(String s) {
		return s.toLowerCase();
	}
}
