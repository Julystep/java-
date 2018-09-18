package 基本数据类型;

public class Stringtest {
              public static void main(String []args)
              {
            	  String hellostring = new String("hello world") ;
            	  System.out.println(hellostring);
            	  int len=hellostring.length();
            	  System.out.println(len);
            	  String hellostring2 = new String ("yes hello you");
            	  System.out.println(hellostring.concat(hellostring2));
            	  String s1 = "abc";            // 常量池
            	  String s2 = new String("abc");     // 堆内存中
            	  System.out.println(s1==s2);        // false两个对象的地址值不一样。
            	  System.out.println(s1.equals(s2)); // true
            	  String s3="a"+"b"+"c";
            	  String s4="abc";
            	  System.out.println(s3==s4);//s3相当于用了toString()建立
            	  System.out.println(s3.equals(s4));
            		
              }
}
