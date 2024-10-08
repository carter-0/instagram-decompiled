package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBo  reason: case insensitive filesystem */
public final class C52017GBo {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public final void A00(C267324bN r4, long j, long j2, long j3, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A00, this.A01), "instagram_reels_auto_advance_countdown_started");
        if (A0e.isSampled()) {
            A0e.A9F("num_of_loops", Long.valueOf(j));
            A0e.A9F("clip_duration", Long.valueOf(j2));
            A0e.A9F("trigger_time", Long.valueOf(j3));
            A0e.A7p("is_short_video", Boolean.valueOf(z));
            String str = null;
            C51965G9l.A1J(A0e, C51969G9p.A0u(r4.A02));
            if (r4.CcK()) {
                str = C51966G9m.A1B(r4);
            }
            A0e.AAJ("ad_id", str);
            C51965G9l.A1L(A0e, r4.A0P);
            A0e.Cgf();
        }
    }

    public C52017GBo(AnonymousClass0iw r1, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r1);
        this.A01 = userSession;
        this.A00 = r1;
    }
}
