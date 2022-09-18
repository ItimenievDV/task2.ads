public class MyException extends RuntimeException{
    @Override
    public String getMessage(){
        return "Wrong number!";
    }
}