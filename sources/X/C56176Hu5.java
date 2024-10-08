package X;

/* renamed from: X.Hu5  reason: case insensitive filesystem */
public abstract class C56176Hu5 {
    public static final float A00(Integer num, boolean z) {
        int intValue = num.intValue();
        if (z) {
            switch (intValue) {
                case 1:
                    return 0.2f;
                case 2:
                    return 1.0f;
                case 3:
                    return 0.6f;
                default:
                    return 0.1f;
            }
        } else {
            switch (intValue) {
                case 1:
                case 3:
                    return 0.05f;
                case 2:
                    return 0.2f;
                default:
                    return 0.1f;
            }
        }
    }

    public static boolean A01(Integer num) {
        switch (num.intValue()) {
            case 1:
            case 2:
            case 3:
                return false;
            default:
                return true;
        }
    }
}
