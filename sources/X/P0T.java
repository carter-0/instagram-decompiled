package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Media;

public final class P0T implements C74384Pu0 {
    public static final P0T A00 = new Object();

    public final void A8C(UserSession userSession, OIH oih, AddMessageContent addMessageContent, C254703su r12, C331237Qc r13) {
        0qQ.A0B(userSession, 0);
        C51974G9v.A1M(r12, addMessageContent, oih);
        Media A0L = addMessageContent.A0L();
        0qQ.A07(A0L);
        boolean z = oih.A0C;
        C71113Od4.A05(userSession, A0L, r12, Long.valueOf(oih.A00), oih.A0B, z);
    }

    public final boolean FMq(AddMessageContent addMessageContent) {
        0qQ.A0B(addMessageContent, 0);
        return AnonymousClass7TF.A1S(addMessageContent.addMessageContentCase_, 5);
    }
}
