package X;

/* renamed from: X.3JU  reason: invalid class name */
public abstract class AnonymousClass3JU {
    public static float A00(AnonymousClass6B4 r7, float f, float f2, float f3) {
        if (r7 == null) {
            return f;
        }
        float[] fArr = r7.A00;
        int length = fArr.length;
        int A02 = AnonymousClass3JX.A02(fArr, f2, length);
        if (A02 >= 0) {
            return r7.A00[A02];
        }
        int i = -(A02 + 1);
        if (i == 0) {
            return r7.A00[0];
        }
        float[] fArr2 = r7.A00;
        if (i == length) {
            return fArr2[length - 1];
        }
        int i2 = i - 1;
        float f4 = fArr2[i2];
        return ((fArr2[i] - f4) * AnonymousClass3JX.A00(r7.A01[i2], fArr[i2], fArr[i], f2, f3)) + f4;
    }
}
