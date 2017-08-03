package JavaTraining.JAVA_TRAINING;

import java.util.function.Function;

public class Power {
	
	double val;
	
	public Power(double val) {
		super();
		getPower(val,val,val);
	}
	
	public void getPower(double a, double b, double c) {
		if(c > 1) {
			getPower(a*b,b,c-1);
		}
		System.out.println(a);
	}

}
