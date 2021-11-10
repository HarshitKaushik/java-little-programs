import java.util.*;
import java.lang.*;
import java.io.*;

class WrapperClassAutoboxing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Wrapper classes auto-boxing memory reuse test
		System.out.println("PROGRAM START!");
		Integer a = 2;
		Integer b = 5;
		Integer c = 3;
		Integer d = 2;
		Integer e = 2;
		Integer f = 3;
		Integer g = b;
		System.out.println("Equality check: a == d");
		System.out.println(a == d);
		System.out.println("Equality check: a == e");
		System.out.println(a == e);
		System.out.println("Equality check: d == e");
		System.out.println(d == e);
		System.out.println("Equality check: a == b");
		System.out.println(a == b);
		System.out.println("Equality check: a == c");
		System.out.println(a == c);
		System.out.println("Equality check: b == c");
		System.out.println(b == c);
		System.out.println("Equality check: c == f");
		System.out.println(c == f);
		System.out.println("Equality check: b == g");
		System.out.println(b == g);
		System.out.println("PROGRAM END!");
	}
}