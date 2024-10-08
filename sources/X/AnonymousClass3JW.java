package X;

/* renamed from: X.3JW  reason: invalid class name */
public abstract class AnonymousClass3JW {
    public static 2do A00(2do r6, 2do r7, AnonymousClass6B0 r8, float f, float f2) {
        if (r6 == null) {
            if (r8 == null) {
                return null;
            }
        } else if (r8 == null) {
            return r6;
        }
        float[] fArr = r8.A00;
        int length = fArr.length;
        int A02 = AnonymousClass3JX.A02(fArr, f, length);
        if (A02 >= 0) {
            return ((2do[]) r8.A00)[A02];
        }
        int i = -(A02 + 1);
        2do[] r2 = (2do[]) r8.A00;
        if (i == 0) {
            return r2[0];
        }
        if (i == length) {
            return r2[length - 1];
        }
        int i2 = i - 1;
        2do r4 = r2[i2];
        2do r3 = r2[i];
        float A00 = AnonymousClass3JX.A00(r8.A01[i2], fArr[i2], fArr[i], f, f2);
        if (A00 == 0.0f) {
            return r4;
        }
        r4.CNj(A00, r3, r7);
        return r7;
    }
}
