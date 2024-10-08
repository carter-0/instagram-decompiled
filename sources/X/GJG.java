package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

public final class GJG implements AnonymousClass0lh, C242843Wf {
    public String A00 = null;
    public String A01 = null;
    public final UserSession A02;

    public GJG(UserSession userSession) {
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
        String str = this.A01;
        if (str != null) {
            A1E.put("last_video_has_text_translations", str);
        }
        String str2 = this.A00;
        if (str2 != null) {
            A1E.put("last_video_has_audio_translations", str2);
        }
        return A1E;
    }
}
