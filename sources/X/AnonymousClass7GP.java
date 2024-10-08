package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.7GP  reason: invalid class name */
public final class AnonymousClass7GP {
    public final 0wc A00;

    public AnonymousClass7GP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A02(userSession);
    }

    public final void A00(C69475NmJ nmJ, long j, long j2) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "audio_clips_playback_resume");
        if (A002.isSampled()) {
            A002.A9F("position", Long.valueOf(j));
            A002.A9F(TraceFieldType.Duration, Long.valueOf(j2));
            A002.AAJ("attachment_id", (String) null);
            A002.A7p("has_access_token", false);
            if (nmJ != null) {
                A002.A8M(nmJ, "source_click_category");
            }
            A002.Cgf();
        }
    }

    public final void A01(Throwable th) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "audio_clips_creation_failed");
        if (A002.isSampled()) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            A002.AAJ("error_message", message);
            A002.Cgf();
        }
    }

    public AnonymousClass7GP() {
    }
}
