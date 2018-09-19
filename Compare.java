
public class Compare {
           public static void main(String []args)
           {
        	    String x=new String("abc");
        	    String y="abc";
        	    System.out.println(x==y);
        	    System.out.println(x.equals(y));
        	    Character a=new Character('a');
        	    Character b=new Character('a');
        	    System.out.println(a==b);
        	    System.out.println(a.equals(b));
        	    StringBuffer fr=new StringBuffer("java");
        	    StringBuilder dr=new StringBuilder("c++");
        	    System.out.println(fr+" "+dr);
           }
}
