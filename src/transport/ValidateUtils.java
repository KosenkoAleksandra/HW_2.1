package transport;

public class ValidateUtils {
    public static String validateString(String value, String defaultValue){
        return (value == null || value.isBlank() || value.isEmpty()) ? defaultValue : value;
    }
    public static String validateCarParameters(String value){
        return validateString(value, "default");
    }
    public static double validateEngineVolume(double value){
        return value <= 0 ? 1.5 : value;
    }


}
