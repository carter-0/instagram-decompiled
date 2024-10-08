package X;

/* renamed from: X.5St  reason: invalid class name and case insensitive filesystem */
public abstract class C285805St {
    public static 0sP A00 = C286195Uh.A00;

    public static final void A01(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float A002 = A00(fArr4, fArr3, 0, 0);
        float A003 = A00(fArr4, fArr3, 0, 1);
        float A004 = A00(fArr4, fArr3, 0, 2);
        float A005 = A00(fArr4, fArr3, 0, 3);
        float A006 = A00(fArr4, fArr3, 1, 0);
        float A007 = A00(fArr4, fArr3, 1, 1);
        float A008 = A00(fArr4, fArr3, 1, 2);
        float A009 = A00(fArr4, fArr3, 1, 3);
        float A0010 = A00(fArr4, fArr3, 2, 0);
        float A0011 = A00(fArr4, fArr3, 2, 1);
        float A0012 = A00(fArr4, fArr3, 2, 2);
        float A0013 = A00(fArr4, fArr3, 2, 3);
        float A0014 = A00(fArr4, fArr3, 3, 0);
        float A0015 = A00(fArr4, fArr3, 3, 1);
        float A0016 = A00(fArr4, fArr3, 3, 2);
        float A0017 = A00(fArr4, fArr3, 3, 3);
        fArr3[0] = A002;
        fArr3[1] = A003;
        fArr3[2] = A004;
        fArr3[3] = A005;
        fArr3[4] = A006;
        fArr3[5] = A007;
        fArr3[6] = A008;
        fArr3[7] = A009;
        fArr3[8] = A0010;
        fArr3[9] = A0011;
        fArr3[10] = A0012;
        fArr3[11] = A0013;
        fArr3[12] = A0014;
        fArr3[13] = A0015;
        fArr3[14] = A0016;
        fArr3[15] = A0017;
    }

    public static final float A00(float[] fArr, float[] fArr2, int i, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[i2 + 4]) + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }
}
