package X;

/* renamed from: X.KpI  reason: case insensitive filesystem */
public abstract class C62966KpI {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_INPUT";
            case 2:
                return "MISSING_ASSET";
            case 3:
                return "NETWORK_ERROR";
            default:
                return "UNKNOWN";
        }
    }
}
