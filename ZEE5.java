class ZEE5 {
	public static void main(String[] movies) {

		String kannadaMovies[] = {
			"K.G.F Chapter 1","MARK","Yuvarathnaa","Raajakumara","MAX",
			"Kranti","James","Tagaru","Ranna","Power",
			"Gajakesari","Anna Bond","Milana","Googly","Drama",
			"Paramathma","Just Maath Maathalli","Hudugaru","Bulbul","Chakravarthy"
		};

		String hindiMovies[] = {
			"Uri The Surgical Strike","Article 15","Dream Girl","Raees","Tanu Weds Manu",
			"Tanu Weds Manu Returns","Rustom","Kesari","Gold","Mission Mangal",
			"Toilet Ek Prem Katha","Pad Man","Shubh Mangal Saavdhan","Bareilly Ki Barfi","Badhaai Ho",
			"Veere Di Wedding","Kedarnath","Kabir Singh","Judwaa 2","Batti Gul Meter Chalu"
		};

		String teluguMovies[] = {
			"Baahubali The Beginning","Baahubali The Conclusion","Magadheera","Eega","Athadu",
			"Pokiri","Bommarillu","Happy Days","Arya","Arya 2",
			"Gabbar Singh","Race Gurram","Attarintiki Daredi","Janatha Garage","Rangasthalam",
			"Maharshi","Leader","Sye","Kushi","Oopiri"
		};

		String englishMovies[] = {
			"Mad Max Fury Road","The Shawshank Redemption","The Dark Knight","Inception","Interstellar",
			"Dunkirk","Tenet","Joker","Gladiator","Titanic",
			"The Matrix","The Matrix Reloaded","The Matrix Revolutions","Avatar","Avatar The Way of Water",
			"Jurassic Park","Jurassic World","The Godfather","The Godfather Part II","The Prestige"
		};

		String malayalamMovies[] = {
			"Drishyam","Drishyam 2","Premam","Bangalore Days","Lucifer",
			"Uyare","Virus","Take Off","Joji","Home",
			"Kumbalangi Nights","Maheshinte Prathikaaram","Charlie","Sudani From Nigeria","Jallikattu",
			"Ayyappanum Koshiyum","Minnal Murali","Kurup","Android Kunjappan","Neram"
		};

		System.out.println("Kannada movies available on ZEE5:");
		for (String kannadaMovie : kannadaMovies) {
			System.out.println(kannadaMovie);
		}

		System.out.println("\nHindi movies available on ZEE5:");
		for (String hindiMovie : hindiMovies) {
			System.out.println(hindiMovie);
		}

		System.out.println("\nTelugu movies available on ZEE5:");
		for (String teluguMovie : teluguMovies) {
			System.out.println(teluguMovie);
		}

		System.out.println("\nEnglish movies available on ZEE5:");
		for (String englishMovie : englishMovies) {
			System.out.println(englishMovie);
		}

		System.out.println("\nMalayalam movies available on ZEE5:");
		for (String malayalamMovie : malayalamMovies) {
			System.out.println(malayalamMovie);
		}
	}
}
