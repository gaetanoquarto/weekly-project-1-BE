import interfacce.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita{
	
	public Immagine(String titolo) {
		super(titolo);

	}

	@Override
	public int aumentaLuminosita() {
		if(luminosita < 10) {
			return luminosita++;
			} else {
				System.out.println("LA LUMINOSITA' E' GIA' AL MASSIMO!");
			}
			return luminosita;
	}

	@Override
	public int diminuisciLuminosita() {
		if(luminosita > 0) {
			return luminosita--;
			} else {
				System.out.println("LA LUMINOSITA' E' GIA' AL MINIMO!");
			}
			return luminosita;
	}
	
	@Override
	public String toString() {
	    return"IMMAGINE -" + " Titolo: " + this.titolo;
	}
	
	
	

}
