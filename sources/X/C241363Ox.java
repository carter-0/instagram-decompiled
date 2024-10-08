package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Ox  reason: invalid class name and case insensitive filesystem */
public final class C241363Ox extends 0vM {
    public final /* synthetic */ 2Dn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C241363Ox(2Dn r7) {
        super("warmDirectInboxCache", 367, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Dn r4 = this.A00;
        UserSession userSession = r4.A02;
        2L2.A00(2DU.A00(userSession).A09).CnD(true, "InitializerWarmCache");
        if (182.A06(0Tu.A05, userSession, 36328285089119428L)) {
            2L2.A00(userSession).A01 = new AnonymousClass9SI((C2366634p) null, new C73899Pla(r4, 42));
        }
    }
}
