package Java1;

public class Task3_3_11 {

    public static class Cat {

        public void sayHello() {
            System.out.println("���!");
        }
    }

    public static class Dog {

        public void sayHello() {
            System.out.println("���!");
        }

        public void catchCat(Cat cat) {
            Cat cat1 = new Cat();
            cat1 = cat;
            Dog dog1 = new Dog();

            System.out.println("����� �������");

            dog1.sayHello();
            cat.sayHello();

        }
    }
}


