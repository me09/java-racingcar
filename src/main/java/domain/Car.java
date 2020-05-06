package domain;

public class Car {
    private final String name;
    private int position = 0;

    private static Engine engine = new Engine();

    public Car(String name) {
        this.name = name;
    }

    public void movePosition() {
        if (engine.isAbleToMove()) {
            this.position += 1;
        }
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }
}