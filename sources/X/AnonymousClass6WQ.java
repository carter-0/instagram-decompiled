package X;

/* renamed from: X.6WQ  reason: invalid class name */
public abstract class AnonymousClass6WQ {
    public static void A00(2dt r7, float[] fArr, float f, float f2, int i) {
        int i2;
        byte[] bArr = r7.A02;
        int length = bArr.length;
        int min = Math.min(i, length - 1);
        if (min < 0 || min >= length) {
            i2 = -1;
        } else {
            i2 = 0;
            for (int i3 = 0; i3 < min; i3++) {
                byte b = bArr[i3];
                if (b == 0 || b == 1) {
                    i2 += 2;
                } else if (b == 2) {
                    i2 += 4;
                } else if (b == 3) {
                    i2 += 6;
                }
            }
        }
        float[] fArr2 = r7.A03;
        fArr[0] = fArr2[i2] * f;
        fArr[1] = fArr2[i2 + 1] * f2;
    }
}
