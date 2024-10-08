package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.83z  reason: invalid class name and case insensitive filesystem */
public final class C3502683z implements C3502583y {
    public final 1US A00;
    public final List A01 = new ArrayList();
    public final 0lg A02;
    public volatile PyB A03;

    public C3502683z(0lg r2, 1US r3) {
        0qQ.A0B(r2, 2);
        this.A00 = r3;
        this.A02 = r2;
    }

    public final synchronized void CgN(AnonymousClass83x r4) {
        this.A01.add(r4);
        if (this.A03 == null) {
            PyC pyC = new PyC(this.A00);
            pyC.A03 = AnonymousClass05K.A01;
            pyC.A02 = new AnonymousClass841(this);
            PyB pyB = new PyB(pyC);
            this.A03 = pyB;
            1RH.A00().A03(this.A02, pyB);
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.84T] */
    public final AnonymousClass84T ASc() {
        1RH A002 = 1RH.A00();
        1US r2 = this.A00;
        if (A002.A05(r2)) {
            PyC pyC = new PyC(r2);
            pyC.A03 = AnonymousClass05K.A01;
            PyB pyB = new PyB(pyC);
            1RH A003 = 1RH.A00();
            0lg r1 = this.A02;
            A003.A03(r1, pyB);
            1RH.A00().A04(r1, pyB);
            return new Object();
        }
        throw new RuntimeException(002.A0R("Library loading failed for: ", r2.A00));
    }
}
