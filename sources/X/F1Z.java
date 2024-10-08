package X;

import com.instagram.common.session.UserSession;

public final class F1Z {
    public final void A00(AnonymousClass0iw r4, UserSession userSession, String str, long j) {
        DbY.A1S(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "instagram_clips_likers_impression");
        if (A0e.isSampled()) {
            A0e.A8M(C52236GKd.A0n, "action");
            A0e.A8M(AnonymousClass5OC.LIKE_SHEET, "action_source");
            DbW.A16(A0e, r4);
            A0e.AAJ("media_compound_key", str);
            DbZ.A1I(A0e, j);
        }
    }
}
