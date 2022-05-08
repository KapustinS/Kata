package Java1;

public class Task4_1_8 {

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] stackTraceElement = new Throwable().getStackTrace();
        String output = null;

        if (stackTraceElement.length >= 3) {
            output = stackTraceElement[2].getClassName() + "#" + stackTraceElement[2].getMethodName();
        }

        return output;
    }

    static void method2(){
        getCallerClassAndMethodName();
        System.out.println(getCallerClassAndMethodName());
    }

    public static void main(String[] args) {
        method2();
    }
}
