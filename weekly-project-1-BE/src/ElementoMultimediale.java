

abstract public class ElementoMultimediale {

	String titolo;
	int durata;
	int volume = 5;
	int luminosita = 5;

	public ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}
	public ElementoMultimediale(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;
	}

	public void play() {
		System.out.println("RIPRODUZIONE IN CORSO...");
		if (ElementoMultimediale.this instanceof Audio) {
			for (int i = this.durata; i > 0; i--) {
				String volumeConv = "";
	            for(int v = this.volume; v > 0; v--) {
	                volumeConv += " !";
	            }
				System.out.println("TITOLO: " + this.titolo + volumeConv);
				System.out.println("DURATA: " + i);
				
			}
			System.out.println("RIPRODUZIONE TERMINATA");
			System.out.println("-----------------------");
		} else if (ElementoMultimediale.this instanceof Video) {
			for (int i = this.durata; i > 0; i--) {
				String luminositaConv = "";
				String volumeConv = "";
	            for(int v = this.volume; v > 0; v--) {
	                volumeConv += " !";
	            }
	            for(int l = this.luminosita; l > 0; l--) {
	            	luminositaConv += " *";
	            }
				System.out.println("TITOLO: " + this.titolo + volumeConv + luminositaConv);
				System.out.println("DURATA: " + i);
			}
			System.out.println("RIPRODUZIONE TERMINATA");
			System.out.println("-----------------------");
		} else {
			System.out.println("ERRORE! L'ELEMENTO NON PUO' ESSERE RIPRODOTTO.");
			System.out.println("-----------------------");
		}
	}

	public void mostra() {
		String luminositaConv = "";
        for(int l = this.luminosita; l > 0; l--) {
            luminositaConv += " *";
        }
		System.out.println("MOSTRO IMMAGINE");
		System.out.println("TITOLO " + this.titolo + luminositaConv);
		System.out.println("-----------------------");
	}
	
	
	
	
}
