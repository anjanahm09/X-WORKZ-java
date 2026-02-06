class JioHotstar {
	public static void main(String[] movies) {

		String kannadaMovies[] = {
			"Kantara","Raajakumara","Yuvarathnaa","Anna Bond","Power",
			"Mr and Mrs Ramachari","Milana","Hudugaru","Googly","Drama",
			"Tagaru","Gajakesari","James","Kranti","Paramathma",
			"Jackie","Just Maath Maathalli","Kirik Party","Ranna","Chakravarthy"
		};

		String hindiMovies[] = {
			"Super 30","MS Dhoni The Untold Story","Chhichhore","Bhool Bhulaiyaa",
			"Tanhaji","Bajrangi Bhaijaan","Ek Tha Tiger","Tiger Zinda Hai","War","Sultan",
			"Kick","Bodyguard","Dabangg","Dabangg 2","Dabangg 3",
			"Housefull","Housefull 2","Housefull 3","Bol Bachchan","Ready"
		};

		String teluguMovies[] = {
			"Baahubali The Beginning","Baahubali The Conclusion","Magadheera","Eega","Athadu",
			"Pokiri","Oopiri","Rangasthalam","Maharshi","Janatha Garage",
			"Sye","Leader","Happy Days","Bommarillu","Arya",
			"Arya 2","Gabbar Singh","Attarintiki Daredi","Race Gurram","DJ Duvvada Jagannadham"
		};

		String englishMovies[] = {
			"Avatar","Avatar The Way of Water","Avengers Endgame","Avengers Infinity War","Iron Man",
			"Iron Man 2","Iron Man 3","Captain America The First Avenger","Captain America Civil War","Thor",
			"Thor The Dark World","Thor Ragnarok","Black Panther","Doctor Strange","Guardians of the Galaxy",
			"Guardians of the Galaxy Vol 2","Ant-Man","Ant-Man and the Wasp","Spider-Man Homecoming","Spider-Man Far From Home"
		};

		String malayalamMovies[] = {
			"Drishyam","Drishyam 2","Bangalore Days","Premam","Lucifer",
			"Uyare","Virus","Take Off","Ayyappanum Koshiyum","Kumbalangi Nights",
			"Maheshinte Prathikaaram","Charlie","Sudani From Nigeria","Jallikattu","Joji",
			"Android Kunjappan","Home","Neram","Minnal Murali","Kurup"
		};

		System.out.println("Kannada movies available on Jio Hotstar:");
		for(String kannadaMovie : kannadaMovies){
			System.out.println(kannadaMovie);
		}

		System.out.println("\nHindi movies available on Jio Hotstar:");
		for(String hindiMovie : hindiMovies){
			System.out.println(hindiMovie);
		}

		System.out.println("\nTelugu movies available on Jio Hotstar:");
		for(String teluguMovie : teluguMovies){
			System.out.println(teluguMovie);
		}

		System.out.println("\nEnglish movies available on Jio Hotstar:");
		for(String englishMovie : englishMovies){
			System.out.println(englishMovie);
		}

		System.out.println("\nMalayalam movies available on Jio Hotstar:");
		for(String malayalamMovie : malayalamMovies){
			System.out.println(malayalamMovie);
		}
	}
}
