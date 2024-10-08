package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

public final class FEG {
    public static final FEG A00 = new Object();

    public static final void A00(UserSession userSession, Reel reel, boolean z) {
        if (reel.A0o()) {
            AnonymousClass3BJ.A00(userSession).A02 = z;
            return;
        }
        1Ns r4 = reel.A0W;
        if (r4 != null) {
            for (Reel reel2 : ReelStore.A03(userSession).A0U(false)) {
                1Ns r0 = reel2.A0W;
                if (r0 != null && 0qQ.A0K(r0.getId(), r4.getId())) {
                    reel2.A1Y = z;
                }
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
