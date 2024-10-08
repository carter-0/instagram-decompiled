package X;

/* renamed from: X.Nxs  reason: case insensitive filesystem */
public abstract class C70138Nxs {
    public static final float A00(Integer num, Integer num2) {
        int intValue;
        if (num == null || num2 == null || (intValue = num2.intValue()) == 0) {
            return 1.0f;
        }
        float intValue2 = ((float) num.intValue()) / ((float) intValue);
        if (intValue2 < 0.75f) {
            return 0.75f;
        }
        if (intValue2 > 1.7777778f) {
            return 1.7777778f;
        }
        return intValue2;
    }
}
