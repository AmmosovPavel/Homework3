public class Array {
    public static void main(String[] args) {
        int[] array = new int[17];
        array[0] = 100;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] - 6;
            System.out.println(array[i]);
        }
    }

}
