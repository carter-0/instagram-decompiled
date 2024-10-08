package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender;

/* renamed from: X.Pdb  reason: case insensitive filesystem */
public final /* synthetic */ class C73494Pdb implements C62320sa {
    public final /* synthetic */ UserSession A00;

    public /* synthetic */ C73494Pdb(UserSession userSession) {
        this.A00 = userSession;
    }

    public final Object invoke() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 1);
        return new ArmadilloExpressStorySender(userSession);
    }
}
