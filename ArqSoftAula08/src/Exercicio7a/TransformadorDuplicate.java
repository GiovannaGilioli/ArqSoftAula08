package Exercicio7a;

public class TransformadorDuplicate extends TransformadorTemplate {

	@Override
	public String transform(String s) {
		return s+" "+s;
	}
}
