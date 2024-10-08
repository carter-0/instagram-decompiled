package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5cE  reason: invalid class name and case insensitive filesystem */
public final class C288635cE extends C267794cD implements C268434dO {
    public Integer A00;
    public 0sL A01;

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

    public final C289145d6 Cny(C268074ci r7, C268004cb r8, long j) {
        int A03;
        Integer num = this.A00;
        int i = 0;
        if (num != AnonymousClass05K.A00) {
            A03 = 0;
        } else {
            A03 = Constraints.A03(j);
        }
        if (num == AnonymousClass05K.A01) {
            i = Constraints.A02(j);
        }
        int A012 = Constraints.A01(j);
        int A002 = Constraints.A00(j);
        C267974cY Cnz = r7.Cnz(AnonymousClass5SF.A04(A03, A012, i, A002));
        int A032 = C229632nm.A03(Cnz.A01, Constraints.A03(j), A012);
        int A033 = C229632nm.A03(Cnz.A00, Constraints.A02(j), A002);
        return r8.Cfi(0Yt.A0E(), new AnonymousClass9MN(A032, A033, 1, this, Cnz, r8), A032, A033);
    }
}
