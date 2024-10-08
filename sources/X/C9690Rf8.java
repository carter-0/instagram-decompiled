package X;

/* renamed from: X.Rf8  reason: case insensitive filesystem */
public abstract class C9690Rf8 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "TRANSIENT_ERROR";
            case 2:
                return "FATAL_ERROR";
            case 3:
                return "INVALID_PAYLOAD";
            default:
                return "OK";
        }
    }
}
