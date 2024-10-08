package X;

public abstract class HYP {
    public static final int A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return 4;
        }
        if (intValue == 1) {
            return 5;
        }
        if (intValue == 2) {
            return 1;
        }
        if (intValue == 3) {
            return 2;
        }
        if (intValue == 4) {
            return 3;
        }
        throw AnonymousClass7TE.A1K();
    }
}
