class Printer {
	static String brand = "HP";
    static String model = "DeskJet 2331";
    static String type = "Inkjet Printer";
    static String functions = "Print, Scan, Copy";
    static String colorPrint = "Yes";
    static String connectivity = "USB";
    static String paperSize = "A4";
    static String printSpeed = "7.5 ppm";
    static String color = "White";
    static String warranty = "1 Year Warranty";
    public static void main(String[] args) {
        /*String brand = "HP";
        String model = "DeskJet 2331";
        String type = "Inkjet Printer";
        String functions = "Print, Scan, Copy";
        String colorPrint = "Yes";
        String connectivity = "USB";
        String paperSize = "A4";
        String printSpeed = "7.5 ppm";
        String color = "White";
        String warranty = "1 Year Warranty";*/

        System.out.println("The brand of the printer is " + brand + ".");
        System.out.println("The model of the printer is " + model + ".");
        System.out.println("The printer type is " + type + ".");
        System.out.println("The functions supported are " + functions + ".");
        System.out.println("Color printing support is " + colorPrint + ".");
        System.out.println("The connectivity option provided is " + connectivity + ".");
        System.out.println("The supported paper size is " + paperSize + ".");
        System.out.println("The printing speed is " + printSpeed + ".");
        System.out.println("The color of the printer is " + color + ".");
        System.out.println("The warranty provided is " + warranty + ".");
    }
}
