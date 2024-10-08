package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Hr  reason: invalid class name and case insensitive filesystem */
public final class C376359Hr {
    public 1xN A00;
    public final UserSession A01;
    public final Object A02 = new Object();
    public final C376349Hq A03;

    public C376359Hr(UserSession userSession, C376349Hq r3) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = r3;
    }

    public final void A02(C74346PtM ptM, Integer num, C67468MoN[] moNArr) {
        0qQ.A0B(moNArr, 1);
        UserSession userSession = this.A01;
        if (!182.A06(0Tu.A05, userSession, 36319690858962490L)) {
            ptM.DLX((N3U) null);
            return;
        }
        0nY.A00().ATE(new C66826MdI(userSession, new C66989MgN(ptM, this, num, moNArr)));
    }

    public final void A00() {
        if (182.A06(0Tu.A05, this.A01, 36319690858962490L)) {
            0nY.A00().ATE(new AnonymousClass9OW(this));
        }
    }

    public final void A01(C74336PtC ptC) {
        if (182.A06(0Tu.A05, this.A01, 36319690858962490L)) {
            0nY.A00().ATE(new AnonymousClass9O4(ptC, this));
        }
    }
}
