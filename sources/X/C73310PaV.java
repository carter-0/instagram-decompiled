package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PaV  reason: case insensitive filesystem */
public final class C73310PaV implements Runnable {
    public final /* synthetic */ C279864zZ A00;
    public final /* synthetic */ AnonymousClass4AF A01;
    public final /* synthetic */ C72957PQp A02;

    public C73310PaV(C279864zZ r1, AnonymousClass4AF r2, C72957PQp pQp) {
        this.A02 = pQp;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C72957PQp pQp = this.A02;
        pQp.A03 = true;
        AnonymousClass4AF r2 = this.A01;
        C279864zZ r1 = this.A00;
        UserSession userSession = pQp.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A01(C319726r6.POG, C71130OdT.A00(r1, userSession));
    }
}
