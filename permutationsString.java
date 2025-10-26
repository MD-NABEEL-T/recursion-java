public class PermutationsString {

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permute(char[] arr, int idx) {
        if (idx == arr.length) {
            System.out.println(String.valueOf(arr));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, i, idx);           // choose
            permute(arr, idx + 1);       // explore
            swap(arr, i, idx);           // backtrack
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permute(str.toCharArray(), 0);
    }
}
