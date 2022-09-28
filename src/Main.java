import java.util.Arrays;

public class Main {
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
            }
    public static void main(String[] args) {
        int[] arr1 = generateRandomArray();

        for (int i = 0; i <arr1.length ; i++) {
        System.out.println(arr1 [i]);
        }

        //Задача1
        System.out.println("Задача1");
        int monthlyAmount = 0;
        for (int i = 0; i < arr1.length; i++) {
            monthlyAmount = monthlyAmount + arr1[i];
        }
        System.out.println("Сумма трат за месяц составила " + monthlyAmount + " рублей.");

        //Задача2
        System.out.println("Задача2");
        int min = 200_000;
        int max = 0;
        for (int i = 0; i <arr1.length ; i++){
            if (arr1[i] < min) { min=arr1[i];}
            if (arr1[i] > max) { max=arr1[i];}
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей. ");

        //Задача3
        System.out.println("Задача3");

        if (monthlyAmount% arr1.length==0) {
            System.out.println("Среднее по всем тратам = " + monthlyAmount/arr1.length);
        }
        else {float sred=monthlyAmount*1.00f/ arr1.length;
            System.out.println("Средняя сумма трат за месяц составила " + sred + " рублей.");}

        //Задача4
        System.out.println("Задача4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
               for (int i = reverseFullName.length - 1; i >= 0; i--) {
                    System.out.print(reverseFullName[i]);
        }

    }
    }




