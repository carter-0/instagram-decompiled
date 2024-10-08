package X;

/* renamed from: X.Kxy  reason: case insensitive filesystem */
public abstract class C63494Kxy {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NOT_INITIALIZED";
            case 1:
                return "DEFAULT";
            case 2:
                return "HIDDEN";
            case 3:
                return "BUY_ANOTHER";
            case 4:
                return "VERIFICATION_FAILED";
            default:
                return "IN_PROGRESS";
        }
    }
}
