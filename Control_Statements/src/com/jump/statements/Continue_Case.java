package com.jump.statements;

public class Continue_Case {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			if (i==6) {
				continue;
			}if (i==10) {
				break;
			}
			else {
				System.out.println(i);
			}
			
		}
	}

}
