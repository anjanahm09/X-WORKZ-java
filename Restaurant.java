class Restaurant{
	public static void main(String[] hotel){
		String name = "The Paradise";
		String owner = "Anjana";
		String address = "#14 3rd block 43rd cross JP Nagar";
		String branches[] = {"JP Nagar","RR Nagar","Majestic","BTM Layout","HSR Layout","Navarang"};
		String managers[] = {"Sachin","Keerthi","Manoj","Megha","Thanvika","Lohith"};
		
		System.out.println("The Restaurant information is :");
		System.out.println("The name of the restaurant is : "+name);
		System.out.println("The name of the owner is : "+owner);
		System.out.println("The restaurant address is : "+address);
	    System.out.println("The number of branches are : "+ branches.length);
	    System.out.println("The list of the branches available are : ");
		for(String branch : branches){
			System.out.println(branch);
		}
		System.out.println("The number of managers are : "+managers.length);
		System.out.println("The list of managers available are : ");
		for(String manager : managers){
			System.out.println(manager);
		}
	}
}