package com.Exercise7Arrays.app;
import java.util.Random;

public class primosArray 
{

	public static void main(String[] args) 
	{
		//Constant
		final int ELEMENTS_ARRAY=100;
		
		//Variable
		byte primeNumbers=0;
		boolean isPrime=true;
		
		//Array Declaration
		byte[] vector = new byte [ELEMENTS_ARRAY];
		
		//Object declaration
		Random randomNumbers = new Random(System.nanoTime());
		
		//Relleno del vector con numeros aleatorios
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			vector[i]= (byte) randomNumbers.nextInt(101);
		}
		
		//proceso de verificar sí es primo cada elemento
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			isPrime=true;
			for (int j=2;j<vector[i];j++)
			{
				if(vector[i]%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if (isPrime)
			{
				primeNumbers++;
			}
		}
		System.out.println("Los numeros primos son:"+primeNumbers);
		
		/*
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.println(vector[i]);
		}
		 */
	}

}
