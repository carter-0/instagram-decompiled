package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Text;

public final class P0V implements C74384Pu0 {
    public static final P0V A00 = new Object();

    public final void A8C(UserSession userSession, OIH oih, AddMessageContent addMessageContent, C254703su r5, C331237Qc r6) {
        DbZ.A0t(0, userSession, r5, addMessageContent);
        Text A0N = addMessageContent.A0N();
        0qQ.A07(A0N);
        C70060Nwc.A00(userSession, A0N, r5);
    }

    public final boolean FMq(AddMessageContent addMessageContent) {
        0qQ.A0B(addMessageContent, 0);
        return C66581MXm.A1V(addMessageContent.addMessageContentCase_);
    }
}
