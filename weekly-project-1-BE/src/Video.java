import interfacce.Luminosita;
import interfacce.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosita{
	
	
	public Video(String titolo, int durata) {
		super(titolo, durata);

	}

	@Override
	public int aumentaVolume() {
		if(volume < 10) {
		return volume++;
		} else {
			System.out.println("IL VOLUME E' GIA' AL MASSIMO!");
		}
		return volume;
	}

	@Override
	public int diminuisciVolume() {
		if(volume > 0) {
			return volume--;
			} else {
				System.out.println("IL VOLUME E' GIA' AL MINIMO!");
			}
			return volume;

	
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
	    return"VIDEO -" + " Titolo: " + this.titolo + " Durata: " + this.durata;
	}
}
