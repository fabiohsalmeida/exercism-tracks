public class Lasagna {
    private final int MINUTES_IN_OVEN = 40;
    private final int PREPARATION_MINUTES_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return MINUTES_IN_OVEN - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers*PREPARATION_MINUTES_PER_LAYER;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }
}
