public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 7, 2, 1, 8, 9};
        int index = minValue(arr);
        System.out.println("GTNN trong mang la : " + minValue(arr) + " o vi tri thu " + (arr[index]+1));
    }

    static int minValue(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }

        return min;
    }
}
