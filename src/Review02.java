public class Review02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 || i % 10 == 5 || i / 10 == 5) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 || i % 10 == 3 || i / 10 == 3) {

                System.out.println("Fizz");
            }  else {
                System.out.println(i);

            }
        }

    }
}