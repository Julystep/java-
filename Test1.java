package 基本数据类型;

public class Test1 {
	 public static void main (String []args)  
	    {  
	        double x=1.92;
            double b=1.923;
	        System.out.println(Math.max(x, b));
	        Integer x1=10;
	        System.out.println(x1.compareTo(5));
	        System.out.println(x1.doubleValue());
	        System.out.println(x1.toString());  
	        System.out.println(Integer.toString(x1)); 
	        System.out.println(Character.isLetter('c'));
	        System.out.println(Character.isDigit('5'));
	        Character x2='N';
	        System.out.println(Character.toString(x2));
	    }  
}
