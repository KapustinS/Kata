package Java1;

public class Task3_3_12 {

    public static class Human {

        byte age;
        String name;
        String secondName;
        String favoriteSport;

        public Human() {
        }

        public Human(byte age, String name, String secondName) {

            this(age, name, secondName, null);
        }

        public Human(byte age, String name, String secondName, String favoriteSport) {

            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
        }


    }

    public static void main(String[] args) {

        Human human1 = new Human();
        Human human2 = new Human((byte) 2, "Ivan", "Pomidorov", "Tennis");
        Human human3 = new Human((byte) 3, "Petr", "Ivanov");
    }
}
