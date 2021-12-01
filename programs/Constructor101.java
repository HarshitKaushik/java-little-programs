import java.util.*;
import java.lang.*;
import java.io.*;

class Animal {
  public Animal() {
    System.out.println("Animal Constructor");
  }
}

class Dog extends Animal {
  public Dog() {
    System.out.println("Dog Constructor");
  }
}

class Labrador extends Dog {
  public Labrador() {
    System.out.println("Labrador Constructor");
  }
}

class Constructor101
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// String class in Java
		System.out.println("PROGRAM START!");

    Labrador labrador = new Labrador();

		System.out.println("PROGRAM END!");
	}
}