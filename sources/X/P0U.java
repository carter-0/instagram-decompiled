package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma;

public final class P0U implements C74384Pu0 {
    public static final P0U A00 = new Object();

    public final void A8C(UserSession userSession, OIH oih, AddMessageContent addMessageContent, C254703su r8, C331237Qc r9) {
        0qQ.A0B(userSession, 0);
        C51974G9v.A1M(r8, addMessageContent, oih);
        ReceiverFetchXma A0M = addMessageContent.A0M();
        0qQ.A07(A0M);
        C70061Nwd.A00(userSession, A0M, r8, Long.valueOf(oih.A00), oih.A0B);
    }

    public final boolean FMq(AddMessageContent addMessageContent) {
        0qQ.A0B(addMessageContent, 0);
        return AnonymousClass7TF.A1S(addMessageContent.addMessageContentCase_, 4);
    }
}
