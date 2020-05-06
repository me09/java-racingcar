package domain;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private static List<Record> records;

    public Records() {
        records = new ArrayList<>();
    }

    public void add(String name, Integer position) {
        Record record = new Record(name, position);
        this.records.add(record);
    }

    public Integer size() {
        return records.size();
    }

    public String getName(int index) {
        return records.get(index).getName();
    }

    public Integer getPosition(int index) {
        return records.get(index).getPosition();
    }
}
