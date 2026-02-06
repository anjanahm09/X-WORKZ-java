class Netflix {
	public static void main(String[] movies) {

		String kannadaMovies[] = {
			"Kantara","U Turn","Avane Srimannarayana","K.G.F Chapter 1","K.G.F Chapter 2",
			"Love Mocktail","Love Mocktail 2","Dia","Bell Bottom","Operation Alamelamma",
			"Hero","Gaalipata","777 Charlie","Tagaru","Kirik Party",
			"Ulidavaru Kandanthe","Popcorn Monkey Tiger","Mayabazar 2016","RangiTaranga","French Biryani"
		};

		String hindiMovies[] = {
			"Dangal","Andhadhun","Drishyam","Article 15","Ludo",
			"Badla","Gunjan Saxena","Chandramukhi 2","Kathal","Jaane Jaan",
			"Mission Majnu","RRR","Bajrangi Bhaijaan","Barfi","Dil Se",
			"Rockstar","Tamasha","PK","Sanju","Zindagi Na Milegi Dobara"
		};

		String teluguMovies[] = {
			"Baahubali The Beginning","Baahubali The Conclusion","RRR","Jersey","Rangasthalam",
			"Pushpa The Rise","Eega","Athade","Ala Vaikunta Puramuloo","Maharshi",
			"Sye","Kushi","Leader","Oopiri","Dear Comrade",
			"Brochevarevarura","Mathu Vadalara","Agent Sai Srinivasa Athreya","Bichagadu","Yuvathaa"
		};

		String tamilMovies[] = {
			"Vikram","Master","Jailer","Doctor","Beast",
			"Asuran","Soorarai Pottru","Karnan","Super Deluxe","Kaithi",
			"Visaranai","Jagame Thandhiram","Thunivu","Valimai","Nayakan",
			"Vada Chennai","Pizza","96","Sivaji","Anbe Sivam"
		};

		String malayalamMovies[] = {
			"Drishyam","Drishyam 2","Minnal Murali","Kurup","Uyare",
			"Jallikattu","Kumbalangi Nights","Android Kunjappan","Take Off","Virus",
			"Premam","Bangalore Days","Maheshinte Prathikaaram","Lucifer","Joji",
			"Sudani From Nigeria","C U Soon","Ayyappanum Koshiyum",
			"The Great Indian Kitchen","Home"
		};

		System.out.println("List of Kannada movies available on Netflix:");
		for(String kannadaMovie : kannadaMovies){
			System.out.println(kannadaMovie);
		}

		System.out.println("\nList of Hindi movies available on Netflix:");
		for(String hindiMovie : hindiMovies){
			System.out.println(hindiMovie);
		}

		System.out.println("\nList of Telugu movies available on Netflix:");
		for(String teluguMovie : teluguMovies){
			System.out.println(teluguMovie);
		}

		System.out.println("\nList of Tamil movies available on Netflix:");
		for(String tamilMovie : tamilMovies){
			System.out.println(tamilMovie);
		}

		System.out.println("\nList of Malayalam movies available on Netflix:");
		for(String malayalamMovie : malayalamMovies){
			System.out.println(malayalamMovie);
		}
	}
}
