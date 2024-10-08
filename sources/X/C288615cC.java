package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5cC  reason: invalid class name and case insensitive filesystem */
public final class C288615cC extends C267794cD implements C268434dO {
    public float A00;
    public Integer A01;

    public final /* synthetic */ int CmX(C268084cj r2, C268014cc r3, int i) {
        return GR6.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int Cma(C268084cj r2, C268014cc r3, int i) {
        return GR6.A01(r2, r3, this, i);
    }

    public final /* synthetic */ int CoQ(C268084cj r2, C268014cc r3, int i) {
        return GR6.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int CoT(C268084cj r2, C268014cc r3, int i) {
        return GR6.A03(r2, r3, this, i);
    }

    public final C289145d6 Cny(C268074ci r6, C268004cb r7, long j) {
        int A03;
        int A012;
        int A02;
        int A002;
        if (!Constraints.A07(j) || this.A01 == AnonymousClass05K.A00) {
            A03 = Constraints.A03(j);
            A012 = Constraints.A01(j);
        } else {
            int A013 = Constraints.A01(j);
            A03 = C229632nm.A03(Math.round(((float) A013) * this.A00), Constraints.A03(j), A013);
            A012 = A03;
        }
        if (!Constraints.A06(j) || this.A01 == AnonymousClass05K.A01) {
            A02 = Constraints.A02(j);
            A002 = Constraints.A00(j);
        } else {
            int A003 = Constraints.A00(j);
            A02 = C229632nm.A03(Math.round(((float) A003) * this.A00), Constraints.A02(j), A003);
            A002 = A02;
        }
        C267974cY Cnz = r6.Cnz(AnonymousClass5SF.A04(A03, A012, A02, A002));
        int i = Cnz.A01;
        int i2 = Cnz.A00;
        return r7.Cfi(0Yt.A0E(), new AnonymousClass9L6(Cnz, 12), i, i2);
    }
}
