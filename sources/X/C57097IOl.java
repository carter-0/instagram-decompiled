package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.IOl  reason: case insensitive filesystem */
public final class C57097IOl implements AnonymousClass0lh, C242843Wf {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final UserSession A02;

    public C57097IOl(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        C242863Wh A002 = C242853Wg.A00(userSession);
        A002.A00.add(C51965G9l.A0v(this));
    }

    public final void onSessionWillEnd() {
        C242853Wg.A00(this.A02).A00(this);
    }

    public final Map B3T() {
        HashMap A1E = AnonymousClass7TE.A1E();
        Boolean bool = this.A01;
        if (bool != null) {
            A1E.put("is_last_clips_request_successful", String.valueOf(bool.booleanValue()));
        }
        Boolean bool2 = this.A00;
        if (bool2 != null) {
            A1E.put("did_clip_start", String.valueOf(bool2.booleanValue()));
        }
        return A1E;
    }
}
