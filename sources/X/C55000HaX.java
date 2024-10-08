package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* renamed from: X.HaX  reason: case insensitive filesystem */
public abstract class C55000HaX {
    public static final boolean A00(UserSession userSession, 1Xj r9) {
        C250243l8 Ata;
        String BEx;
        0qQ.A0B(r9, 0);
        C250513lZ A0w = C51966G9m.A0w(r9);
        if (A0w == null || (Ata = A0w.Ata()) == null || (BEx = Ata.BEx()) == null) {
            return false;
        }
        C71129OdS.A03(userSession, ThreadFetchReason.CLICK_TO_JOIN, (C74484Pve) null, (Integer) null, BEx, false);
        AnonymousClass3U9 C60 = 2L2.A00(userSession).C60(BEx);
        if (C60 != null) {
            return C60.COP();
        }
        return false;
    }
}
