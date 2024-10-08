package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;

/* renamed from: X.42x  reason: invalid class name and case insensitive filesystem */
public final class C2597442x implements C2597342w {
    public final UserSession A00;

    public C2597442x(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void D8q(C254703su r1, DirectThreadKey directThreadKey, boolean z) {
    }

    public final void D8r(DirectThreadKey directThreadKey, Long l, String str, boolean z) {
    }

    public final void D8s(C254703su r5, DirectThreadKey directThreadKey, boolean z) {
        if (2FW.A0L == r5.A10) {
            UserSession userSession = this.A00;
            ArrayList Aax = 1bJ.A00(userSession).Aax(directThreadKey, false);
            String str = directThreadKey.A00;
            if (str != null) {
                C331247Qd.A02(userSession, str, Aax);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void Dq6(AnonymousClass651 r1) {
    }
}
