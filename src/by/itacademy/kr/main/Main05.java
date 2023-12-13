package by.itacademy.kr.main;

public class Main05 {

	public static void main(String[] args) {
		double a=1;
		double x1=-2*a;
		double dx=a/5;
		int n=5;
		double y;
		for(int i=1; i<=n; i++) {
			double x = x1 + i * dx;
			if(x<=0) {
				 y=a/2*((Math.pow(Math.E, x/a))+(Math.pow(Math.E, -x/a)));
				
				}else {
					 y=(4*Math.pow(a, 3))/(Math.pow(x, 2)+4*Math.pow(a, 2));
				
			}
			 System.out.println( i+"\t"+String.format("%.2f",x)+"\t"+String.format("%.2f",y));
		}
	}

}
