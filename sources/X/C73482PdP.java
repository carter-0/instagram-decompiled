package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;

/* renamed from: X.PdP  reason: case insensitive filesystem */
public final /* synthetic */ class C73482PdP implements C62320sa {
    public final /* synthetic */ UserSession A00;

    public /* synthetic */ C73482PdP(UserSession userSession) {
        this.A00 = userSession;
    }

    public final Object invoke() {
        return new ArmadilloExpressLinkMessageSender(this.A00);
    }
}
