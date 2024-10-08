package X;

public abstract class Ky7 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SUCCESS";
            case 2:
                return "ATTENTION";
            case 3:
                return "CRITICAL";
            case 4:
                return "NEUTRAL";
            default:
                return "INFO";
        }
    }
}
