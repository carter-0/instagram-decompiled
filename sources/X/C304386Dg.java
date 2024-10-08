package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6Dg  reason: invalid class name and case insensitive filesystem */
public final class C304386Dg extends C267794cD implements C268434dO {
    public float A00;
    public float A01;

    public final C289145d6 Cny(C268074ci r6, C268004cb r7, long j) {
        int A03;
        int A02;
        float f = this.A01;
        if (C289095d0.A01(f, Float.NaN) || Constraints.A03(j) != 0) {
            A03 = Constraints.A03(j);
        } else {
            A03 = r7.EJS(f);
            int A012 = Constraints.A01(j);
            if (A03 > A012) {
                A03 = A012;
            }
            if (A03 < 0) {
                A03 = 0;
            }
        }
        int A013 = Constraints.A01(j);
        float f2 = this.A00;
        if (C289095d0.A01(f2, Float.NaN) || Constraints.A02(j) != 0) {
            A02 = Constraints.A02(j);
        } else {
            A02 = r7.EJS(f2);
            int A002 = Constraints.A00(j);
            if (A02 > A002) {
                A02 = A002;
            }
            if (A02 < 0) {
                A02 = 0;
            }
        }
        C267974cY Cnz = r6.Cnz(AnonymousClass5SF.A04(A03, A013, A02, Constraints.A00(j)));
        int i = Cnz.A01;
        int i2 = Cnz.A00;
        return r7.Cfi(0Yt.A0E(), new AnonymousClass9L6(Cnz, 15), i, i2);
    }

    public final int CmX(C268084cj r4, C268014cc r5, int i) {
        int i2;
        int CmV = r4.CmV(i);
        float f = this.A00;
        if (!C289095d0.A01(f, Float.NaN)) {
            i2 = r5.EJS(f);
        } else {
            i2 = 0;
        }
        if (CmV < i2) {
            return i2;
        }
        return CmV;
    }

    public final int Cma(C268084cj r4, C268014cc r5, int i) {
        int i2;
        int CmY = r4.CmY(i);
        float f = this.A01;
        if (!C289095d0.A01(f, Float.NaN)) {
            i2 = r5.EJS(f);
        } else {
            i2 = 0;
        }
        if (CmY < i2) {
            return i2;
        }
        return CmY;
    }

    public final int CoQ(C268084cj r4, C268014cc r5, int i) {
        int i2;
        int CoO = r4.CoO(i);
        float f = this.A00;
        if (!C289095d0.A01(f, Float.NaN)) {
            i2 = r5.EJS(f);
        } else {
            i2 = 0;
        }
        if (CoO < i2) {
            return i2;
        }
        return CoO;
    }

    public final int CoT(C268084cj r4, C268014cc r5, int i) {
        int i2;
        int CoR = r4.CoR(i);
        float f = this.A01;
        if (!C289095d0.A01(f, Float.NaN)) {
            i2 = r5.EJS(f);
        } else {
            i2 = 0;
        }
        if (CoR < i2) {
            return i2;
        }
        return CoR;
    }
}
