package X;

/* renamed from: X.Rdu  reason: case insensitive filesystem */
public abstract class C9616Rdu {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MED";
            case 2:
                return "LOW";
            case 3:
                return "VERY_LOW";
            default:
                return "HIGH";
        }
    }
}
