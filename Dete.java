package domaci;

import java.util.Scanner;

public class Dete {
	/*
	 * Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se
	 * kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda
	 * oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce ispisivati
	 * broj klikera i metodu koja ispisuje prosecan broj decjih godina(ako imamo
	 * troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo
	 * prosecne godine za to dvoje) .
	 */

	private String ime;
	private String prezime;
	private int brGod;
	private int brKlikera;

	public Dete(String ime, String prezime, int brGod, int brKlikera) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brGod = brGod;
		this.brKlikera = brKlikera;

	}

	public int getBrKlikera() {
		return brKlikera;
	}

	public void dodajKlikere(int br) {
		this.brKlikera += br;

	}

	public void oduzmiKlikere(int br) {
		this.brKlikera -= br;
	}

	public void ispisKlikera() {
		System.out.println(brKlikera);
	}

	public void prosekGod(int n) {
		Scanner sc = new Scanner(System.in);
		double suma = 0;
		int brojac = 0;
		System.out.println("Unesite brojeve godina " + n + "." + " dece");
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
			suma += niz[i];
			brojac++;
		}
		double as = suma / brojac;
		System.out.println("Prosecan broj godina za " + n + ". dece je " + as);
	}

}
