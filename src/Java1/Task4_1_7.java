package Java1;

public class Task4_1_7 {

    static public void testExp() throws MyNewException {
        throw new MyNewException();

    }

    static class MyNewException extends Exception{

    }

    public static void main(String[] args) throws MyNewException {
        testExp();
    }
}
