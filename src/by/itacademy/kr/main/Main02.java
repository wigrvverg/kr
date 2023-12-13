package by.itacademy.kr.main;

public class Main02 {

	public static void main(String[] args) {
		//Составить программу вычисления значений функции f(x) из задачи 1 для n
		//значений аргумента x, равномерно распределенных на отрезке [a, b]. Для
		//проверки программы задать n = 10; a = 0.50; b = 1.00. Результаты выдать в виде
		//таблицы, в каждой строке порядковый номер, значение аргумента и значение
		//функции с шестью знаками после запятой.
		int n=10;
		double x=0.5;
		double a=0.50;
		double b=1.00;
		System.out.println("№\tАргумент\tфункции");
        System.out.println("-----------------------------");
		for(int i=0; i<=n; i++) {
			 double s = a + (b - a) * (i - 1) / (n - 1);
	            double res = Math.sqrt(Math.pow(Math.E, (2.2) * x)) - Math.abs((Math.sin((Math.PI * x) / (x + (2.0/3.0))))) + 1.7;;
	            System.out.println(i+"\t"+String.format("%.6f",s)+"\t"+String.format("%.6f",res));
	        }
	    }


}
