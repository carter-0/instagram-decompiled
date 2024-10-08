package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.335  reason: invalid class name */
public final class AnonymousClass335 {
    public final HashMap A00 = new HashMap();

    public final C246663ey A00(UserSession userSession, AnonymousClass3W1 r4, String str, boolean z) {
        HashMap hashMap = this.A00;
        C246663ey r0 = (C246663ey) hashMap.get(str);
        if (r0 == null) {
            r0 = new C246663ey(userSession, r4, str, z);
        }
        hashMap.put(str, r0);
        return r0;
    }
}
