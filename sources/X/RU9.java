package X;

public abstract class RU9 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "BWI_AD";
            case 2:
                return "CACHE";
            default:
                return "NETWORK";
        }
    }
}
