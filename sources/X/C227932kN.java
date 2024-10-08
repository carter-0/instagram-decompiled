package X;

/* renamed from: X.2kN  reason: invalid class name and case insensitive filesystem */
public abstract class C227932kN {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ON_CREATE";
            case 1:
                return "ON_CREATE_VIEW";
            case 2:
                return "ON_VIEW_CREATED";
            case 3:
                return "ON_START";
            default:
                return "ON_RESUME";
        }
    }
}
