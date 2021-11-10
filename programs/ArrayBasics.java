import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayBasics
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// String class in Java
		System.out.println("PROGRAM START!");

    // Testing extra commas in array declaration.
    // int[] numberArray = {1,2,3,,,,};
    // ArrayBasics.java:13: error: illegal start of expression
    // int[] numberArray = {1,2,3,,,,};
    //                              ^
    // 3 errors
    // System.out.println(numberArray.length);
    int[] anotherIntArray = {1,2,3,};
    System.out.println(anotherIntArray.length);

    int n = 10;
    int[] values;
    // int values[n]; // Compilation error! "]" expected.

    //Cross-assignment of primitive arrays is ILLEGAL
    int[] ints = new int[5];
    short[] shorts = new short[5];
    //ints = shorts;//COMPILER ERROR
    //ints = (int[])shorts;//COMPILER ERROR

    //The first dimension of a 2D array is mandatory
    int[][] matrixA = new int[3][];//FINE
    //matrixA = new int[][5];//COMPILER ERROR
    //matrixA = new int[][];//COMPILER ERROR

    //Each row in a 2D Array can have a different size. This is called a ragged array.
    // matrixA = new int[3][]; //FINE
    matrixA[0] = new int[3];
    matrixA[1] = new int[4];
    matrixA[2] = new int[5];

		System.out.println("PROGRAM END!");
	}
}