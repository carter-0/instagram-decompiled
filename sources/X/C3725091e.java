package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.91e  reason: invalid class name and case insensitive filesystem */
public final class C3725091e implements AnonymousClass0lh {
    public final 1Ng A00;
    public final 1wn A01 = new C3725291g(this);
    public final 1Av A02;
    public final Map A03;
    public final UserSession A04;

    public static boolean A00(C3725091e r4) {
        if (182.A06(0Tu.A05, r4.A04, 36310435204431979L)) {
            0xa r2 = r4.A02.A01;
            if (r2.getBoolean("unsend_warning_banner_dismissed", false) || r2.getInt("unsend_warning_banner_shown_count", 0) >= 2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void onSessionWillEnd() {
        this.A03.clear();
        this.A00.A02(this.A01, 2Kb.class);
    }

    public C3725091e(1Ng r2, UserSession userSession, 1Av r4) {
        this.A04 = userSession;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = new HashMap();
    }
}
