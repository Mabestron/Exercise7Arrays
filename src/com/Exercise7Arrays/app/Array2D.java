package com.Exercise7Arrays.app;

public class Array2D {

	public static void main(String[] args) {
		//Constant
		final int ROMS=10;
		final int COLS=10;
		
		//Variable
		int cont=1;
		
		//array 2D
		int[][] matrix = new int[ROMS][COLS];
		
		//generar matriz
		for (int i=0;i<ROMS;i++)
		{
			for (int j=0;j<COLS;j++)
			{
				matrix [i][j]=cont;
				cont++;
			}
		}
		
		//Mostrar matriz
		for (int i=0;i<ROMS;i++)
		{
			for (int j=0;j<COLS;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
