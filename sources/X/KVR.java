package X;

import com.instagram.common.session.UserSession;

public final class KVR extends FYW {
    public final UserSession A00;

    public KVR(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final String A00() {
        return AnonymousClass000.A00(3861);
    }

    public final void A01() {
        0xY A0p = AnonymousClass7TE.A0p(1Au.A00(this.A00));
        A0p.E5T("has_seen_reels_carousel_entrypoint_nux", true);
        A0p.apply();
    }

    public final boolean A03() {
        return !DbT.A1a(AnonymousClass7TE.A0q(this.A00), "has_seen_reels_carousel_entrypoint_nux");
    }
}
