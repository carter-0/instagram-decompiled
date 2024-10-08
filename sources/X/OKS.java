package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Like;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

public final class OKS {
    public final UserSession A00;
    public final C66638Ma7 A01;

    public OKS(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C70175NyT.A00(userSession);
    }

    public final void A00(C74551Pwk pwk, AnonymousClass1cj r10) {
        C68404NFl A002 = AddMessageContent.A00();
        C66582MXn.A0Q(A002, Like.DEFAULT_INSTANCE.A0I()).addMessageContentCase_ = 2;
        AnonymousClass1cj r5 = r10;
        this.A01.A02(C70992OVn.A00.A01(this.A00, (AddMessageContent) C66580MXl.A0M(A002), (DirectForwardingParams) null, (OCA) null, r5), pwk, r5, (DirectThreadKey) C66582MXn.A0q(r10), 0);
    }
}
