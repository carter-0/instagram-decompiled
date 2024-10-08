package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;

public final class IGJ implements AnonymousClass5RD {
    public final /* synthetic */ float A00;

    public IGJ(float f) {
        this.A00 = f;
    }

    public final /* synthetic */ int CmW(C268014cc r2, List list, int i) {
        return C52407GRi.A00(r2, this, list, i);
    }

    public final /* synthetic */ int CmZ(C268014cc r2, List list, int i) {
        return C52407GRi.A01(r2, this, list, i);
    }

    public final C289145d6 Cnx(C268004cb r13, List list, long j) {
        C267974cY Cnz;
        C267974cY Cnz2;
        float f;
        int i = 0;
        boolean A1U = AnonymousClass7TF.A1U(0, r13, list);
        int A03 = Constraints.A03(j);
        int A01 = Constraints.A01(j);
        long A04 = Constraints.A04(A03, A01, 0, Constraints.A00(j));
        C268074ci r2 = (C268074ci) 00k.A0O(list, 0);
        if (!(r2 == null || (Cnz = r2.Cnz(A04)) == null)) {
            int i2 = Cnz.A01;
            C268074ci r22 = (C268074ci) 00k.A0O(list, 2);
            if (!(r22 == null || (Cnz2 = r22.Cnz(A04)) == null)) {
                int i3 = (A01 - i2) - Cnz2.A01;
                if (i3 < 0) {
                    i3 = 0;
                }
                C268074ci r4 = (C268074ci) 00k.A0O(list, A1U ? 1 : 0);
                if (r4 != null) {
                    boolean z = false;
                    C267974cY A0E = C51976G9y.A0E(r4, i3, A04);
                    if (A0E != null) {
                        int i4 = A0E.A01;
                        if (A01 == 0) {
                            f = 100.0f;
                        } else {
                            f = ((float) i4) / ((float) A01);
                        }
                        if (f < this.A00) {
                            z = true;
                        }
                        AnonymousClass62O A042 = AnonymousClass62Q.A04(Cnz, A0E, Cnz2);
                        Iterator it = A042.iterator();
                        if (it.hasNext()) {
                            Integer valueOf = Integer.valueOf(((C267974cY) it.next()).A00);
                            while (it.hasNext()) {
                                Integer valueOf2 = Integer.valueOf(((C267974cY) it.next()).A00);
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                            if (valueOf != null) {
                                i = valueOf.intValue();
                            }
                        }
                        return C51969G9p.A0a(r13, new C58795Ixg(A042, i, A01, i4, i3, i2, z), A01, i);
                    }
                }
            }
        }
        return new IGU(3);
    }

    public final /* synthetic */ int CoP(C268014cc r2, List list, int i) {
        return C52407GRi.A02(r2, this, list, i);
    }

    public final /* synthetic */ int CoS(C268014cc r2, List list, int i) {
        return C52407GRi.A03(r2, this, list, i);
    }
}
