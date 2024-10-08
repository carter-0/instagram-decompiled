package X;

import java.util.Arrays;

/* renamed from: X.5S4  reason: invalid class name */
public final class AnonymousClass5S4 {
    public final float[] A00;

    public static final void A02(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = 0.0f;
                if (i == i2) {
                    f = 1.0f;
                }
                fArr[(i2 * 4) + i] = f;
                i2++;
            } while (i2 < 4);
        }
    }

    public static final void A04(float[] fArr, float f, float f2) {
        float f3 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * 0.0f) + fArr[12];
        float f4 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * 0.0f) + fArr[13];
        float f5 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * 0.0f) + fArr[14];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * 0.0f) + fArr[15];
    }

    public static final void A05(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float A002 = C289455dc.A00(fArr3, fArr4, 0, 0);
        float A003 = C289455dc.A00(fArr3, fArr4, 0, 1);
        float A004 = C289455dc.A00(fArr3, fArr4, 0, 2);
        float A005 = C289455dc.A00(fArr3, fArr4, 0, 3);
        float A006 = C289455dc.A00(fArr3, fArr4, 1, 0);
        float A007 = C289455dc.A00(fArr3, fArr4, 1, 1);
        float A008 = C289455dc.A00(fArr3, fArr4, 1, 2);
        float A009 = C289455dc.A00(fArr3, fArr4, 1, 3);
        float A0010 = C289455dc.A00(fArr3, fArr4, 2, 0);
        float A0011 = C289455dc.A00(fArr3, fArr4, 2, 1);
        float A0012 = C289455dc.A00(fArr3, fArr4, 2, 2);
        float A0013 = C289455dc.A00(fArr3, fArr4, 2, 3);
        float A0014 = C289455dc.A00(fArr3, fArr4, 3, 0);
        float A0015 = C289455dc.A00(fArr3, fArr4, 3, 1);
        float A0016 = C289455dc.A00(fArr3, fArr4, 3, 2);
        float A0017 = C289455dc.A00(fArr3, fArr4, 3, 3);
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

    public static final void A01(C289445db r14, float[] fArr) {
        float f = r14.A01;
        float f2 = r14.A03;
        long A002 = A00(fArr, C289325dP.A00(f, f2));
        float f3 = r14.A00;
        long A003 = A00(fArr, C289325dP.A00(f, f3));
        float f4 = r14.A02;
        long A004 = A00(fArr, C289325dP.A00(f4, f2));
        long A005 = A00(fArr, C289325dP.A00(f4, f3));
        float min = Math.min(C289295dM.A01(A002), C289295dM.A01(A003));
        float A01 = C289295dM.A01(A004);
        float A012 = C289295dM.A01(A005);
        r14.A01 = Math.min(min, Math.min(A01, A012));
        float A02 = C289295dM.A02(A002);
        float A022 = C289295dM.A02(A003);
        r14.A03 = Math.min(Math.min(A02, A022), Math.min(C289295dM.A02(A004), C289295dM.A02(A005)));
        r14.A02 = Math.max(Math.max(C289295dM.A01(A002), C289295dM.A01(A003)), Math.max(C289295dM.A01(A004), A012));
        r14.A00 = Math.max(Math.max(A02, A022), Math.max(C289295dM.A02(A004), C289295dM.A02(A005)));
    }

    public static final void A03(float[] fArr, float f, float f2) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static /* synthetic */ float[] A06() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public final boolean equals(Object obj) {
        float[] fArr = this.A00;
        if (!(obj instanceof AnonymousClass5S4) || !0qQ.A0K(fArr, ((AnonymousClass5S4) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        float[] fArr = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |");
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return 0rw.A0t(sb.toString());
    }

    public /* synthetic */ AnonymousClass5S4(float[] fArr) {
        this.A00 = fArr;
    }

    public static final long A00(float[] fArr, long j) {
        float A01 = C289295dM.A01(j);
        float A02 = C289295dM.A02(j);
        float f = 1.0f / (((fArr[3] * A01) + (fArr[7] * A02)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return C289325dP.A00(((fArr[0] * A01) + (fArr[4] * A02) + fArr[12]) * f, f * ((fArr[1] * A01) + (fArr[5] * A02) + fArr[13]));
    }
}
