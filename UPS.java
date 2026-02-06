class UPS {
	static String brand = "APC";
    static String capacity = "600 VA";
    static String backupTime = "20 Minutes";
    static String inputVoltage = "230V";
    static String outputVoltage = "230V";
    static String batteryType = "Sealed Lead Acid";
    static String protection = "Surge Protection";
    static String usage = "Home and Office";
    static String color = "Black";
    static String warranty = "2 Years Warranty";
    public static void main(String[] args) {
        /*String brand = "APC";
        String capacity = "600 VA";
        String backupTime = "20 Minutes";
        String inputVoltage = "230V";
        String outputVoltage = "230V";
        String batteryType = "Sealed Lead Acid";
        String protection = "Surge Protection";
        String usage = "Home and Office";
        String color = "Black";
        String warranty = "2 Years Warranty";*/

        System.out.println("The brand of the UPS is " + brand + ".");
        System.out.println("The power capacity of the UPS is " + capacity + ".");
        System.out.println("The backup time provided is " + backupTime + ".");
        System.out.println("The input voltage supported is " + inputVoltage + ".");
        System.out.println("The output voltage provided is " + outputVoltage + ".");
        System.out.println("The battery type used is " + batteryType + ".");
        System.out.println("The protection feature included is " + protection + ".");
        System.out.println("The UPS is suitable for " + usage + ".");
        System.out.println("The color of the UPS is " + color + ".");
        System.out.println("The warranty provided is " + warranty + ".");
    }
}
