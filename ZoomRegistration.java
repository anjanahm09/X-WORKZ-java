class ZoomRegistration {
    public static void main(String[] args) {
        String fullName = "Anjana HM";
        String email = "anjana@gmail.com";
        String password = "zoom@123";
        String accountType = "Free";
        String timeZone = "IST";
        boolean twoFactorAuth = false;
        boolean emailVerified = true;

        System.out.println("Zoom Registration Form");
        System.out.println("Full Name : " + fullName);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("Account Type : " + accountType);
        System.out.println("Time Zone : " + timeZone);
        System.out.println("2FA Enabled : " + twoFactorAuth);
        System.out.println("Email Verified : " + emailVerified);
    }
}
