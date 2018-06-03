package Exercicio6b;

public class SortContext {

	private Sort sort;
	
	public SortContext(Sort sort) {
		this.sort = sort;
	}
	public int[] sort(int[] v) {
		return sort.sort(v);
	}
}
