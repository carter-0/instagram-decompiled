package X;

/* renamed from: X.5Rk  reason: invalid class name and case insensitive filesystem */
public abstract class C285465Rk {
    public static final C285385Rc A00(C285555Rt r13, C285385Rc r14, C285365Ra r15) {
        C285385Rc r5 = r14;
        if (r14.A01 != C285435Rh.A02) {
            return r5;
        }
        C285375Rb r3 = (C285375Rb) r5;
        C285365Ra r4 = r3.A07;
        C285365Ra r9 = r15;
        if (A03(r4, r15)) {
            return r5;
        }
        float[] A05 = A05(A06(r13.A00, r4.A00(), r15.A00()), r3.A0D);
        String str = r3.A02;
        float[] fArr = r3.A0C;
        return new C285375Rb(r3.A05, r3.A03, r3.A06, r9, str, fArr, A05, r3.A01, r3.A00, -1);
    }

    public static final void A02(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final boolean A03(C285365Ra r4, C285365Ra r5) {
        return r4 == r5 || (Math.abs(r4.A00 - r5.A00) < 0.001f && Math.abs(r4.A01 - r5.A01) < 0.001f);
    }

    public static final AnonymousClass5SC A01(C285385Rc r5, C285385Rc r6) {
        if (r5 == r6) {
            return new AnonymousClass5SB(r5);
        }
        long j = r5.A01;
        long j2 = C285435Rh.A02;
        if (j == j2 && r6.A01 == j2) {
            return new C52925Gez((C285375Rb) r5, (C285375Rb) r6);
        }
        return new AnonymousClass5SC(r5, r6);
    }

    public static final float[] A04(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] A05(float[] fArr, float[] fArr2) {
        float f = fArr[3];
        float f2 = fArr2[1];
        float f3 = fArr[6];
        float f4 = fArr2[2];
        float f5 = fArr[1];
        float f6 = fArr2[0];
        float f7 = fArr[4];
        float f8 = fArr[7];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = fArr[0];
        float f12 = fArr2[4];
        float f13 = fArr2[5];
        float f14 = fArr[1];
        float f15 = fArr2[3];
        float f16 = fArr[2];
        float f17 = f11 * fArr2[6];
        float f18 = fArr[3];
        float f19 = fArr2[7];
        float f20 = fArr2[8];
        float f21 = fArr2[6];
        return new float[]{(fArr[0] * fArr2[0]) + (f * f2) + (f3 * f4), (f5 * f6) + (f2 * f7) + (f8 * f4), (fArr[2] * f6) + (fArr2[1] * f9) + (f4 * f10), (fArr2[3] * f11) + (f * f12) + (f3 * f13), (f14 * f15) + (f7 * f12) + (f8 * f13), (f15 * f16) + (f9 * fArr2[4]) + (f13 * f10), f17 + (f18 * f19) + (f3 * f20), (f14 * f21) + (fArr[4] * f19) + (f8 * f20), (f16 * f21) + (fArr[5] * fArr2[7]) + (f10 * f20)};
    }

    public static final float[] A06(float[] fArr, float[] fArr2, float[] fArr3) {
        A02(fArr, fArr2);
        A02(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] A04 = A04(fArr);
        float f = fArr4[0];
        float f2 = fArr4[1];
        float f3 = fArr4[2];
        return A05(A04, new float[]{fArr4[0] * fArr[0], fArr4[1] * fArr[1], fArr4[2] * fArr[2], fArr[3] * f, fArr[4] * f2, fArr[5] * f3, f * fArr[6], f2 * fArr[7], f3 * fArr[8]});
    }
}
