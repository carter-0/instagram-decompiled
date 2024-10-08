package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.P1s  reason: case insensitive filesystem */
public final class C72327P1s implements C74479PvZ {
    public final /* synthetic */ OHJ A00;

    public final void Cus() {
    }

    public final void Cuu(C317966o8 r2, C69319NjK njK, int i) {
        C74511Pw6 pw6;
        0qQ.A0B(njK, 2);
        C70983OUx oUx = this.A00.A03.A0J.A00.A00;
        if (oUx != null && (pw6 = C70983OUx.A00(oUx).A02) != null) {
            pw6.Csp(r2, njK, i);
        }
    }

    public final void Cv8(C61077JwF jwF, int i) {
    }

    public final void DdJ(int i) {
    }

    public C72327P1s(OHJ ohj) {
        this.A00 = ohj;
    }

    public final void DuL(String str) {
        Object obj;
        P3E p3e = this.A00.A03;
        ArrayList A0U = 00k.A0U(p3e.A09.A04);
        Iterator it = A0U.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((N41) obj).A01(), str)) {
                break;
            }
        }
        0u4.A00(A0U).remove(obj);
        N40 n40 = p3e.A09;
        P3E.A03(p3e, n40, n40.A00, n40.A02, A0U);
    }
}
