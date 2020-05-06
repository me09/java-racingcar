package domain;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Cars {
    private static final Integer MAX_NAME_LENGTH = 5;
    private static final String MAX_NAME_LENGTH_ERROR = "이름은 5자 이하만 가능합니다.";

    private static List<Car> cars;

    public Cars(String carNames) {
        this.cars = new ArrayList<>();
        splitCarNames(carNames);
    }

    private void splitCarNames(String carNames) {
        String[] names = carNames.split(",");

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException(MAX_NAME_LENGTH_ERROR);
            }
            createCar(names[i]);
        }
    }

    private void createCar(String carName) {
        Car car = new Car(carName);
        cars.add(car);
    }

    public void move() {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).movePosition();
        }
    }

    public Stream<Car> stream() {
        return cars.stream();
    }
}
