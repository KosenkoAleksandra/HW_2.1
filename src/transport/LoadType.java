package transport;

public enum LoadType {
    N1(0.0f, 3.5f),
    N2(3.6f, 12f),
    N3(12.1f, 500f);
    private float lowerLoadLimit;
    private float upperLoadLimit;

    LoadType(float lowerLoadLimit, float upperLoadLimit) {
        this.lowerLoadLimit = lowerLoadLimit;
        this.upperLoadLimit = upperLoadLimit;
    }

    public float getLowerLoadLimit() {
        return lowerLoadLimit;
    }

    public float getUpperLoadLimit() {
        return upperLoadLimit;
    }

    @Override
    public String toString() {
        return "Грузоподъемность: " + " от " + lowerLoadLimit + " тонн до " + upperLoadLimit + " тонн";
    }
}
