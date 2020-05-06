package view;

import domain.Records;
import domain.Winner;

import java.util.StringJoiner;

public class OutputView {
    private static final String COLON = ":";
    private static final String SPACE = " ";
    private static final String NEW_LINE = "\n";

    private static final String FORWARD_SIGN = "-";
    private static final String STRING_JOINER = ", ";
    private static final String RESULT_SENTENCE = "가 최종 우승했습니다.";

    public static void printRecords(Records records) {
        for (int i = 0; i < records.size(); i++) {
            printName(records.getName(i));
            printPosition(records.getPosition(i));
            System.out.println();
        }
        System.out.println(NEW_LINE);
    }

    private static void printName(String name) {
        System.out.printf(name + COLON + SPACE);
    }

    private static void printPosition(Integer position) {
        for (int i = 0; i < position; i++) {
            System.out.printf(FORWARD_SIGN);
        }
    }

    public static void printResult(Winner winner) {
        StringJoiner stringJoiner = new StringJoiner(STRING_JOINER);
        winner.stream().forEach(name -> stringJoiner.add(name.toString()));

        String result = stringJoiner.toString();

        System.out.println(result + RESULT_SENTENCE);
    }
}
