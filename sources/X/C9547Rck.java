package X;

/* renamed from: X.Rck  reason: case insensitive filesystem */
public abstract class C9547Rck {
    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "END";
            case 2:
                return "MOVE";
            case 3:
                return "CANCEL";
            default:
                return "START";
        }
    }
}
