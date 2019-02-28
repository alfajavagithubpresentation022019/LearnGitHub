package de.kunden;

public class Firmen extends Kunde {

	private int art;
	public Firmen(int kundeNummer, String name, String nachName, String eMailAdresse, String telefonNummer,
			String strasse, String hausNummer, String plz, String stadt) {
		super(kundeNummer, name, nachName, eMailAdresse, telefonNummer, strasse, hausNummer, plz, stadt);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void rechnungDrucken() {
		// TODO Auto-generated method stub
		super.rechnungDrucken();
		System.out.println("Rechnung Firmen Kunde.. ");
	}
	
	

}
