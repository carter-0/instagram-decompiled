package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6uP  reason: invalid class name and case insensitive filesystem */
public final class C321576uP implements AnonymousClass0lh, C242843Wf {
    public Integer A00 = null;
    public Integer A01 = null;
    public String A02 = null;
    public String A03 = null;
    public String A04 = null;
    public final UserSession A05;

    public C321576uP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        C242863Wh A002 = C242853Wg.A00(userSession);
        A002.A00.add(new WeakReference(this));
    }

    public final Map B3T() {
        HashMap hashMap = new HashMap();
        Integer num = this.A01;
        if (num != null) {
            hashMap.put("client_following_count", String.valueOf(num.intValue()));
        }
        Integer num2 = this.A00;
        if (num2 != null) {
            hashMap.put("client_follower_count", String.valueOf(num2.intValue()));
        }
        String str = this.A04;
        if (str != null) {
            hashMap.put("visited_profile_id", str);
        }
        String str2 = this.A02;
        if (str2 != null) {
            hashMap.put("attempted_username", str2);
        }
        String str3 = this.A03;
        if (str3 != null) {
            hashMap.put("follow_error", str3);
        }
        return hashMap;
    }

    public final void onSessionWillEnd() {
        C242853Wg.A00(this.A05).A00(this);
    }
}
