package ������������;

public class StoA {
	    public static void main(String args[]) {
	        String str = "helloworld";
	        char[] data = str.toCharArray();// ���ַ���תΪ����
	        for (int x = 0; x < data.length; x++) {
	            System.out.print(data[x] + "  ");
	            data[x] -= 32;
	            System.out.print(data[x] + "  ");
	        }
	        str=new String (data);
	        System.out.println(str);
	    }
}
