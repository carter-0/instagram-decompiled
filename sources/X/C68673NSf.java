package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NSf  reason: case insensitive filesystem */
public final class C68673NSf extends 0vM {
    public final /* synthetic */ 2Dn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68673NSf(2Dn r3) {
        super("DirectInboxStateStorePreload", 1919043763);
        this.A00 = r3;
    }

    public final void loggedRun() {
        boolean A1a;
        2EM r7;
        UserSession userSession = this.A00.A02;
        C67207Mk3 mk3 = (C67207Mk3) userSession.A01(C67207Mk3.class, new C73910Pll(userSession, 37));
        synchronized (mk3) {
            A1a = DbW.A1a(mk3.A01);
        }
        if (A1a) {
            mk3.A00 = C67208Mk4.IN_PROGRESS;
            UserSession userSession2 = mk3.A02;
            boolean A0A = 2El.A0A(userSession2);
            if (!2El.A0C(userSession2)) {
                r7 = AnonymousClass43A.A00;
            } else if (!2El.A03(userSession2) || 182.A06(0Tu.A05, userSession2, 36315387301858464L)) {
                r7 = AnonymousClass2EU.A00;
            } else {
                r7 = AnonymousClass2EY.A00;
            }
            Mi5 A002 = Mi4.A00(userSession2);
            C251033mS A003 = C251033mS.A00(userSession2);
            Context context = C60960kU.A00;
            0qQ.A07(context);
            C2611948q r9 = C2611948q.ALL;
            C70616ODn oDn = new C70616ODn(new C67014Mgn(context, C66582MXn.A0O(userSession2, AnonymousClass436.A00), userSession2, new C66687Mau(context, userSession2, A002, A003), r7, 1bJ.A00(userSession2), r9, C251033mS.A00(userSession2), A0A, false, false), r7, A0A);
            synchronized (mk3) {
                mk3.A01 = oDn;
            }
            oDn.A00.A09.start();
        }
    }
}
