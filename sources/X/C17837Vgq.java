package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Vgq  reason: case insensitive filesystem */
public final class C17837Vgq {
    public final /* synthetic */ C230212pD A00;
    public final /* synthetic */ C254063rs A01;
    public final /* synthetic */ AnonymousClass5GH A02;

    public C17837Vgq(C230212pD r1, C254063rs r2, AnonymousClass5GH r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void A00(Reel reel, C255773uh r7) {
        C230212pD r4 = this.A00;
        0qQ.A0B(r7, 0);
        UserSession userSession = r4.A04;
        reel.A0S(userSession, r7.A03());
        1Xj r2 = r7.A0b;
        if (r2 != null) {
            r4.A08.A06(r7.A0k, userSession, r2);
        }
    }
}
