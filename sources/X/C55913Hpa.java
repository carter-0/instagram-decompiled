package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hpa  reason: case insensitive filesystem */
public final class C55913Hpa {
    public final AnonymousClass0eM A00;

    public C55913Hpa(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0eN.A00(0eO.A02, new C13346TVt(userSession, 46));
    }

    public final void A00(HOI hoi, Long l) {
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A00.getValue(), "ig_ai_memu_in_feed_setting_disable");
        if (A0e.isSampled()) {
            DbS.A1O(A0e, "feed_timeline");
            A0e.A8M(hoi, "reason");
            if (l != null && l.longValue() == -1) {
                l = null;
            }
            A0e.A9F("content_id", l);
            A0e.Cgf();
        }
    }
}
