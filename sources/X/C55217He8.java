package X;

/* renamed from: X.He8  reason: case insensitive filesystem */
public abstract class C55217He8 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "X_SMALL";
            case 2:
                return "SMALL";
            case 3:
                return "MEDIUM";
            case 4:
                return "LARGE";
            case 5:
                return "X_LARGE";
            case 6:
                return "XX_LARGE";
            default:
                return "XX_SMALL";
        }
    }
}
