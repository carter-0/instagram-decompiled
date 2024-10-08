package X;

/* renamed from: X.HeQ  reason: case insensitive filesystem */
public abstract class C55235HeQ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "Visible";
            case 1:
                return "FocusedAndFilled";
            case 2:
                return "FocusedOrFilled";
            default:
                return "Filled";
        }
    }
}
