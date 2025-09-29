package alprotugas2;

import java.util.Scanner;

public class HitungUpah {
    
	private static String gaji;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
         System.out.print("Masukkan nama karyawan: ");
            String nama = keyboard.nextLine();
            System.out.print("Masukkan golongan (A/B/C/D): ");
            char golongan = keyboard.next().charAt(0);
            System.out.print("Masukkan jumlaj jam kerja: ");
            int jamKerja = keyboard.nextInt();
            
            int upahPerJam = 0;
            switch (Character.toUpperCase(golongan)) {
                case 'A':
            	    upahPerJam = 1000;
            	    break;
                case 'B': 
            	    upahPerJam = 2000; 
            	    break;
                case 'C':
            	    upahPerJam = 3000; 
            	break;
                case 'D':
            	    upahPerJam = 4000; 
            	    break;
                default:
            	    upahPerJam = 0; // jika golongan tidak valid
            	    System.out.println("Golongan tidak valid!");
            	    
	       }
           int gaji;
           if(jamKerja > 60){
    	         gaji = 60 * upahPerJam;
    	         int lembur = (jamKerja - 60) * 5000;
    	          gaji = gaji + lembur;
          }
          else{
    	        gaji = jamKerja * upahPerJam;
          }
    
    
          System.out.println("\n=== Data Gaji Karyawan ===");
          System.out.println("Nama Karyawan : " + nama);
          System.out.println("Golongan      : " + golongan);
          System.out.println("Jam Kerja     : " + jamKerja);
          System.out.println("Upah per Jam  : " + upahPerJam);
          System.out.println("Total Gaji    : " + gaji);
    
    
   }
	
}
