package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class OP8 {
    public static final boolean A01(UserSession userSession, String str, int i) {
        if (str != null) {
            return (i == 0 || i == 1) && !182.A06(0Tu.A06, userSession, 36329410370027624L);
        }
        return false;
    }

    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        0qQ.A0B(r3, 4);
        if (str != null) {
            1pE A01 = 1pE.A01(fragmentActivity, r3, userSession, str2);
            A01.A00 = null;
            DbZ.A1Z(A01, str);
            A01.A0F = null;
            A01.A0K = str3;
            DbV.A1R(A01);
        }
    }
}
