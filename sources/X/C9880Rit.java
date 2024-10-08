package X;

/* renamed from: X.Rit  reason: case insensitive filesystem */
public abstract class C9880Rit {
    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "DROP_OLDEST";
            case 2:
                return "DROP_LATEST";
            default:
                return "SUSPEND";
        }
    }
}
