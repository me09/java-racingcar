package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");

        String input;
        input = scanner.nextLine();

        return input;
    }

    public static Integer inputTotalRound() {
        System.out.println("시도할 회수는 몇회인가요?");

        Integer input;
        input = scanner.nextInt();

        return input;
    }
}
