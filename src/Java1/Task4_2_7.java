package Java1;

public class Task4_2_7 {

    public static class Car implements AutoCloseable {

        @Override
        public void close() throws Exception {
            try {
                System.out.println("������ �����������...");
            } catch (RuntimeException e) {
            }
        }

        void drive() {
            System.out.println("������ �������.");
        }
    }

    public static void main(String... args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
