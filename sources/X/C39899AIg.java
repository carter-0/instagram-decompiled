package X;

import android.graphics.Matrix;

/* renamed from: X.AIg  reason: case insensitive filesystem */
public abstract class C39899AIg {
    public static final boolean A04(AnonymousClass831 r4) {
        C376429Hy r0;
        if (r4 == null) {
            return false;
        }
        int size = r4.A01.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass51N r02 = (AnonymousClass51N) r4.A04(i);
            if (r02 != null) {
                r0 = r02.A04();
            } else {
                r0 = null;
            }
            if (A01(r0).A00()) {
                return true;
            }
        }
        return false;
    }

    public static final float A00(float f) {
        float f2 = f % 360.0f;
        if (f2 > 180.0f) {
            f2 -= 360.0f;
        } else if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        float rint = ((float) Math.rint((double) (f2 / 90.0f))) * 90.0f;
        if (rint != -180.0f) {
            return rint;
        }
        return 180.0f;
    }

    public static final C376429Hy A01(C376429Hy r6) {
        if (r6 != null) {
            return new C376429Hy(2, r6.A02, r6.A01, r6.A00, r6.A03);
        }
        return new C376429Hy(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
    }

    public static final C376429Hy A02(C376429Hy r5) {
        return new C376429Hy(3, r5.A03, r5.A00, r5.A01, r5.A02);
    }

    public static final C376429Hy A03(C376429Hy r9, C376429Hy r10) {
        0qQ.A0B(r9, 0);
        float[] fArr = {r9.A00 * 0.5625f, r9.A01};
        Matrix A0U = AnonymousClass7TE.A0U();
        float f = r10.A02 - r9.A02;
        A0U.setRotate(f);
        A0U.mapPoints(fArr);
        float f2 = r10.A03;
        return new C376429Hy(2, f2 * r9.A03, f, r10.A00 + ((fArr[0] / 0.5625f) * f2), r10.A01 + (fArr[1] * f2));
    }
}
