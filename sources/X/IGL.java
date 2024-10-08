package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

public final class IGL implements AnonymousClass5RD {
    public final int A00;
    public final Object A01;

    public IGL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C289145d6 Cnx(C268004cb r19, List list, long j) {
        long j2 = j;
        C268004cb r4 = r19;
        List<C268074ci> list2 = list;
        switch (this.A00) {
            case 0:
                boolean A1U = AnonymousClass7TF.A1U(0, r4, list2);
                int i = 0;
                long A04 = Constraints.A04(0, Constraints.A01(j2), 0, Constraints.A00(j2));
                C267974cY[] r13 = new C267974cY[list2.size()];
                int size = list2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C267974cY Cnz = ((C268074ci) list2.get(i3)).Cnz(A04);
                    r13[i3] = Cnz;
                    i = Math.max(i, Cnz.A01);
                    i2 = Math.max(i2, Cnz.A00);
                }
                I4B i4b = (I4B) this.A01;
                i4b.A04.Epw(new C289005cr(C289155d7.A00(i, i2)));
                int A03 = AnonymousClass5SF.A03(j2, i);
                int A02 = AnonymousClass5SF.A02(j2, i2);
                i4b.A03.Epw(new C289005cr(C289155d7.A00(A03, A02)));
                return C51969G9p.A0a(r4, new J6Y((Object) r13, A03, (Object) i4b, A02, A1U ? 1 : 0), A03, A02);
            case 1:
                AnonymousClass7TG.A1N(r4, list2);
                ArrayList<C267974cY> A0p = AnonymousClass7TF.A0p(list2);
                for (C268074ci Cnz2 : list2) {
                    A0p.add(Cnz2.Cnz(j2));
                }
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
                for (C267974cY r0 : A0p) {
                    AnonymousClass7TF.A1M(A0p2, r0.A00);
                }
                int A0M = AnonymousClass7TE.A0M(00k.A05(A0p2));
                ArrayList A0p3 = AnonymousClass7TF.A0p(A0p);
                for (C267974cY r02 : A0p) {
                    AnonymousClass7TF.A1M(A0p3, r02.A01);
                }
                int A0M2 = AnonymousClass7TE.A0M(00k.A05(A0p3));
                return C51969G9p.A0a(r4, new J6Y(this.A01, A0M2, (Object) A0p, A0M, 2), A0M2, A0M);
            default:
                boolean A1U2 = AnonymousClass7TF.A1U(0, r4, list2);
                C267974cY Cnz3 = ((C268074ci) list2.get(0)).Cnz(Constraints.A04(Constraints.A03(j2), Constraints.A01(j2), 0, Constraints.A00(j2)));
                C267974cY Cnz4 = ((C268074ci) list2.get(A1U2 ? 1 : 0)).Cnz(j2);
                int i4 = Cnz3.A01;
                int i5 = Cnz3.A00;
                C292205iZ r1 = C292185iX.A00;
                0eP A0x = AnonymousClass7TF.A0x(r1, Cnz3.AWx(r1));
                C292205iZ r12 = C292185iX.A01;
                return r4.Cfi(DbY.A0p(r12, Integer.valueOf(Cnz3.AWx(r12)), A0x), new J6W(15, this.A01, Cnz4, Cnz3), i4, i5);
        }
    }

    public final /* synthetic */ int CmW(C268014cc r2, List list, int i) {
        return C52407GRi.A00(r2, this, list, i);
    }

    public final /* synthetic */ int CmZ(C268014cc r2, List list, int i) {
        return C52407GRi.A01(r2, this, list, i);
    }

    public final /* synthetic */ int CoP(C268014cc r2, List list, int i) {
        return C52407GRi.A02(r2, this, list, i);
    }

    public final /* synthetic */ int CoS(C268014cc r2, List list, int i) {
        return C52407GRi.A03(r2, this, list, i);
    }
}
