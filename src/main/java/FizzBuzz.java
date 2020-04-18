import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> runGame(int rounds) {
        List<String> values = new ArrayList<String>();
        for (int number = 1; number <= rounds; number++) {
            values.add(checkNumber(number));
        }
        return values;
    }

    public String checkNumber(Integer number) {
        return isDivisibleByThreeAndFive(number) ? "FizzBuzz"
                : isDivisibleByThree(number) ? "Fizz"
                : isDivisibleByFive(number) ? "Buzz"
                : number.toString();
    }

    public boolean isDivisibleByThree(int number) {
        return ((number % 3) == 0);
    }

    public boolean isDivisibleByFive(int number) {
        return ((number % 5) == 0);
    }

    public boolean isDivisibleByThreeAndFive(int number) {
        return ((number % 3) == 0) && ((number % 5) == 0);
    }

}
