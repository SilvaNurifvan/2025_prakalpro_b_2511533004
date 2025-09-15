package pekan2;

public class ContohChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Dekiarasi variabel char
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka = '7';
		char simbol = '#';
		// Menampilkan nilai variabel char
		System.out.println("Contoh variabel char:");
		System.out.println("Huruf pertama: " + huruf1);
		System.out.println("Huruf kedua: " + huruf2);
		System.out.println("Angka: " + angka);
		System.out.println("Simbol: " + simbol);
		
		//Operasi dengan char (berdasarkan kode Unicode/ASCII)
		char huruf3 = (char) (huruf1 + 1); // A (65) + 1 = B (66)
		System.out.println("Huruf1 + 1 = " + huruf3);
		
		//Chat juga bisa disimpam dalam integer (ASII/Unicode value)
		int kodeHuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ', '0');
		System.out.println("Kode ASCII dari " + huruf1 + " = " + kodeHuruf);
		System.out.println("Kosw BINER dari " + huruf1 + " = " + biner1);
		
		// Menggabungka char menjadi staring
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println("Gabungkan char menjadi staring: " + kata);
		
		
	}

}
