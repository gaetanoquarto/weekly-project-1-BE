import interfacce.Volume;

public class Audio extends ElementoMultimediale implements Volume {
	
	

	public Audio(String titolo, int durata) {
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
	public String toString() {
	    return"AUDIO -" + " Titolo: " + this.titolo + " Durata: " + this.durata;
	}
}
