package transport;

public enum BusCapacity {
    ESPECIALLY_SMALL(0, 10),
    SMALL(11,25),
    AVERAGE(40,50),
    BIG(60,80),
    EXTRA_LARGE(100,120);
    private Integer lowerLimit;
    private Integer upperLimit;

    BusCapacity(Integer lowerLimit, Integer upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public Integer getLowerLimit() {
        return lowerLimit;
    }

    public Integer getUpperLimit() {
        return upperLimit;
    }

    @Override
    public String toString() {
        return "Вместимость автобуса: от " + lowerLimit + " до " + upperLimit + " мест";
    }
}
