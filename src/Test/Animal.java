package Test;

public enum Animal {
    DOG("собака"), CAT("Кошка"), FROG("Лягушка");

    private String translation;

    Animal(String translation) {
        this.translation = translation;

    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод: " + translation;
    }
}
