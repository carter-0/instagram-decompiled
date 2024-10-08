package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class CTD extends XEF implements 1XU, AnonymousClass1XV, C66446MSa {
    public long A00;
    public long A01;
    public final UserSession A02;
    public final CGO A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CTD(XEE xee, UserSession userSession) {
        super(xee);
        0qQ.A0B(xee, 4);
        this.A02 = userSession;
        C43893CHh cHh = (C43893CHh) this.A00.reinterpret(C43893CHh.class);
        1E9 A0S = C41846B3n.A0S(1E4.A00(userSession));
        List<DSN> list = cHh.A00;
        list = list == null ? cHh.A0o(100526016, C43962CMz.class) : list;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        for (DSN dsn : list) {
            dsn.E7w(A0S);
            A0p.add(dsn);
        }
        cHh.A00 = A0p;
        CGO cgo = new CGO();
        List<DSN> A0o = A0p == null ? cHh.A0o(100526016, C43962CMz.class) : A0p;
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0o);
        for (DSN jzc : A0o) {
            A0p2.add(new JZC(jzc));
        }
        cgo.A05 = A0p2;
        String str = cgo.A04;
        if (str != null) {
            C63345KvS.A00(A0p2, str);
        }
        this.A03 = cgo;
        this.A00 = -1;
        this.A01 = -1;
    }

    public final /* synthetic */ void EQF(String str) {
    }

    public final long AjJ() {
        return this.A01;
    }

    public final long AjP() {
        return this.A00;
    }

    public final boolean CP6() {
        return true;
    }

    public final boolean CPJ() {
        return false;
    }

    public final boolean CPt() {
        return AnonymousClass7TF.A1P((this.A00 > -1 ? 1 : (this.A00 == -1 ? 0 : -1)));
    }

    public final CGO F04() {
        CGO cgo = this.A03;
        cgo.A01 = this.A00;
        cgo.A00 = this.A01;
        return cgo;
    }

    public final /* bridge */ /* synthetic */ Object FH3() {
        return this.A00.reinterpret(C43893CHh.class);
    }

    public final String getNextMaxId() {
        return null;
    }

    public final void EQE(long j) {
        this.A01 = j;
    }

    public final void EQG(long j) {
        this.A00 = j;
    }
}
