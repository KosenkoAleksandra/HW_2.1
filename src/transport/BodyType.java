package transport;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String bodyTypeInRussian;


    BodyType(String bodyTypeInRussian) {
        this.bodyTypeInRussian = bodyTypeInRussian;
    }

    public String getBodyTypeInRussian() {
        return bodyTypeInRussian;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyTypeInRussian;
    }
}
