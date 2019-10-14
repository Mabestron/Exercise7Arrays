package com.Exercise7Arrays.app;

public class Arrays1D {

	public static void main(String[] args) {
		//Constants
		final int ELEMENTS_ARRAY=10;
		// Array Declaration
		int[] intArray = new int[ELEMENTS_ARRAY];
		char[] charArray = new char[ELEMENTS_ARRAY];
		boolean[] boolArray = new boolean[ELEMENTS_ARRAY];
		double[] dblArray = new double[ELEMENTS_ARRAY];
		String[] strArray = new String[ELEMENTS_ARRAY];
		
		int[] intArray2 = {10,20,30,40,50,60};
		char[] charArray2 = {'a','b','c','d','e','f'};
		boolean[] boolArray2 = {true,false,true,true};
		double[] dblArray2 = {1.0,2.0,3.0,4.0,5.0,6.0};
		String[] strArray2 = {"First","Second","Thirt"};
		
		//Muestra el vector de enteros
		for (int i=0;i<intArray2.length;i++)
		{
			System.out.println(intArray2[i]);
		}
		
		//Muestra el vector de caracteres
		for (int i=0;i<charArray2.length;i++)
		{
			System.out.println(charArray2[i]);
		}
		
		//Muestra el vector de booleanos
		for (int i=0;i<boolArray2.length;i++)
		{
			System.out.println(boolArray2[i]);
		}
		
		//Muestra el vector de double
		for (int i=0;i<dblArray2.length;i++)
		{
			System.out.println(dblArray2[i]);
		}
		
		//Muestra el vector de cadenas de caracteres
		for (int i=0;i<strArray2.length;i++)
		{
			System.out.println(strArray2[i]);
		}
		
	}

}
