package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ori  reason: case insensitive filesystem */
public final class C71841Ori implements C242843Wf {
    public RtcCallKey A00;
    public final UserSession A01;

    public final Map B3T() {
        RtcCallKey rtcCallKey = this.A00;
        if (rtcCallKey == null) {
            return null;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("last_video_call_was_interop", "yes");
        A1E.put("last_video_call_esid", rtcCallKey.A00);
        return A1E;
    }

    public C71841Ori(UserSession userSession) {
        this.A01 = userSession;
        C242863Wh A002 = C242853Wg.A00(userSession);
        A002.A00.add(C51965G9l.A0v(this));
    }
}
