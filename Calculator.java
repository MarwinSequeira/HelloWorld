class Calculator{
    public static void main(String args[]) {
        int first_number = Integer.valueOf(args[0]);
        int second_number = Integer.valueOf(args[1]);
        System.out.println("Addition of "+first_number+" and "+second_number+" is "+(first_number+second_number));
        System.out.println("Subtraction "+first_number+" and "+second_number+" is "+(first_number-second_number));

    }
}