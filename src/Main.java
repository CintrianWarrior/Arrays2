public class Main {
    public static void main(String[] args) {
        int [] dailyExpenses = generateRandomArray();
        int total = 0;
        for (int i = 0; i < dailyExpenses.length; i++) {
            total = total + dailyExpenses[i];
        }
        double averageDailyExpenses = (total / dailyExpenses.length);
        System.out.println("Средняя сумма трат за месяц составила " + averageDailyExpenses + " рублей.");
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    }