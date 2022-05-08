package Test;

public enum Season {
    WINTER(-30), SPRING(20), SUMMER(35), AUTUMN(18);

    private int temperature;

    Season(int temperature){
        this.temperature=temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}
