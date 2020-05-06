package domain;

public class Referee {
    private static final Integer INITIAL_POSITION = 0;

    private static Integer maxDistance = INITIAL_POSITION;

    private static Winner winner = new Winner();

    public Records refreshRecord(Cars cars) {
        Records records = new Records();
        cars.stream().forEach(car -> records.add(car.getName(), car.getPosition()));

        refreshMaxDistance(records);

        return records;
    }

    private void refreshMaxDistance(Records records) {
        for (int i = 0; i < records.size(); i++) {
            if (records.getPosition(i) > maxDistance) {
                maxDistance = records.getPosition(i);
            }
        }
    }

    public Winner getWinner(Cars cars) {
        cars.stream().filter(car -> car.getPosition() == maxDistance)
                     .forEach(car -> winner.add(car.getName()));

        return winner;
    }
}
