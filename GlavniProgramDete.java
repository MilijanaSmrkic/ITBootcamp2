package domaci;

import java.util.Scanner;

public class GlavniProgramDete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dete d1 = new Dete("Marko", "Markovic", 6, 4);
		Dete d2 = new Dete("Pera", "Markovic", 5, 28);
		Dete d3 = new Dete("Igor", "Jankovic", 6, 12);
		Dete d4 = new Dete("Jovan", "Peric", 4, 9);
		Scanner sc = new Scanner(System.in);
		d1.dodajKlikere(4);
		d2.oduzmiKlikere(7);
		d1.prosekGod(4);
		System.out.println(d1.getBrKlikera());
		d2.ispisKlikera();

	}

}
