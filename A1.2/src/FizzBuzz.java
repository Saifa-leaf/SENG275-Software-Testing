public class FizzBuzz {

    public static String fizzBuzzFunction(int n) {

        if (n%3 == 0) {
            if (n%5 == 0) {
                return "FizzBuzz!";
            }
            return "Fizz!";
        } else if (n%5 == 0) {
            return "Buzz!";
        }
        return (Integer.toString(n) + "!");
    }
}