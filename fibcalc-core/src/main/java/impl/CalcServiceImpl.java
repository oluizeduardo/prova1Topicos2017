package impl;

import rest.impl.CalcResult;
import rest.impl.CalcService;

public class CalcServiceImpl implements CalcService {

	@Override
	public CalcResult fibonacci(int n) {
		
		int result_fibonacci = Result.fibonacci(n);		
		return new CalcResult().withNum(n).withFibonacci(result_fibonacci);
	}
	
}
