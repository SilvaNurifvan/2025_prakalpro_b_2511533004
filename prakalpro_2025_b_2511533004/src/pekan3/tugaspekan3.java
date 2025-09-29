package pekan3;

import java.util.Scanner;

public class tugaspekan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Masukkan jari-jari bola: ");
		    double r = keyboard.nextDouble();
		   double volume = (4.0/3.0 * 3.14 * r * r * r);
		System.out.println("Volume bola = " + volume);
	}

}
