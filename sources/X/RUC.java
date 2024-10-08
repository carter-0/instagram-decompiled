package X;

public abstract class RUC {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "BWP_AD";
            case 2:
                return "CACHE";
            default:
                return "NETWORK";
        }
    }
}
