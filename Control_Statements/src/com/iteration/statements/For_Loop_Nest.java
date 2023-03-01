package com.iteration.statements;

public class For_Loop_Nest {
	
	public static void main(String[] args) {
		 int r = 5, k = 0;

		    for (int i = 1; i <= r; ++i, k = 0) {
		      for (int j = 1; j <= r - i; ++j) {
		        System.out.print(" ");
		      }

		      while (k != 1 * i ) {
		        System.out.print("* ");
		        ++k;
		      }

		      System.out.println();
		    }
		  }
}
