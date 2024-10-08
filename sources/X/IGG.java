package X;

import androidx.compose.ui.unit.Constraints;

public final class IGG implements C268074ci {
    public final C268084cj A00;
    public final Integer A01;
    public final Integer A02;

    public final Object BaX() {
        return this.A00.BaX();
    }

    public final int CmV(int i) {
        return this.A00.CmV(i);
    }

    public final int CmY(int i) {
        return this.A00.CmY(i);
    }

    public final C267974cY Cnz(long j) {
        int CoO;
        C267974cY r2;
        long A002;
        int CoR;
        Integer num = this.A02;
        Integer num2 = AnonymousClass05K.A00;
        int i = 32767;
        Integer num3 = this.A01;
        Integer num4 = AnonymousClass05K.A01;
        if (num == num2) {
            C268084cj r0 = this.A00;
            int A003 = Constraints.A00(j);
            if (num3 == num4) {
                CoR = r0.CmY(A003);
            } else {
                CoR = r0.CoR(A003);
            }
            if (Constraints.A06(j)) {
                i = A003;
            }
            r2 = new C267974cY();
            A002 = C289155d7.A00(CoR, i);
        } else {
            C268084cj r02 = this.A00;
            int A012 = Constraints.A01(j);
            if (num3 == num4) {
                CoO = r02.CmV(A012);
            } else {
                CoO = r02.CoO(A012);
            }
            if (Constraints.A07(j)) {
                i = A012;
            }
            r2 = new C267974cY();
            A002 = C289155d7.A00(i, CoO);
        }
        r2.A0E(A002);
        return r2;
    }

    public final int CoO(int i) {
        return this.A00.CoO(i);
    }

    public final int CoR(int i) {
        return this.A00.CoR(i);
    }

    public IGG(C268084cj r1, Integer num, Integer num2) {
        this.A00 = r1;
        this.A01 = num;
        this.A02 = num2;
    }
}
