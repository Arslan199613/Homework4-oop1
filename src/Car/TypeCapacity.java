package Car;

public enum TypeCapacity {

    ESPECIALLY_SMALL(0,10),
    SMALL(0,25),
    AVERAGE(40,50),
    LARGE(60,80),
    ESPECIALLY_LARGE(100,120);

    private final int from;
    private final int to;

    TypeCapacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
