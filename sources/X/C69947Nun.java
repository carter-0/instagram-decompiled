package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Nun  reason: case insensitive filesystem */
public abstract class C69947Nun {
    public static final boolean A00(UserSession userSession, N4P n4p) {
        if ((n4p.A08() instanceof MsysThreadId) || !n4p.A0v || !C51965G9l.A1a(0Tu.A06, userSession, 36313918423042361L) || (C300965yF.A05(n4p.A0L) instanceof MsysThreadId) || N4P.A05(n4p) || n4p.A0n || n4p.A0d || 0qQ.A0K(n4p.A0N, "SPAM") || !OPP.A01(n4p.A0X)) {
            return false;
        }
        if (!JTR.A1Z(userSession) || 182.A06(0Tu.A05, userSession, 36313918422911288L)) {
            return true;
        }
        return false;
    }
}
