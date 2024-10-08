package X;

import com.facebook.msys.mca.MailboxFeature;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

public abstract class OXH {
    public static final void A02(0sP r3, UserSession userSession) {
        if (C66612MYy.A00.A02(userSession, true)) {
            AnonymousClass681 r0 = NAY.A00;
            r3.invoke(new MailboxFeature((C71620Oo0) userSession.A01(C71620Oo0.class, C73911Plm.A00(userSession, 5))));
            return;
        }
        O4T.A00.A02(userSession, AnonymousClass61K.IGD_MEM, C74178PqK.A00(r3, 10));
    }

    @Deprecated(message = "This method may block to wait for mailbox initialization, use runAsync instead or create via MEMContextApiHandleMetaProvider.")
    public static final NAY A00(UserSession userSession) {
        return ((O80) C66582MXn.A0c(userSession).A01(O80.class, C73911Plm.A00(userSession, 13))).A00;
    }

    public static final void A01(UserSession userSession, C62320sa r4, 0sP r5) {
        if (userSession.A07()) {
            r4.invoke();
        } else if (C66612MYy.A00.A02(userSession, true) || C3027865g.A00(userSession, AnonymousClass0yP.A00(36325965807957419L), true)) {
            AnonymousClass681 r0 = NAY.A00;
            r5.invoke(new MailboxFeature((C71620Oo0) userSession.A01(C71620Oo0.class, C73911Plm.A00(userSession, 5))));
        } else {
            C295615oa.A01.A01(userSession, r4, C74178PqK.A00(r5, 11));
        }
    }
}
