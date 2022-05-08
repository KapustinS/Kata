package Java1;

public class Task2_4_16 {

    public static void printOddNumbers(int[] arr) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result = result.append(arr[i]).append(",");
            }
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 5, 77, 88};
        printOddNumbers(arr);
        System.out.println((char)(2 & 0xff));
    }


}
