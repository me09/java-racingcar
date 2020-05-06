package domain;

public class Record {
    private String name;
    private Integer position;

    public Record(String name, Integer position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
