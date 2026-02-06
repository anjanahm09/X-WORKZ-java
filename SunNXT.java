class SunNXT {
	public static void main(String[] movies) {

		String kannadaMovies[] = {
			"Raajakumara","Yuvarathnaa","Power","Ranna","James",
			"Gajakesari","Tagaru","Milana","Googly","Drama",
			"Just Maath Maathalli","Paramathma","Hudugaru","Anna Bond","Jackie",
			"Chakravarthy","Bulbul","Mr and Mrs Ramachari","Kirik Party","Raate"
		};

		String hindiMovies[] = {
			"Kick","Bodyguard","Ready","Dabangg","Dabangg 2",
			"Dabangg 3","Jai Ho","Tubelight","Race 3","Bajrangi Bhaijaan",
			"Ek Tha Tiger","Tiger Zinda Hai","Sultan","Veer","Wanted",
			"Partner","No Entry","Mujhse Shaadi Karogi","Judwaa","Judwaa 2"
		};

		String teluguMovies[] = {
			"Baahubali The Beginning","Baahubali The Conclusion","Magadheera","Eega","Athadu",
			"Pokiri","Bommarillu","Happy Days","Arya","Arya 2",
			"Gabbar Singh","Attarintiki Daredi","Race Gurram","DJ Duvvada Jagannadham","Janatha Garage",
			"Maharshi","Rangasthalam","Leader","Sye","Kushi"
		};

		String englishMovies[] = {
			"Avatar","Titanic","The Terminator","Terminator 2 Judgment Day","Predator",
			"Alien","Aliens","Rambo First Blood","Rambo First Blood Part II","Rambo III",
			"Rocky","Rocky II","Rocky III","Rocky IV","Jurassic Park",
			"Jurassic World","The Mummy","The Mummy Returns","The Fast and the Furious","Fast Five"
		};

		String malayalamMovies[] = {
			"Drishyam","Drishyam 2","Premam","Bangalore Days","Lucifer",
			"Uyare","Virus","Take Off","Joji","Home",
			"Kumbalangi Nights","Maheshinte Prathikaaram","Charlie","Sudani From Nigeria","Jallikattu",
			"Ayyappanum Koshiyum","Minnal Murali","Kurup","Android Kunjappan","Neram"
		};

		System.out.println("Kannada movies available on SunNXT:");
		for (String kannadaMovie : kannadaMovies) {
			System.out.println(kannadaMovie);
		}

		System.out.println("\nHindi movies available on SunNXT:");
		for (String hindiMovie : hindiMovies) {
			System.out.println(hindiMovie);
		}

		System.out.println("\nTelugu movies available on SunNXT:");
		for (String teluguMovie : teluguMovies) {
			System.out.println(teluguMovie);
		}

		System.out.println("\nEnglish movies available on SunNXT:");
		for (String englishMovie : englishMovies) {
			System.out.println(englishMovie);
		}

		System.out.println("\nMalayalam movies available on SunNXT:");
		for (String malayalamMovie : malayalamMovies) {
			System.out.println(malayalamMovie);
		}
	}
}
