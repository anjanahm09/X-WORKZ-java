class Theater {
	public static void main(String[] theaterDetails) {

		String theaterName = "INOX";
		String location = "Garuda Mall";

		String screenNames[] = {
			"Screen 1","Screen 2","Screen 3","Screen 4"
		};

		String movieFormats[] = {
			"2D","3D","IMAX"
		};

		String foodItems[] = {
			"Popcorn","Nachos","Burger","Cold Drink"
		};

		String showTimes[] = {
			"10:00 AM","1:30 PM","5:00 PM","9:30 PM"
		};

		String ticketTypes[] = {
			"Silver","Gold","Platinum"
		};

		System.out.println("Theater Name: " + theaterName);
		System.out.println("Location: " + location);

		System.out.println("Screens:");
		for (String screen : screenNames) {
			System.out.println(screen);
		}

		System.out.println("Formats:");
		for (String format : movieFormats) {
			System.out.println(format);
		}

		System.out.println("Food Items:");
		for (String food : foodItems) {
			System.out.println(food);
		}

		System.out.println("Show Timings:");
		for (String time : showTimes) {
			System.out.println(time);
		}

		System.out.println("Ticket Types:");
		for (String ticket : ticketTypes) {
			System.out.println(ticket);
		}
	}
}
