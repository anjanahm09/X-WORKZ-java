class Bank {
	public static void main(String[] bankDetails) {

		String bankName = "HDFC Bank";
		String branch = "BTM Layout";
		String ifscCode = "HDFC0000456";

		String accountTypes[] = {
			"Savings","Current","Fixed Deposit","Recurring Deposit"
		};

		String loanTypes[] = {
			"Home Loan","Car Loan","Education Loan","Personal Loan"
		};

		String services[] = {
			"ATM","Net Banking","Mobile Banking","Locker"
		};

		String employees[] = {
			"Ramesh","Suman","Kiran","Neha","Ajay"
		};

		String atmLocations[] = {
			"BTM","JP Nagar","HSR","Electronic City"
		};

		System.out.println("Bank Name: " + bankName);
		System.out.println("Branch: " + branch);
		System.out.println("IFSC Code: " + ifscCode);

		System.out.println("Account Types:");
		for (String account : accountTypes) {
			System.out.println(account);
		}

		System.out.println("Loan Types:");
		for (String loan : loanTypes) {
			System.out.println(loan);
		}

		System.out.println("Services:");
		for (String service : services) {
			System.out.println(service);
		}

		System.out.println("Employees:");
		for (String employee : employees) {
			System.out.println(employee);
		}

		System.out.println("ATM Locations:");
		for (String atm : atmLocations) {
			System.out.println(atm);
		}
	}
}
