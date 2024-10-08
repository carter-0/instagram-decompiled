package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender;

/* renamed from: X.Pdf  reason: case insensitive filesystem */
public final /* synthetic */ class C73498Pdf implements C62320sa {
    public final /* synthetic */ UserSession A00;

    public /* synthetic */ C73498Pdf(UserSession userSession) {
        this.A00 = userSession;
    }

    public final Object invoke() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 1);
        return new ArmadilloExpressStorySender(userSession);
    }
}
