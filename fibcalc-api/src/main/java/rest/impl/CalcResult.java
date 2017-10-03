package rest.impl;

public class CalcResult {
	
	
	private int number;
	private int fibonacci;
	
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getFibonnaci() {
		return fibonacci;
	}
	
	public void setFibonnaci(int fibonnaci) {
		this.fibonacci = fibonnaci;
	}
	
	public CalcResult withNum (int number) {
		this.number = number;
		return this;
	}	
	
	public CalcResult withFibonacci(int fibonacci) {
		this.fibonacci = fibonacci;
		return this;
	}
}
