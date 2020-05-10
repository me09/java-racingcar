package domain;

public class Engine {
    private static final int RANDOM_RANGE = 10;
    private static final int CONDITION_FORWARD_OR_NOT = 4;

    public boolean isAbleToMove() {
        int condition = (int)(Math.random() * RANDOM_RANGE);

        return (condition >= CONDITION_FORWARD_OR_NOT);
    }
}
