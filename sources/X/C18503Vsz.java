package X;

/* renamed from: X.Vsz  reason: case insensitive filesystem */
public final class C18503Vsz {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = 0;
    public long A06 = Long.MIN_VALUE;
    public long A07 = -1;

    public static float A00(C18503Vsz vsz, long j) {
        long j2 = vsz.A06;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = vsz.A07;
        if (j3 < 0 || j < j3) {
            float f = ((float) (j - j2)) / ((float) vsz.A04);
            int i = WC4.A0G;
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
            return f * 0.5f;
        }
        float f2 = vsz.A00;
        float f3 = 1.0f - f2;
        float f4 = ((float) (j - j3)) / ((float) vsz.A02);
        int i2 = WC4.A0G;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        return f3 + (f2 * f4);
    }
}
