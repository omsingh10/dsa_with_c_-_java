package javaquestions;

// WAP to display binary number of a whole number using 8421 method
public class q1 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1}; // 8421 weights
        int num = 5; // example number

        System.out.print("Binary of " + num + " = ");

        for (int i = 0; i < arr.length; i++) {
            if (num >= arr[i]) {
                System.out.print(1);
                num -= arr[i];
            } else {
                System.out.print(0);
            }
        }
        System.out.println();
    }
}
