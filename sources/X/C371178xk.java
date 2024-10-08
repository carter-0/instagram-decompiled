package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.8xk  reason: invalid class name and case insensitive filesystem */
public abstract class C371178xk {
    public static final void A00(UserSession userSession, DirectThreadKey directThreadKey, boolean z) {
        0qQ.A0B(userSession, 0);
        String str = directThreadKey.A00;
        if (str != null) {
            0xY AR4 = 1Al.A01(userSession).A03(1An.A0Z).AR4();
            AR4.E5T(002.A0R("BROADCAST_CHAT_CREATION_KEY", str), z);
            AR4.apply();
        }
    }

    public static final boolean A01(UserSession userSession, DirectThreadKey directThreadKey) {
        String str = directThreadKey.A00;
        if (str != null) {
            return !1Al.A01(userSession).A03(1An.A0Z).getBoolean(002.A0R("BROADCAST_CHAT_CREATION_KEY", str), false);
        }
        return false;
    }
}
