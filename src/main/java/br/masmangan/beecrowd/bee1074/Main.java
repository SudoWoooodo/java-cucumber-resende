package br.masmangan.beecrowd.bee1074;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    	Scanner key = new Scanner(System.in);
    	int N = key.nextInt();
        String eu = "";

    	for (int i = 0; i < N; i++) {
    		int x = key.nextInt();

    		if (x == 0) eu = eu + "NULL\n";

    		    else if (x % 2 == 0 && x > 0) eu = eu + "EVEN POSITIVE \n";

    		        else if (x % 2 == 0 && x < 0) eu = eu + "EVEN NEGATIVE \n";

    		            else if (x % 2 != 0 && x > 0) eu = eu + "ODD POSITIVE \n";

    		                else if (x % 2 != 0 && x < 0) eu = eu + "ODD NEGATIVE \n";
    	}

        System.out.println(eu);
	}
	
}