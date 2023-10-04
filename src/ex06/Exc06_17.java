package ex06;

public class Exc06_17 {

    static int[] shuffle(int[] arr){
        int tmp;

        for (int i = 0; i < arr.length; i++) {
            int n = (int) (Math.random() * 9);
            tmp = arr[i];
            arr[i] = arr[n];
            arr[n] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(original));
    }
}
