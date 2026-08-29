class login {
    public static void main(String[] args) {
        String correct = "1234";
        String[] attempts = {"0000", "1234", "9999"};

        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i].equals(correct)) {
                System.out.println("Access granted on attempt " + (i + 1));
                break;
            }
        }
    }
}