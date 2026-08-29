class calculator {
    public static void main(String[] args) {
        double a = 10;
        double b = 4;
        char op = '+';

        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/':
                if (b == 0)
                    System.out.println("Cannot divide by zero");
                else
                    System.out.println(a / b);
                break;
            default: System.out.println("Invalid operator");
        }
    }
}