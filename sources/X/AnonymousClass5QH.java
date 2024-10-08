package X;

/* renamed from: X.5QH  reason: invalid class name */
public final class AnonymousClass5QH {
    public static final AnonymousClass5QH A00 = new Object();
    public static final float[] A01 = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static final Object[] A02;
    public static volatile 01s A03 = new 01s(10);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.5QH] */
    static {
        Object[] objArr = new Object[0];
        A02 = objArr;
        synchronized (objArr) {
            int i = (int) (1.15f * 100.0f);
            A03.A07(i, new AnonymousClass5QI(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            int i2 = (int) (1.3f * 100.0f);
            A03.A07(i2, new AnonymousClass5QI(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            int i3 = (int) (1.5f * 100.0f);
            A03.A07(i3, new AnonymousClass5QI(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            int i4 = (int) (1.8f * 100.0f);
            A03.A07(i4, new AnonymousClass5QI(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            int i5 = (int) (2.0f * 100.0f);
            A03.A07(i5, new AnonymousClass5QI(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((((float) A03.A01(0)) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public final AnonymousClass5QJ A00(float f) {
        float A012;
        AnonymousClass5QJ r0;
        float f2;
        AnonymousClass5QI r3;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        AnonymousClass5QJ r32 = (AnonymousClass5QJ) AnonymousClass01t.A00(A03, i);
        if (r32 != null) {
            return r32;
        }
        01s r2 = A03;
        if (r2.A01) {
            AnonymousClass01t.A01(r2);
        }
        int A002 = 01u.A00(r2.A02, r2.A00, i);
        if (A002 >= 0) {
            return (AnonymousClass5QJ) A03.A04(A002);
        }
        int i2 = (-(A002 + 1)) - 1;
        int i3 = i2 + 1;
        if (i3 >= A03.A00()) {
            r3 = new AnonymousClass5QI(new float[]{1.0f}, new float[]{f});
        } else {
            if (i2 < 0) {
                float[] fArr = A01;
                r0 = new AnonymousClass5QI(fArr, fArr);
                A012 = 1.0f;
            } else {
                A012 = ((float) A03.A01(i2)) / 100.0f;
                r0 = (AnonymousClass5QJ) A03.A04(i2);
            }
            float A013 = ((float) A03.A01(i3)) / 100.0f;
            if (A012 == A013) {
                f2 = 0.0f;
            } else {
                f2 = (f - A012) / (A013 - A012);
            }
            float max = 0.0f + ((1.0f - 0.0f) * Math.max(0.0f, Math.min(1.0f, f2)));
            AnonymousClass5QJ r8 = (AnonymousClass5QJ) A03.A04(i3);
            float[] fArr2 = A01;
            float[] fArr3 = new float[9];
            int i4 = 0;
            do {
                float f3 = fArr2[i4];
                float AK0 = r0.AK0(f3);
                fArr3[i4] = AK0 + ((r8.AK0(f3) - AK0) * max);
                i4++;
            } while (i4 < 9);
            r3 = new AnonymousClass5QI(fArr2, fArr3);
        }
        synchronized (A02) {
            01s A032 = A03.A03();
            A032.A07(i, r3);
            A03 = A032;
        }
        return r3;
    }
}
