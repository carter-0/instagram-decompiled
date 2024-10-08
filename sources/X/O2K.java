package X;

public abstract class O2K {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "LOADING";
            case 2:
                return "ERROR";
            case 3:
                return "APPLIED";
            default:
                return "UNSET";
        }
    }
}
