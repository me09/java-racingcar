package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Winner {
    private static List<String> winner;

    public Winner() {
        winner = new ArrayList<>();
    }

    public void add(String name) {
        winner.add(name);
    }

    public Stream stream() {
        return winner.stream();
    }
}
