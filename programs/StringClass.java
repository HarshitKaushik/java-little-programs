import java.util.*;
import java.lang.*;
import java.io.*;

class StringClass
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// String class in Java
		System.out.println("PROGRAM START!");

		// Immutability
    String str3 = "value1";
    str3.concat("value2");
    System.out.println(str3); //value1
    // No compilation error.
    String concat = str3.concat("value2");
    System.out.println(concat); //value1value2
    //char charAt(int paramInt)
    System.out.println(str.charAt(2)); //prints a char - c
    System.out.println("ABCDEFGH".length());//8
    System.out.println("abcdefghij".toString()); //abcdefghij
    System.out.println("ABC".equalsIgnoreCase("abc"));//true
    //Get All characters from index paramInt
    //String substring(int paramInt)
    System.out.println("abcdefghij".substring(3)); //defghijk
    //All characters from index 3 to 6
    System.out.println("abcdefghij".substring(3,7)); //defg
    //String concat(String paramString)
    System.out.println(str.concat("lmn"));//abcdefghijklmn
    //String replace(char paramChar1, char paramChar2)
    System.out.println("012301230123".replace('0', '4'));//412341234123
    //String replace(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
    System.out.println("012301230123".replace("01", "45"));//452345234523
    System.out.println("ABCDEFGHIJ".toLowerCase()); //abcdefghij
    System.out.println("abcdefghij".toUpperCase()); //ABCDEFGHIJ
    //trim removes leading and trailing spaces
    System.out.println(" abcd  ".trim()); //abcd

		System.out.println("PROGRAM END!");
	}
}