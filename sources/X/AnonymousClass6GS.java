package X;

/* renamed from: X.6GS  reason: invalid class name */
public abstract class AnonymousClass6GS {
    public static final long A00 = AnonymousClass6GR.A00(0.0f, 0.0f);

    public static String A01(long j) {
        StringBuilder sb;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float A002 = A00(j);
        boolean z = false;
        if (intBitsToFloat == A002) {
            z = true;
        }
        if (z) {
            sb.append("CornerRadius.circular(");
        } else {
            sb = new StringBuilder();
            sb.append("CornerRadius.elliptical(");
            sb.append(C392309ub.A00(intBitsToFloat));
            sb.append(", ");
            intBitsToFloat = A002;
        }
        sb.append(C392309ub.A00(intBitsToFloat));
        sb.append(')');
        return sb.toString();
    }

    public static final float A00(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
