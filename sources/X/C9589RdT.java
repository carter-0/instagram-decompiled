package X;

/* renamed from: X.RdT  reason: case insensitive filesystem */
public abstract class C9589RdT {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ZERO_SIZE";
            case 1:
                return "CACHED";
            case 2:
                return "PARTIALLY_CACHED";
            case 3:
                return "NOT_CACHED";
            default:
                return "UNKNOWN";
        }
    }
}
