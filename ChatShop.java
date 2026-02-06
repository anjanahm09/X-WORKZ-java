class ChatShop {
	public static void main(String[] chats) {

		String chatNames[] = {
			"Pani Puri","Masala Puri","Bhel Puri","Sev Puri","Dahi Puri","Papdi Chat","Aloo Chat","Ragda Pattice","Samosa Chat","Kachori Chat","Cutlet Chat","Corn Chat","Fruit Chat","Chana Chat","Tikki Chat"};

		String teaNames[] = {
			"Normal Tea","Ginger Tea","Masala Tea","Elaichi Tea","Lemon Tea","Green Tea","Black Tea","Tulsi Tea","Honey Tea","Mint Tea","Chocolate Tea","Cardamom Tea","Saffron Tea","Badam Tea","Irani Tea"};
	
        //String chatNamesFromArray = chatNames[0];
        //String teaNamesFromArray = teaNames[0];

        //System.out.println(chatNamesFromArray + " , "+ teaNamesFromArray);		
	    
		System.out.println("List of chats available in chat shop are :");
		for(String chatName : chatNames){
			System.out.println(chatName);
		}
	}
}
