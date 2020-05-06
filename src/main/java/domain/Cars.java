package domain;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Cars {
    private static List<Car> cars;

    public Cars(String carNames) {
        this.cars = new ArrayList<>();
        divideCarNames(carNames);
    }

    public void move() {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).movePosition();
        }
    }

    public void divideCarNames(String carNames) {
        String[] names = carNames.split(",");

        for (int i = 0; i < names.length; i++) {
            createCar(names[i]);
        }
    }

    public void createCar(String carName) {
        Car car = new Car(carName);
        cars.add(car);
    }

    public Stream<Car> stream() {
        return cars.stream();
    }
}
