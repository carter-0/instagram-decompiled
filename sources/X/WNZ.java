package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class WNZ implements MRW {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ AnonymousClass6Z5 A02;

    public WNZ(AnonymousClass4DH r1, Reel reel, AnonymousClass6Z5 r3) {
        this.A02 = r3;
        this.A01 = reel;
        this.A00 = r1;
    }

    public final void DuO() {
        AnonymousClass6Z5 r5 = this.A02;
        UserSession userSession = r5.A09;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        Reel reel = this.A01;
        AnonymousClass738.A0A(new WNT(this.A00, reel, r5), userSession, JTP.A0r(reel));
    }
}
