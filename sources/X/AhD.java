package X;

import com.facebook.common.math.matrix.Matrix4;

public final class AhD implements C41799B1e {
    public final C13815Thi ANG(C367508qr r9, C367508qr r10, AnonymousClass9X8 r11, C282765Eq r12) {
        QM1 qm1 = new QM1();
        Matrix4 matrix4 = new Matrix4();
        ABR.A00(r9, r10, matrix4, r12);
        float f = 1.0f;
        if (r11.A06) {
            f = -1.0f;
        }
        matrix4.A02(f, -1.0f);
        ABR.A01(r9, matrix4, r11);
        C376429Hy r2 = r11.A03;
        boolean z = false;
        float f2 = r2.A01;
        float[] fArr = {r2.A02, r2.A03, r2.A00, f2};
        C10863RzO rzO = qm1.A02;
        if (rzO != null) {
            rzO.A07 = fArr[0];
            rzO.A08 = fArr[1];
            rzO.A01 = fArr[2];
            rzO.A02 = f2;
        }
        float intrinsicWidth = (float) r11.getIntrinsicWidth();
        float intrinsicHeight = (float) r11.getIntrinsicHeight();
        C10863RzO rzO2 = qm1.A02;
        if (rzO2 != null) {
            rzO2.A06 = intrinsicWidth;
            rzO2.A05 = intrinsicHeight;
            rzO2.A03 = intrinsicWidth / 2.0f;
            rzO2.A04 = intrinsicHeight / 2.0f;
        }
        C391099sL r22 = r11.A04;
        boolean A1W = AnonymousClass7TF.A1W(r22, C391099sL.HORIZONTAL);
        if (r22 == C391099sL.VERTICAL) {
            z = true;
        }
        rzO2.getClass();
        rzO2.A0Q = A1W;
        C10863RzO rzO3 = qm1.A02;
        rzO3.getClass();
        rzO3.A0R = z;
        C10863RzO rzO4 = qm1.A02;
        rzO4.getClass();
        rzO4.A0S.A04(matrix4);
        return qm1;
    }
}
