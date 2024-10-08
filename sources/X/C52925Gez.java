package X;

import java.util.Arrays;

/* renamed from: X.Gez  reason: case insensitive filesystem */
public final class C52925Gez extends AnonymousClass5SC {
    public final C285375Rb A00;
    public final C285375Rb A01;
    public final float[] A02;

    public C52925Gez(C285375Rb r10, C285375Rb r11) {
        super(r10, r11, r10, r11);
        float[] A05;
        this.A01 = r10;
        this.A00 = r11;
        C285365Ra r1 = r10.A07;
        C285365Ra r8 = r11.A07;
        if (C285465Rk.A03(r1, r8)) {
            A05 = C285465Rk.A05(r11.A0B, r10.A0D);
        } else {
            float[] fArr = r10.A0D;
            float[] fArr2 = r11.A0B;
            float[] A002 = r1.A00();
            float[] A003 = r8.A00();
            C285365Ra r5 = AnonymousClass5RZ.A01;
            if (!C285465Rk.A03(r1, r5)) {
                float[] fArr3 = C285555Rt.A01.A00;
                float[] copyOf = Arrays.copyOf(AnonymousClass5RZ.A04, 3);
                0qQ.A07(copyOf);
                fArr = C285465Rk.A05(C285465Rk.A06(fArr3, A002, copyOf), fArr);
            }
            if (!C285465Rk.A03(r8, r5)) {
                float[] fArr4 = C285555Rt.A01.A00;
                float[] copyOf2 = Arrays.copyOf(AnonymousClass5RZ.A04, 3);
                0qQ.A07(copyOf2);
                fArr2 = C285465Rk.A04(C285465Rk.A05(C285465Rk.A06(fArr4, A003, copyOf2), r11.A0D));
            }
            A05 = C285465Rk.A05(fArr2, fArr);
        }
        this.A02 = A05;
    }

    public final long A00(long j) {
        float A03 = AnonymousClass5RW.A03(j);
        float A022 = AnonymousClass5RW.A02(j);
        float A012 = AnonymousClass5RW.A01(j);
        float A002 = AnonymousClass5RW.A00(j);
        C285405Re r2 = this.A01.A02;
        float CNq = (float) r2.CNq((double) A03);
        float CNq2 = (float) r2.CNq((double) A022);
        float CNq3 = (float) r2.CNq((double) A012);
        float[] fArr = this.A02;
        float f = (fArr[0] * CNq) + (fArr[3] * CNq2) + (fArr[6] * CNq3);
        float f2 = (fArr[1] * CNq) + (fArr[4] * CNq2) + (fArr[7] * CNq3);
        float f3 = (fArr[2] * CNq) + (fArr[5] * CNq2) + (fArr[8] * CNq3);
        C285375Rb r5 = this.A00;
        C285405Re r22 = r5.A04;
        return C285595Rx.A02(r5, (float) r22.CNq((double) f), (float) r22.CNq((double) f2), (float) r22.CNq((double) f3), A002);
    }
}
