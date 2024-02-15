public class Exceptionexample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception 1 caught: " + e);
        } finally {
            System.out.println("Finally block for Exception 1");
        }

        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception 2 caught: " + e);
        } finally {
            System.out.println("Finally block for Exception 2");
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception 3 caught: " + e);
        } finally {
            System.out.println("Finally block for Exception 3");
        }
    }
}
