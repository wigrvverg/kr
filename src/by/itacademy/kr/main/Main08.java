package by.itacademy.kr.main;

public class Main08 {

	public static void main(String[] args) {
		double x1=0.1;
		double x=0;
		double r=0.1;
		double lim=10;
		int n=1;
		double res=Math.pow(x1, 2)-Math.pow(Math.E, 2*x1)+4;
		while (x<lim) {
			x=x1+(n-1)*r;
			n++;
			System.out.println(res);
			
		}
		System.out.println("предел достингнут");
			if(res<=0) {
				System.out.println("0 пройден");
			
			
		}

	}}



