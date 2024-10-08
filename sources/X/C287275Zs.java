package X;

/* renamed from: X.5Zs  reason: invalid class name and case insensitive filesystem */
public abstract class C287275Zs {
    public static final C287295Zu A00 = new C287305Zv();
    public static final C287295Zu A01 = new C287285Zt();
    public static final C287355a0 A02 = new C287345Zz();
    public static final C287355a0 A03 = new C287385a3();
    public static final C287355a0 A04 = new C287375a2();
    public static final C287355a0 A05 = new C287365a1();
    public static final C287325Zx A06 = new C287335Zy();
    public static final C287325Zx A07 = new C287315Zw();

    public static final C304756Fc A02(C287265Zr r3, float f) {
        return new C304756Fc(new AnonymousClass9LZ(r3, 1), f, true);
    }

    public static final C304756Fc A03(C287245Zp r3, float f) {
        return new C304756Fc(new AnonymousClass9LZ(r3, 2), f, false);
    }

    public static final void A04(int[] iArr, int[] iArr2, int i, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = ((float) (i - i3)) / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < r6) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += (float) i6;
                i2++;
                i5++;
            }
            return;
        }
        for (int i7 = r6 - 1; -1 < i7; i7--) {
            int i8 = iArr[i7];
            iArr2[i7] = Math.round(f);
            f += (float) i8;
        }
    }

    public static final void A05(int[] iArr, int[] iArr2, int i, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int i6 = 0;
            while (i2 < r4) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        for (int i8 = r4 - 1; -1 < i8; i8--) {
            int i9 = iArr[i8];
            iArr2[i8] = i5;
            i5 += i9;
        }
    }

    public static final void A06(int[] iArr, int[] iArr2, int i, boolean z) {
        float f;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        if (r7 == 0) {
            f = 0.0f;
        } else {
            f = ((float) (i - i3)) / ((float) r7);
        }
        float f2 = f / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < r7) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += ((float) i6) + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int i7 = r7 - 1; -1 < i7; i7--) {
            int i8 = iArr[i7];
            iArr2[i7] = Math.round(f2);
            f2 += ((float) i8) + f;
        }
    }

    public static final void A07(int[] iArr, int[] iArr2, int i, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        if (length != 0) {
            int i3 = 0;
            int i4 = 0;
            do {
                i4 += iArr[i3];
                i3++;
            } while (i3 < length);
            float max = ((float) (i - i4)) / ((float) Math.max(length - 1, 1));
            float f = 0.0f;
            if (z) {
                if (length == 1) {
                    f = max;
                }
                for (int i5 = length - 1; -1 < i5; i5--) {
                    int i6 = iArr[i5];
                    iArr2[i5] = Math.round(f);
                    f += ((float) i6) + max;
                }
                return;
            }
            int i7 = 0;
            do {
                int i8 = iArr[i2];
                iArr2[i7] = Math.round(f);
                f += ((float) i8) + max;
                i2++;
                i7++;
            } while (i2 < length);
        }
    }

    public static final void A08(int[] iArr, int[] iArr2, int i, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = ((float) (i - i3)) / ((float) (r7 + 1));
        float f2 = f;
        if (!z) {
            float f3 = f;
            int i5 = 0;
            while (i2 < r7) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f3);
                f3 += ((float) i6) + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int i7 = r7 - 1; -1 < i7; i7--) {
            int i8 = iArr[i7];
            iArr2[i7] = Math.round(f2);
            f2 += ((float) i8) + f;
        }
    }

    public static final C304756Fc A00() {
        return A01(8.0f);
    }

    public static final C304756Fc A01(float f) {
        return new C304756Fc(C304746Fb.A00, f, true);
    }
}
