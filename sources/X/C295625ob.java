package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.5ob  reason: invalid class name and case insensitive filesystem */
public final class C295625ob {
    @Deprecated(message = "Use runAsync with errorCallback instead", replaceWith = @ReplaceWith(expression = "runAsync(userSession, callback, errorCallback)", imports = {}))
    public final void A02(0sP r2, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        A01(userSession, C295635oc.A00, r2);
    }

    public static final void A00(1xN r3, UserSession userSession) {
        C295615oa r0;
        if (r3 != null && !userSession.A07()) {
            MsysActiveUserSession A01 = 1y0.A01(userSession);
            Class<C295615oa> cls = C295615oa.class;
            if (A01.A05(cls) && (r0 = (C295615oa) A01.A00(cls)) != null) {
                r0.A00.mStoredProcedureChangedListeners.remove(r3);
            }
        }
    }

    public final void A01(UserSession userSession, C62320sa r6, 0sP r7) {
        if (userSession.A07()) {
            0KC.A0C("IgMailbox", "UserSession is stopped, cannot run async callback");
            r6.invoke();
            return;
        }
        MsysActiveUserSession A00 = 1y0.A00(userSession);
        Class<C295615oa> cls = C295615oa.class;
        if (A00.A05(cls)) {
            r7.invoke(((C295615oa) 1y0.A00(userSession).A01(cls, new AnonymousClass9LX(userSession, 19))).A00);
        } else {
            1aD.A01(userSession, "IgMailbox.getAsync").A03(new C295645od(A00, r7));
        }
    }
}
