package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DeC  reason: case insensitive filesystem */
public final class C46390DeC {
    public final UserSession A00;

    public C46390DeC(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(0wc r6, String str, String str2) {
        0qQ.A0B(r6, 0);
        0Aj A0e = AnonymousClass7TE.A0e(r6, "ig_status_impression");
        if (A0e.isSampled()) {
            A0e.A9F("author_id", Long.valueOf(DbZ.A07(str)));
            A0e.A9F("media_id", Long.valueOf(DbZ.A07("")));
            A0e.A9F("inventory_count", 0L);
            A0e.AAJ("status_text", "");
            A0e.AAJ("emoji", "");
            DbS.A1N(A0e, "profile");
            A0e.AAJ("audio_cluster_id", str2);
            A0e.Cgf();
        }
    }
}
