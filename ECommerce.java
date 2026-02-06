class ECommerce {
	public static void main(String[] siteDetails) {

		String siteName = "Flipkart";
		String founder = "Sachin Bansal";

		String productCategories[] = {
			"Electronics","Fashion","Grocery","Books","Furniture"
		};

		String paymentOptions[] = {
			"UPI","Credit Card","Debit Card","COD"
		};

		String deliveryPartners[] = {
			"Ecart","Delhivery","Blue Dart"
		};

		String offers[] = {
			"Bank Offer","Festival Sale","No Cost EMI"
		};

		String customerSupportModes[] = {
			"Chat","Email","Phone Call"
		};

		System.out.println("Website Name: " + siteName);
		System.out.println("Founder: " + founder);

		System.out.println("Categories:");
		for (String category : productCategories) {
			System.out.println(category);
		}

		System.out.println("Payment Options:");
		for (String payment : paymentOptions) {
			System.out.println(payment);
		}

		System.out.println("Delivery Partners:");
		for (String partner : deliveryPartners) {
			System.out.println(partner);
		}

		System.out.println("Offers:");
		for (String offer : offers) {
			System.out.println(offer);
		}

		System.out.println("Customer Support Modes:");
		for (String mode : customerSupportModes) {
			System.out.println(mode);
		}
	}
}
