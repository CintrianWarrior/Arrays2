public class Main {
    public static void main(String[] args) {
        int [] dailyExpenses = generateRandomArray();
        int maxDailyExpenses = -1;
        int minDailyExpenses = 200_001;
        for (int i = 0; i < dailyExpenses.length; i++) {
            System.out.println(dailyExpenses[i]);
            if (dailyExpenses[i] > maxDailyExpenses) {
                maxDailyExpenses = dailyExpenses[i];
            }
            if (dailyExpenses[i] < minDailyExpenses) {
                minDailyExpenses = dailyExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDailyExpenses + " рублей. Максимальная сумма трат за день составила " + maxDailyExpenses + " рублей.");
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