package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class WNR implements X3E {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ AnonymousClass6Z5 A01;

    public WNR(Reel reel, AnonymousClass6Z5 r2) {
        this.A01 = r2;
        this.A00 = reel;
    }

    public final void onSuccess() {
        AnonymousClass6Z5 r4 = this.A01;
        UserSession userSession = r4.A09;
        if (userSession != null) {
            1Ng A002 = AnonymousClass1Nd.A00(userSession);
            Reel reel = this.A00;
            A002.A00(new C321936uz(reel));
            UserSession userSession2 = r4.A09;
            if (userSession2 != null) {
                AnonymousClass1Nd.A00(userSession2).A00(new C321946v0(reel));
                r4.A17.CpD();
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }
}
