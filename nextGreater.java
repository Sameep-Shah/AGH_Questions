import java.util.Arrays;

public class nextGreater {

    public void findNextGreater(int ar[], int n) {

        int i;
        n = ar.length;
        if (n == 2) {
            System.out.println("Number should be atleast 3 digits");
        }
        // start from right most number and find the forst number that is smaller
        // then the number next to it
        else {
            for (i = n - 1; i > 0; i--) {
                if (ar[i] > ar[i - 1]) {
                    break;
                }

            }

            // If no such number is found than the given array is in descending
            // order and there is no greater possible number
            if (i == 0) {
                System.out.println("Not possible");
            } else {
                int x = ar[i - 1], min = i;

                // finding smallest digit on right side of (i-1) that is
                // greater then (i-1)
                for (int j = i + 1; j < n; j++) {
                    if (ar[j] > x && ar[j] < ar[min]) {
                        min = j;
                    }
                }

                // Swapping smallest digit found with i-1th digit
                int temp = ar[i - 1];
                ar[i - 1] = ar[min];
                ar[min] = temp;

                // Sort the digits after (i-1) in ascending order
                Arrays.sort(ar, i, n);
                System.out.print("Next number with same" + " set of digits is ");
                for (i = 0; i < n; i++)
                    System.out.print(ar[i]);
            }
        }
    }

    public static void main(String[] args) {
        int digits1[] = { 5, 4, 3, 2 };
        int n1 = digits1.length;
        int digits2[] = { 2, 3, 4 };
        int n2 = digits1.length;
        int digits3[] = { 1, 2 };
        int n3 = digits1.length;
        int digits4[] = { 4, 5, 2, 6 };
        int n4 = digits1.length;
        // checking the condition that the given number should have atleast 3 digits.

        nextGreater ng = new nextGreater();

        ng.findNextGreater(digits1, n1);
        System.out.println();
        ng.findNextGreater(digits2, n2);
        System.out.println();
        ng.findNextGreater(digits3, n3);
        System.out.println();
        ng.findNextGreater(digits4, n4);

    }
}
