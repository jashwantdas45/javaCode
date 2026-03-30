class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Java");

        int num = 1234;
        int reverse = 0;

        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Number is " + reverse);
    }
}