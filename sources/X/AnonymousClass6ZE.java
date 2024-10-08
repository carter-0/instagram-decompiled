package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6ZE  reason: invalid class name */
public final class AnonymousClass6ZE implements AnonymousClass6ZF {
    public final /* synthetic */ AnonymousClass6Z5 A00;

    public AnonymousClass6ZE(AnonymousClass6Z5 r1) {
        this.A00 = r1;
    }

    public final void D8M(Reel reel, C255773uh r7) {
        C310016aI r4 = this.A00.A0L;
        if (r4 == null) {
            0qQ.A0F("reelViewerLogger");
            throw AnonymousClass00P.createAndThrow();
        } else if (r7.CWu()) {
            C310026aJ r3 = r4.A0A;
            r3.A00 = reel;
            C254523sc r2 = new C254523sc(r3, "reel_more_action");
            C310016aI.A04(r2, (GT8) r4.A0I.get(r7.CFY()), r4);
            UserSession userSession = r4.A06;
            1Xj r0 = r7.A0b;
            if (r0 != null) {
                r2.A0G(userSession, r0);
                r2.A4J = "delete_post";
                C233822wX.A0I(userSession, r2, r3, AnonymousClass05K.A00);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
