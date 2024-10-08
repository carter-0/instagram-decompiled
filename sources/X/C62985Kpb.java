package X;

/* renamed from: X.Kpb  reason: case insensitive filesystem */
public abstract class C62985Kpb {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNINTIIALIZED";
            case 1:
                return "INITIALIZED";
            case 2:
                return "STARTED";
            default:
                return "STOPPED";
        }
    }
}
