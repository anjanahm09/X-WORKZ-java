class SuperMarket {
	public static void main(String[] market) {

		String rice[] = {
			"Basmati Rice","Sona Masoori","Ponni Rice","Brown Rice","Jeera Rice","Idli Rice","Matta Rice","Kolam Rice","Broken Rice","Steam Rice",
			"Raw Rice","Mini Mogra","Gobind Bhog","Seeraga Samba","Black Rice","Red Rice","Organic Rice","Parboiled Rice","Wild Rice","Sticky Rice",
			"Short Grain","Long Grain","Medium Grain","Rice Flour","Rice Bran"};

		String dal[] = {
			"Toor Dal","Moong Dal","Masoor Dal","Chana Dal","Urad Dal","Green Gram","Black Gram","Split Moong","Whole Moong","Split Urad",
			"Whole Urad","Arhar Dal","Yellow Dal","Red Dal","Organic Dal","Protein Dal","Sprouted Dal","Loose Dal","Packed Dal","Diet Dal",
			"Instant Dal","Roasted Dal","Dal Flour","Premium Dal","Low Fat Dal"};

		String oils[] = {
			"Sunflower Oil","Groundnut Oil","Coconut Oil","Mustard Oil","Palm Oil","Olive Oil","Rice Bran Oil","Soybean Oil","Sesame Oil","Corn Oil",
			"Canola Oil","Vegetable Oil","Refined Oil","Cold Pressed Oil","Organic Oil","Extra Virgin Oil","Light Oil","Filtered Oil","Pure Oil",
			"Healthy Oil","Natural Oil","Cooking Oil","Premium Oil","Diet Oil","Virgin Oil"};

		String biscuits[] = {
			"Parle G","Good Day","Marie Gold","Hide & Seek","Oreo","Bourbon","50-50","Milk Bikis","Little Hearts","Nice Time",
			"Digestive","Butter Cookies","Chocolate Cookies","Cream Biscuits","Salt Biscuits","Glucose Biscuits","Wheat Biscuits",
			"Kids Biscuits","Multigrain","Sugar Free","Premium Biscuits","Mini Pack","Family Pack","Jumbo Pack","Diet Biscuits"};

		String dairy[] = {
			"Milk","Curd","Butter","Ghee","Cheese","Paneer","Cream","Flavored Milk","Lassi","Buttermilk",
			"Milk Powder","Condensed Milk","Fresh Cream","Greek Yogurt","Skim Milk","Toned Milk","Full Cream Milk","Low Fat Milk",
			"Organic Milk","Cow Milk","Buffalo Milk","Cheese Slices","Cheese Cubes","Ice Cream","Milk Shake"};

		String snacks[] = {
			"Potato Chips","Banana Chips","Mixture","Murukku","Aloo Bhujia","Peanuts","Popcorn","Nachos","Cheese Balls","Salted Nuts",
			"Roasted Chana","Fryums","Corn Puffs","Masala Chips","Spicy Sticks","Khara Sev","Moong Dal Snack","Soya Chips","Makhana",
			"Diet Snacks","Protein Snacks","Kids Snacks","Party Snacks","Crunchy Bites","Healthy Snacks"};

		String chocolates[] = {
			"Dairy Milk","KitKat","5 Star","Munch","Perk","Snickers","Mars","Galaxy","Ferrero Rocher","Toblerone",
			"Milky Bar","Dark Chocolate","White Chocolate","Fruit & Nut","Caramel Chocolate","Mint Chocolate","Hazelnut Chocolate",
			"Premium Chocolate","Kids Chocolate","Sugar Free Chocolate","Assorted Chocolate","Mini Chocolate","Family Pack",
			"Gift Pack","Imported Chocolate"};

		String beverages[] = {
			"Tea","Coffee","Green Tea","Black Tea","Herbal Tea","Instant Coffee","Cold Coffee","Soft Drink","Energy Drink",
			"Fruit Juice","Lemon Juice","Orange Juice","Apple Juice","Mango Juice","Mixed Fruit Juice","Soda","Tonic Water",
			"Milk Shake","Flavored Water","Iced Tea","Sports Drink","Diet Drink","Premium Coffee","Filter Coffee","Cold Drink"};

		String fruits[] = {
			"Apple","Banana","Orange","Grapes","Mango","Pineapple","Papaya","Watermelon","Guava","Pomegranate",
			"Strawberry","Blueberry","Kiwi","Peach","Plum","Pear","Chikoo","Custard Apple","Dragon Fruit","Fig",
			"Dates","Apricot","Raspberry","Blackberry","Lychee"};

		String vegetables[] = {
			"Potato","Tomato","Onion","Carrot","Cabbage","Cauliflower","Beans","Brinjal","Lady Finger","Capsicum",
			"Spinach","Radish","Beetroot","Cucumber","Pumpkin","Bottle Gourd","Bitter Gourd","Ridge Gourd",
			"Green Peas","Corn","Broccoli","Mushroom","Sweet Potato","Garlic","Ginger"};

		String stationery[] = {
			"Pen","Pencil","Eraser","Sharpener","Scale","Notebook","Drawing Book","Sketch Pens","Crayons","Highlighter",
			"Marker","Stapler","Paper Clips","Glue Stick","Correction Pen","Calculator","Compass Box","Sticky Notes",
			"White Board Marker","File Folder","Exam Pad","Color Pencils","Diary","Chart Paper","Graph Book"};

		String clothes[] = {
			"T-Shirt","Shirt","Jeans","Trousers","Shorts","Kurta","Kurti","Saree","Salwar Suit","Dupatta",
			"Jacket","Sweater","Hoodie","Track Pants","Leggings","Skirt","Top","Blazer","Night Suit","Inner Wear",
			"Socks","Raincoat","Sports Wear","Traditional Wear","Casual Wear"};

		String cosmetics[] = {
			"Lipstick","Lip Balm","Foundation","Compact Powder","Blush","Eyeliner","Kajal","Mascara","Nail Polish",
			"Makeup Remover","Face Cream","BB Cream","Face Wash","Face Scrub","Face Mask","Perfume","Deodorant",
			"Body Lotion","Sunscreen","Primer","Highlighter","Concealer","Makeup Brush","Beauty Blender","Cosmetic Kit"};

		String footwear[] = {
			"Shoes","Sandals","Slippers","Sports Shoes","Formal Shoes","Casual Shoes","Heels","Flats","Loafers","Boots",
			"Sneakers","Flip Flops","School Shoes","Office Shoes","Running Shoes","Trekking Shoes","Leather Shoes",
			"Kids Shoes","Women Footwear","Men Footwear","Ethnic Footwear","Party Wear","Comfort Wear","Daily Wear",
			"Designer Footwear"};

		String electronics[] = {
			"Mobile Phone","Smartphone","Feature Phone","Tablet","Laptop","Desktop","Monitor","Keyboard","Mouse","Printer",
			"Scanner","Router","Modem","Power Bank","Charger","Headphones","Earphones","Bluetooth Speaker","Smart Watch",
			"Fitness Band","Camera","Webcam","Pendrive","Hard Disk","Memory Card"};

		String cleaning[] = {
			"Detergent Powder","Detergent Liquid","Dish Wash Liquid","Dish Wash Bar","Floor Cleaner","Toilet Cleaner",
			"Glass Cleaner","Phenyl","Bleach","Scrub Pad","Cleaning Cloth","Broom","Mop","Bucket","Dustbin","Hand Wash",
			"Surface Cleaner","Room Freshener","Insect Killer","Mosquito Repellent","Garbage Bags","Cleaning Gloves",
			"Liquid Soap","Disinfectant","All Purpose Cleaner"};

		String toiletries[] = {
			"Soap","Shampoo","Conditioner","Body Wash","Face Wash","Toothpaste","Toothbrush","Mouthwash","Razor",
			"Shaving Cream","After Shave","Hair Oil","Hair Gel","Hair Serum","Comb","Talcum Powder","Cotton",
			"Sanitary Pads","Toilet Paper","Wet Wipes","Hand Sanitizer","Body Spray","Perfumed Soap",
			"Herbal Shampoo","Baby Soap"};

		String babyProducts[] = {
			"Baby Diapers","Baby Wipes","Baby Soap","Baby Shampoo","Baby Lotion","Baby Powder","Baby Oil","Baby Cream",
			"Feeding Bottle","Pacifier","Baby Food","Cereal","Infant Formula","Baby Blanket","Baby Towel",
			"Baby Clothes","Baby Socks","Baby Shoes","Baby Carrier","Baby Toy","Teething Toy",
			"Baby Shampoo Herbal","Baby Massage Oil","Baby Bib","Baby Kit"};

		String bakery[] = {
			"Bread","Brown Bread","White Bread","Multigrain Bread","Buns","Pav","Cake","Pastry","Cookies","Cup Cake",
			"Donut","Rusk","Toast","Garlic Bread","Pizza Base","Croissant","Muffin","Swiss Roll","Plum Cake",
			"Fruit Cake","Dry Cake","Cream Cake","Eggless Cake","Bakery Biscuits","Bakery Snacks"};

		String frozenFoods[] = {
			"Frozen Peas","Frozen Corn","Frozen French Fries","Frozen Nuggets","Frozen Pizza","Frozen Paratha",
			"Frozen Roti","Frozen Idli","Frozen Dosa","Frozen Vada","Frozen Samosa","Frozen Cutlet","Frozen Momos",
			"Frozen Spring Roll","Frozen Burger Patty","Frozen Fish","Frozen Chicken","Frozen Prawns","Frozen Paneer",
			"Frozen Veg Mix","Frozen Fruits","Frozen Dessert","Frozen Ice Cream","Frozen Snacks","Frozen Meals"};

		System.out.println("List of rice varieties available in the supermarket:");
		for(String riceList : rice){
			System.out.println(riceList);
        }
		System.out.println("List of dal varieties available in the supermarket:");
		for(String dalList : dal) {
			System.out.println(dalList);
		}

		System.out.println("List of cooking oils available in the supermarket:");
		for(String oilList : oils){
			System.out.println(oilList);
		}

		System.out.println("List of biscuit brands available in the supermarket:");
		for(String biscuitList : biscuits){
			System.out.println(biscuitList);
		}

		System.out.println("List of dairy products available in the supermarket:");
		for(String dairyList : dairy){
			System.out.println(dairyList);
		}

		System.out.println("List of snack items available in the supermarket:");
		for(String snackList : snacks) {
			System.out.println(snackList);
		}

		System.out.println("List of chocolate products available in the supermarket:");
		for(String chocolateList : chocolates){
			System.out.println(chocolateList);
		}

		System.out.println("List of beverage items available in the supermarket:");
		for(String beverageList : beverages){
			System.out.println(beverageList);
		}

		System.out.println("List of fresh fruits available in the supermarket:");
		for(String fruitList : fruits){
			System.out.println(fruitList);
		}

		System.out.println("List of fresh vegetables available in the supermarket:");
		for(String vegetableList : vegetables){
			System.out.println(vegetableList);
		}

		System.out.println("List of stationery items available in the supermarket:");
		for(String stationeryList : stationery){
			System.out.println(stationeryList);
		}

		System.out.println("List of clothing items available in the supermarket:");
		for(String clothesList : clothes){
			System.out.println(clothesList);
		}

		System.out.println("List of cosmetic products available in the supermarket:");
		for(String cosmeticList : cosmetics) {
			System.out.println(cosmeticList);
		}

		System.out.println("List of footwear items available in the supermarket:");
		for(String footwearList : footwear){
			System.out.println(footwearList);
		}

		System.out.println("List of electronic items available in the supermarket:");
		for(String electronicList : electronics){
			System.out.println(electronicList);
		}

		System.out.println("List of cleaning and household products available in the supermarket:");
		for(String cleaningList : cleaning){
			System.out.println(cleaningList);
		}

		System.out.println("List of toiletries and personal care products available in the supermarket:");
		for(String toiletryList : toiletries){
			System.out.println(toiletryList);
		}

		System.out.println("List of baby care products available in the supermarket:");
		for(String babyProductList : babyProducts){
			System.out.println(babyProductList);
		}

		System.out.println("List of bakery items available in the supermarket:");
		for(String bakeryList : bakery){
			System.out.println(bakeryList);
		}

		System.out.println("List of frozen food items available in the supermarket:");
		for(String frozenFoodList : frozenFoods){
			System.out.println(frozenFoodList);
		}
	}
}
