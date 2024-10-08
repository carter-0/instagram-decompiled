package X;

/* renamed from: X.He1  reason: case insensitive filesystem */
public abstract class C55211He1 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "EXIT_VISIBILITY";
            case 2:
                return "ENTER_COVERAGE";
            case 3:
                return "EXIT_COVERAGE";
            case 4:
                return "UPDATE_VISIBILITY";
            case 5:
                return "UPDATE_COVERAGE";
            default:
                return "ENTER_VISIBILITY";
        }
    }
}
