package br.masmangan.beecrowd.bee1074;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    	Scanner key = new Scanner(System.in);
    	int N = key.nextInt();
        String eu = "";

    	for (int i = 0; i < N; i++) {
    		int x = key.nextInt();

    		if (x == 0) eu = eu + "NULL";

    		    else if (x % 2 == 0 && x > 0) eu = eu + "EVEN POSITIVE";

    		        else if (x % 2 == 0 && x < 0) eu = eu + "EVEN NEGATIVE";

    		            else if (x % 2 != 0 && x > 0) eu = eu + "ODD POSITIVE";

    		                else if (x % 2 != 0 && x < 0) eu = eu + "ODD NEGATIVE";
            
            if (i != N - 1) eu = eu + "\n";
    	}

        System.out.println(eu);
	}
	
}