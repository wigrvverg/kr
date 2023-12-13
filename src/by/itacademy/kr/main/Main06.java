package by.itacademy.kr.main;

public class Main06 {

	public static void main(String[] args) {
		double a = 3*Math.pow(10, 3);
        double b = 6*Math.pow(10, 4);
        int m = 4;
        
        int count=0;
        for(int k=-30; k<=60; k++) {
        	double res=Math.pow(k, 3)-25*Math.pow(k, 2)+50*k+1000;
       double t1=Math.sqrt(a+b+m);
       double t2=m*Math.sqrt(a+b);
       double t3=Math.sqrt(a*b*m);
       double t4=m*Math.sqrt(a*b);
       if(res>Math.min(t1, t2)&&res<Math.max(t1, t2)||(res>Math.min(t3, t4)&&res<Math.max(t3, t4))) {
       

        }else {
        	count++;
        }
        
    
       System.out.println(res);
       
     

	}
        System.out.println("---------------------");
        System.out.println(count);

}
}