package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;

/* renamed from: X.Pde  reason: case insensitive filesystem */
public final /* synthetic */ class C73497Pde implements C62320sa {
    public final /* synthetic */ UserSession A00;

    public /* synthetic */ C73497Pde(UserSession userSession) {
        this.A00 = userSession;
    }

    public final Object invoke() {
        return new ArmadilloExpressLinkMessageSender(this.A00);
    }
}
