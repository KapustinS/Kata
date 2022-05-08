package Test;

public class EnumTest {



    public static void main(String[] args) {

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());

        Season season1 = Season.AUTUMN;
        Animal animal1 = Animal.CAT;
        System.out.println(season1.name());
        System.out.println(animal1.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Animal animal = Animal.CAT;

        System.out.println(animal.toString());

        System.out.println(animal.getTranslation());

        switch (animal){
            case CAT -> {
                System.out.println("It's a cat");
                break;
            }
            case DOG -> {
                System.out.println("It's a dog");
                break;
            }
            case FROG -> {
                System.out.println("It's a frog");
                break;
            }
            default -> System.out.println("Its not a animal");
        }

        Season season = Season.SUMMER;

        System.out.println(season.getClass());

        switch (season){
            case SUMMER -> {
                System.out.println("It's warm outside");
                break;
            }
            case WINTER -> {
                System.out.println("It's cold outside");
                break;
            }
        }

        System.out.println(season.getTemperature());

    }
}
