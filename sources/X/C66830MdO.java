package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MdO  reason: case insensitive filesystem */
public abstract class C66830MdO {
    public static final boolean A00(UserSession userSession, String str) {
        if (str.length() == 0) {
            return false;
        }
        long A01 = 182.A01(0Tu.A05, userSession, 36607372064331327L);
        1Av A00 = 1Au.A00(userSession);
        if (A00.A01.getLong(002.A0R("odn_total_media_messages_inferenced_for_thread/", str), 0) < A01) {
            return false;
        }
        return true;
    }
}
