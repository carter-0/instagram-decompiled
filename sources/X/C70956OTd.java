package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OTd  reason: case insensitive filesystem */
public final class C70956OTd {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public C70956OTd(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0eO r1 = 0eO.A02;
        this.A02 = MYO.A00(userSession, r1, 20);
        this.A03 = MYO.A00(userSession, r1, 21);
        this.A04 = MYO.A00(userSession, r1, 22);
    }

    public static final boolean A00(C70956OTd oTd) {
        AnonymousClass0eM r1 = oTd.A02;
        if (!((AnonymousClass65E) r1.getValue()).A00() || !AnonymousClass65A.A02(C66581MXm.A0S(r1), 36326627231217546L)) {
            return false;
        }
        AnonymousClass0eM r3 = oTd.A04;
        if (((C67458MoD) r3.getValue()).A05() == 0 || ((C67458MoD) r3.getValue()).A05() - System.currentTimeMillis() > 0) {
            return false;
        }
        return true;
    }
}
