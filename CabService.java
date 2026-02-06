class CabService {
	public static void main(String[] cabDetails) {

		String companyName = "Uber";
		String headOffice = "San Francisco";

		String cabTypes[] = {
			"Mini","Sedan","SUV","Auto","Bike"
		};

		String driverNames[] = {
			"Raju","Suresh","Manoj","Deepak","Arjun"
		};

		String paymentModes[] = {
			"Cash","UPI","Debit Card","Credit Card"
		};

		String serviceCities[] = {
			"Bengaluru","Chennai","Hyderabad","Mumbai"
		};

		String rideCategories[] = {
			"Daily Ride","Outstation","Rental","Airport"
		};

		System.out.println("Cab Company: " + companyName);
		System.out.println("Head Office: " + headOffice);

		System.out.println("Cab Types:");
		for (String cab : cabTypes) {
			System.out.println(cab);
		}

		System.out.println("Drivers:");
		for (String driver : driverNames) {
			System.out.println(driver);
		}

		System.out.println("Payment Modes:");
		for (String payment : paymentModes) {
			System.out.println(payment);
		}

		System.out.println("Cities:");
		for (String city : serviceCities) {
			System.out.println(city);
		}

		System.out.println("Ride Categories:");
		for (String ride : rideCategories) {
			System.out.println(ride);
		}
	}
}
