package impl;

import rest.impl.CalcService;

public class CalcServiceImpl implements CalcService {

	@Override
	public Result fibonacci(int n) {
		
		return Result.fibonacci(6);
	}

}
