package X;

/* renamed from: X.VGm  reason: case insensitive filesystem */
public abstract class C17064VGm {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "declined";
            case 2:
                return "recently_edited";
            case 3:
                return "approved";
            default:
                return "pending";
        }
    }
}
