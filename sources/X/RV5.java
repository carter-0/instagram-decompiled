package X;

public abstract class RV5 {
    public static boolean A00(float f, float f2) {
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(f2);
        if (!isNaN) {
            if (isNaN2 || AnonymousClass7TE.A00(f2, f) >= 1.0E-5f) {
                return false;
            }
            return true;
        } else if (isNaN2) {
            return true;
        } else {
            return false;
        }
    }
}
