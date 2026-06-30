package Day7.Homework_Task;

class Even_Odd_count {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 20, 33, 42, 55};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}

