package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3We  reason: invalid class name and case insensitive filesystem */
public final class C242833We implements AnonymousClass0lh, C242843Wf {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public String A02 = null;
    public final UserSession A03;

    public C242833We(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        C242863Wh A002 = C242853Wg.A00(userSession);
        A002.A00.add(new WeakReference(this));
    }

    public final Map B3T() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.A01;
        if (bool != null) {
            hashMap.put("last_audio_was_unavailable", String.valueOf(bool.booleanValue()));
        }
        String str = this.A02;
        if (str != null) {
            hashMap.put("last_audio_unavailable_reason", str);
        }
        Boolean bool2 = this.A00;
        if (bool2 != null) {
            hashMap.put("last_audio_allowed_music_editing", String.valueOf(bool2.booleanValue()));
        }
        return hashMap;
    }

    public final void onSessionWillEnd() {
        C242853Wg.A00(this.A03).A00(this);
    }
}
