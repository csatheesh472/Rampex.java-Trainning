package Day7.Homework_Task;

class Find_Sum {
    public static void main(String[] args) {
        int number = 543;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
