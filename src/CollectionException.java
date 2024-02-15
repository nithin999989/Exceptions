import java.util.ArrayList;

 public class CollectionException {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(10);

        System.out.println("Integers entered:");
        for (Integer num : numbers) {
            try {
                int result = 10 / num;
                System.out.println(num + " (10 / " + num + " = " + result + ")");
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero for input " + num);
            }
        }
    }
}
