package X;

import androidx.compose.ui.unit.Constraints;

public abstract class GR3 extends C267794cD implements C268434dO {
    public final C289145d6 Cny(C268074ci r6, C268004cb r7, long j) {
        int CmY;
        long A01;
        boolean z;
        int CmV;
        boolean z2 = this instanceof C52891GeR;
        if (z2) {
            Integer num = ((C52891GeR) this).A00;
            Integer num2 = AnonymousClass05K.A00;
            int A012 = Constraints.A01(j);
            if (num == num2) {
                CmV = r6.CoO(A012);
            } else {
                CmV = r6.CmV(A012);
            }
            if (CmV < 0) {
                CmV = 0;
            }
            A01 = C288985co.A00(CmV);
        } else {
            Integer num3 = ((C52892GeS) this).A00;
            Integer num4 = AnonymousClass05K.A00;
            int A00 = Constraints.A00(j);
            if (num3 == num4) {
                CmY = r6.CoR(A00);
            } else {
                CmY = r6.CmY(A00);
            }
            if (CmY < 0) {
                CmY = 0;
            }
            A01 = C288985co.A01(CmY);
        }
        if (z2) {
            z = ((C52891GeR) this).A01;
        } else {
            z = ((C52892GeS) this).A01;
        }
        if (z) {
            A01 = AnonymousClass5SF.A08(j, A01);
        }
        C267974cY Cnz = r6.Cnz(A01);
        int i = Cnz.A01;
        int i2 = Cnz.A00;
        return r7.Cfi(0Yt.A0E(), new J6G(Cnz, 32), i, i2);
    }

    public final int CmX(C268084cj r3, C268014cc r4, int i) {
        if (!(this instanceof C52891GeR) || ((C52891GeR) this).A00 != AnonymousClass05K.A00) {
            return r3.CmV(i);
        }
        return r3.CoO(i);
    }

    public final int Cma(C268084cj r3, C268014cc r4, int i) {
        if (!(this instanceof C52892GeS) || ((C52892GeS) this).A00 != AnonymousClass05K.A00) {
            return r3.CmY(i);
        }
        return r3.CoR(i);
    }

    public final int CoQ(C268084cj r3, C268014cc r4, int i) {
        if (!(this instanceof C52891GeR) || ((C52891GeR) this).A00 == AnonymousClass05K.A00) {
            return r3.CoO(i);
        }
        return r3.CmV(i);
    }

    public final int CoT(C268084cj r3, C268014cc r4, int i) {
        if (!(this instanceof C52892GeS) || ((C52892GeS) this).A00 == AnonymousClass05K.A00) {
            return r3.CoR(i);
        }
        return r3.CmY(i);
    }
}
