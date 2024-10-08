package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.6n7  reason: invalid class name and case insensitive filesystem */
public final class C317346n7 {
    public final 1Av A00;
    public final UserSession A01;

    public C317346n7(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = 1Au.A00(userSession);
    }

    public final boolean A00(C250973mM r5) {
        String str;
        0qQ.A0B(r5, 0);
        String str2 = this.A01.A06;
        Reel reel = r5.A0H;
        User A0D = reel.A0D();
        if (A0D != null) {
            str = A0D.getId();
        } else {
            str = null;
        }
        if (!0qQ.A0K(str2, str) && reel.A0l()) {
            1Av r3 = this.A00;
            if (((Boolean) r3.A42.CDM(r3, 1Av.A8a[142])).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
