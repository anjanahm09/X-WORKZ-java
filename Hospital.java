class Hospital {
	public static void main(String[] hospitalDetails) {

		String name = "Apollo Hospital";
		String founder = "Dr. Prathap C Reddy";
		String address = "Bannerghatta Road, Bengaluru";
		String hospitalType = "Multi-Specialty";

		String departments[] = {
			"Cardiology","Neurology","Orthopedics",
			"Pediatrics","Oncology","Dermatology"
		};

		String doctors[] = {
			"Dr. Sharma","Dr. Meenakshi","Dr. Rahul",
			"Dr. Ananya","Dr. Karthik"
		};

		String nurses[] = {
			"Anu","Radhika","Suma","Kavya","Divya"
		};

		String facilities[] = {
			"Emergency","ICU","Pharmacy","Ambulance","Lab"
		};

		String operationTheaters[] = {
			"OT-1","OT-2","OT-3"
		};

		System.out.println("Hospital Name: " + name);
		System.out.println("Founder: " + founder);
		System.out.println("Address: " + address);
		System.out.println("Hospital Type: " + hospitalType);

		System.out.println("Departments:");
		for (String department : departments) {
			System.out.println(department);
		}

		System.out.println("Doctors:");
		for (String doctor : doctors) {
			System.out.println(doctor);
		}

		System.out.println("Nurses:");
		for (String nurse : nurses) {
			System.out.println(nurse);
		}

		System.out.println("Facilities:");
		for (String facility : facilities) {
			System.out.println(facility);
		}

		System.out.println("Operation Theaters:");
		for (String ot : operationTheaters) {
			System.out.println(ot);
		}
	}
}
