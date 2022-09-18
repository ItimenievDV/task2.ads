import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            printFilteredNumber(generateNumber());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    private static void printFilteredNumber(Integer number){
        Integer filtered = Optional.of(number)
                .filter(i -> i > 5)
                .orElseThrow(MyException::new);
        System.out.println(filtered);
    }

    private static Integer generateNumber(){
        return new Random().nextInt(10);
    }
}