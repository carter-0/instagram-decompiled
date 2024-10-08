package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;

public abstract class HUQ {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.4Lh, java.lang.Object] */
    public static final void A00(C238863Ds r8, UserSession userSession, AnonymousClass4DU r10, String str) {
        AnonymousClass3GX A00 = AnonymousClass3GX.A00(userSession);
        0qQ.A07(A00);
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U != null && !A0U.CcK()) {
            ? obj = new Object();
            obj.A01 = A0U;
            obj.A02 = r10;
            obj.A06 = false;
            obj.A00 = null;
            obj.A05 = Collections.emptySet();
            A00.A04(obj, 0sr.A1N(DbT.A0x(A0U)), AnonymousClass7TE.A1I(new C238873Dt(r8)), 1, true);
        }
    }
}
