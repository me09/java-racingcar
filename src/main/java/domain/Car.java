package domain;

public class Car {
    private static final int RANDOM_RANGE = 10;
    private static final int CONDITION_FORWARD_OR_NOT = 4;
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void movePosition() {
        int condition = (int)(Math.random() * RANDOM_RANGE);

        if (condition >= CONDITION_FORWARD_OR_NOT) {
            this.position += 1;
        }
    }

    public int getPosition() {
        return this.position;
    }
}