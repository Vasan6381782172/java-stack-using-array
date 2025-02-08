concatenate
public class Main
{
	public static void main(String[] args) {
	    String str1= "Hello";
	    String str2= "World";
		System.out.println("print as: "+ str1+" "+str2);
	}
}


length


public class Main
{
	public static void main(String[] args) {
	    String str= "Hello";
	    int length=str.length();
		System.out.println("print as: "+length);
	}
}



charAt


public class Main
{
	public static void main(String[] args) {
	    String str= "Hello";
	    char ch=str.charAt(3);
		System.out.println("print as: "+ch);
	}
}


Boolean

public class Main
{
	public static void main(String[] args) {
	    String str1= "HELLO";
	    String str2= "HELLO";
		System.out.println("statement is: "+str1.equals(str2));
	}
}






ignore case

public class Main
{
	public static void main(String[] args) {
	    String str1= "HELLO";
	    String str2= "HELLO";
		System.out.println("statement is: "+str1.equalsIgnoreCase(str2));
	}
}




upper and lower                   

public class Main
{
	public static void main(String[] args) {                                                   
	    String str1= "HELLO";
	   // String str2= "HELLO";
		System.out.println("Upper case : "+str1.toUpperCase());
	}
}



public class Main
{
	public static void main(String[] args) {
	    String str1= "HELLO";
	   // String str2= "HELLO";
		System.out.println("Lower case : "+str1.toLowerCase());
	}
}




indexof


public class Main
{
	public static void main(String[] args) {
	    String str1= "HELLO";
	   // String str2= "HELLO";
		System.out.println("IndexOf: "+str1.indexOf('L'));
	}
}


isempty


public class Main
{
	public static void main(String[] args) {
	    String str= "Hello";
		System.out.println("print as: "+str.isEmpty( ));
	}
}


reverse



public class Main
{
	public static void main(String[] args) {
	    String str="hello";
	    String reversed=" ";
	    for(int i=str.length()-1;i>=0;i--)
	    reversed +=str.charAt(i);
		System.out.println("print as: "+reversed);
	}
}






