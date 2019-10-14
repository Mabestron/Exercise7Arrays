package com.Exercise7Arrays.app;
import java.util.Random;
public class RandomNumbers {

	public static void main(String[] args) {
		// Constant Declaration
		final int ELEMENTS_ARRAY=100;
		
		//Variable Generation
		double generatedNumber=0.0;
		int generatedNumberint=0;
		byte generatedNumberbyte=0;
		
		byte eventValues=0;
		byte oddValues=0;
		byte zeroValues=0;
		byte positiveValues=0;
		byte negativeValues=0;
		
		//Array declaration
		byte[] miArray1= new byte [ELEMENTS_ARRAY];
		
		Random randomNumbers= new Random(System.nanoTime());
		/*
		//Array pseudo random numbers
		//Way 1: Random Class	
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			generatedNumber=randomNumbers.nextDouble();
			System.out.println(generatedNumber);
		}
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			generatedNumberint=randomNumbers.nextInt(51)+50;
			System.out.println(generatedNumberint);
		}
		*/
		
		//Way 2: By means of math class
		/*
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			//generatedNumber=Math.random()*100;
			//generatedNumberint=(int)generatedNumber;
			generatedNumberint=(int)(Math.random()*50+50);//numeros del 50 al 100 casteados
			System.out.println(generatedNumberint);
		}
		*/
		//Pass 1 Initialize
		for(int i=0;i<miArray1.length;i++)
		{
			generatedNumberbyte= (byte) randomNumbers.nextInt(101);
			miArray1[i]=generatedNumberbyte;
			//System.out.println(generatedNumberint);
		}
		
		//Pass 2 Process
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			if(miArray1[i]==0)
			{	
				zeroValues++;
			}
			else if(miArray1[i]%2==0)
			{
				eventValues++;
			}
			else if(miArray1[i]%2==1)
			{
				oddValues+=1;
			}
			
			
			if(miArray1[i]>0)
			{
				positiveValues++;
			}
			else if(miArray1[i]<0)
			{
				negativeValues++;
			}
			
		}
		
		//Pass 3 Visualization
		System.out.println("Zeros VALUES :"+zeroValues);
		System.out.println("Odd VALUES :"+oddValues);
		System.out.println("Even VALUES :"+eventValues);
		System.out.println("Positive VALUES :"+positiveValues);
		System.out.println("Negative VALUES :"+negativeValues);
	}

}
