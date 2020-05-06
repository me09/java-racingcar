package domain;

import view.InputView;
import view.OutputView;

public class RacingCarGame {
    private static Cars cars;
    private static Referee referee;

    public RacingCarGame() {
        cars = new Cars(InputView.inputCarsName());
        referee = new Referee();
    }

    public void run() {
        Integer totalRound = InputView.inputTotalRound();

        System.out.println("\n실행 결과");

        while (--totalRound >= 0) {
            cars.move();
            OutputView.printRecords(referee.refreshRecord(cars));
        }

        OutputView.printResult(referee.getWinner(cars));
    }
}
