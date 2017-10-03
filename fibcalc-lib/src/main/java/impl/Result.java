package impl;

public class Result {


	private int n;
	
	public static int fibonacci(int n) {
		int lo = 0;
		int hi = 1;
		for (int i = 0; i < n; i++) {
			hi = lo + hi;
			lo = hi - lo;
		}
		return lo;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
	
}
