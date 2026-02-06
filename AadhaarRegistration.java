class AadhaarRegistration {
    public static void main(String[] args) {
        String fullName = "Anjana HM";
        String gender = "Female";
        String dateOfBirth = "12-05-2002";
        String address = "Mysore, Karnataka";
        long mobileNumber = 9876543210L;
        String biometricType = "Fingerprint & Iris";
        boolean documentsVerified = true;
        String enrollmentCenter = "UIDAI Mysore";

        System.out.println("Aadhaar Registration Form");
        System.out.println("Full Name : " + fullName);
        System.out.println("Gender : " + gender);
        System.out.println("Date of Birth : " + dateOfBirth);
        System.out.println("Address : " + address);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Biometric Type : " + biometricType);
        System.out.println("Documents Verified : " + documentsVerified);
        System.out.println("Enrollment Center : " + enrollmentCenter);
    }
}
