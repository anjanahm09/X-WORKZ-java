class AmazonPrime {
	public static void main(String[] movies) {

		String kannadaMovies[] = {
			"K.G.F Chapter 1","K.G.F Chapter 2","Kantara","777 Charlie","Ugramm",
			"Avane Srimannarayana","Popcorn Monkey Tiger","Bell Bottom","RangiTaranga","Tagaru",
			"Dia","Mayabazar 2016","French Biryani","Hero","Law",
			"Yuvarathnaa","Roberrt","Vikrant Rona","Gaalipata","Rajakumara"
		};

		String hindiMovies[] = {
			"Shershaah","Jai Bhim (Hindi)","Sardar Udham","Gully Boy","Good Newwz",
			"Toofaan","Bhoot Police","Ram Setu","Gehraiyaan","Kabir Singh",
			"Raazi","Andhadhun","Kesari","War","Dilwale",
			"Band Baaja Baaraat","Jab Tak Hai Jaan","Ae Dil Hai Mushkil","Kalank","Mission Mangal"
		};

		String teluguMovies[] = {
			"Baahubali The Beginning","Baahubali The Conclusion","Sita Ramam","Jersey","Rangasthalam",
			"Pushpa The Rise","Maharshi","Ala Vaikunta Puramuloo","Eega","Athade",
			"Leader","Dear Comrade","Vakeel Saab","Bichagadu","Brochevarevarura",
			"Agent Sai Srinivasa Athreya","Mathu Vadalara","Sye","Kushi","Yuvathaa"
		};

		String englishMovies[] = {
			"The Tomorrow War","Without Remorse","Coming 2 America","The Big Sick","Manchester by the Sea",
			"Sound of Metal","Air","Borat Subsequent Moviefilm","Cinderella","The Report",
			"Jack Ryan Shadow Recruit","The Accountant","A Quiet Place Part II","Interstellar","Inception",
			"Tenet","The Wolf of Wall Street","The Great Gatsby","Jurassic World","Top Gun Maverick"
		};

		String malayalamMovies[] = {
			"Drishyam","Drishyam 2","Jai Bhim","Kumbalangi Nights","Bangalore Days",
			"Premam","Joji","Ayyappanum Koshiyum","Take Off","Virus",
			"Uyare","Lucifer","Maheshinte Prathikaaram","Android Kunjappan","Sudani From Nigeria",
			"The Great Indian Kitchen","Home","Minnal Murali","C U Soon","Kurup"
		};
		
		System.out.println("Kannada movies available on Amazon Prime:");
		for(String kannadaMovie : kannadaMovies){
			System.out.println(kannadaMovie);
		}

		System.out.println("\nHindi movies available on Amazon Prime:");
		for(String hindiMovie : hindiMovies){
			System.out.println(hindiMovie);
		}

		System.out.println("\nTelugu movies available on Amazon Prime:");
		for(String teluguMovie : teluguMovies){
			System.out.println(teluguMovie);
		}

		System.out.println("\nEnglish movies available on Amazon Prime:");
		for(String englishMovie : englishMovies){
			System.out.println(englishMovie);
		}

		System.out.println("\nMalayalam movies available on Amazon Prime:");
		for(String malayalamMovie : malayalamMovies){
			System.out.println(malayalamMovie);
		}
	}
}
