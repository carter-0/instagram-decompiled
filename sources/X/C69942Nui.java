package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Nui  reason: case insensitive filesystem */
public abstract class C69942Nui {
    public static final AnonymousClass7ZA A00(UserSession userSession, C254793t3 r4) {
        AnonymousClass7ZA r2;
        AnonymousClass7TG.A1N(userSession, r4);
        if (r4 instanceof MsysThreadId) {
            r2 = new PCP(userSession);
        } else {
            r2 = new AnonymousClass7Z9(userSession, new PCS(r4), 1bJ.A00(userSession));
        }
        return r2;
    }
}
