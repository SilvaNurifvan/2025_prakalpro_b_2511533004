package pekan7_2511533004;

public class String2_2511533004 {

	public static void main(String[] args) {
		String firstName = "Silva";
        String lastName = "Nurifvan";
        String txt1 = "Dosen\"intelektual\" kampus";
        System.out.println("Nama Lengkap: " + firstName + "," + lastName);
        System.out.println("Nama Lengkap: " + firstName.concat(lastName));
        System.out.println(txt1);

        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println("x + y = " + z);

        String a = "10";
        String b = "20";
        String c = a + b;
        System.out.println("String a + String b = " + c);

        String w = a + y;
        System.out.println("String a + integer y = " + w);
    }
}