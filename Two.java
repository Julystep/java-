import java.util.Scanner;
public class Two {
           public static void main(String []args)
           {
        	   Scanner wr=new Scanner(System.in);
        	   float x=wr.nextFloat();
        	   double y=wr.nextDouble();
        	   System.out.printf("%.2f\n",x+y);
        	   wr.close();
           }
}
