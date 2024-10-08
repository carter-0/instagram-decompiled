package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

/* renamed from: X.MoQ  reason: case insensitive filesystem */
public final class C67471MoQ {
    @Deprecated(message = "Will block to wait for Mailbox. Remove with Legacy Armadillo.")
    public static final C66794Mcg A00(UserSession userSession) {
        return new C66794Mcg(((C295615oa) C66582MXn.A0c(userSession).A01(C295615oa.class, new AnonymousClass9LX(userSession, 19))).A00);
    }

    @Deprecated(message = "Use IgAccountSessionMailboxApiHandleMetaProvider to create a MailboxApiHandleMetaProvider to run sync")
    public static final void A01(UserSession userSession, AnonymousClass61K r2, 0sP r3) {
        1aD A00 = 1aD.A00(userSession, r2);
        0qQ.A07(A00);
        A00.A03(new C73452Pcu(16, r3));
    }

    @Deprecated(message = "Use IgAccountSessionMailboxApiHandleMetaProvider to create a MailboxApiHandleMetaProvider to run sync")
    public final void A02(UserSession userSession, AnonymousClass61K r4, 0sP r5) {
        if (!AnonymousClass45R.A00(userSession) || C66612MYy.A00.A02(userSession, true)) {
            r5.invoke(C66845Mdd.A00.A00(userSession));
        } else {
            A01(userSession, r4, r5);
        }
    }
}
