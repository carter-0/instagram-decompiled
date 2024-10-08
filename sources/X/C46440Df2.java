package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Df2  reason: case insensitive filesystem */
public final class C46440Df2 extends C319156q8 {
    public final UserSession A00;

    public C46440Df2(UserSession userSession, C323256xC r5, String str) {
        super(r5, (C319176qA) new C46441Df3(str), "tap_barcelona", (int) R.drawable.instagram_app_threads_pano_outline_24);
        this.A00 = userSession;
    }

    public final G5B A01() {
        G5B g5b;
        int i;
        C323256xC r5 = this.A01;
        C323336xK r0 = r5.A0D;
        if (r0 != null && (i = r0.A00) > 0) {
            if (182.A06(0Tu.A05, this.A00, 36320889154839479L)) {
                return new C50692Fgr(i);
            }
        }
        if (!DbT.A1a(AnonymousClass7TE.A0q(r5.A09), C273654mx.A00(1528))) {
            g5b = C50690Fgp.A00;
        } else {
            g5b = C50691Fgq.A00;
        }
        return g5b;
    }

    public final void A02() {
        C323256xC r4 = this.A01;
        C323336xK r7 = r4.A0D;
        boolean z = false;
        if (r7 != null) {
            if (r7.A00 > 0) {
                z = true;
            }
            if (!182.A06(0Tu.A05, r4.A09, 36318887703878249L)) {
                r7.A00 = 0;
            }
        }
        C323256xC.A01(r4);
        UserSession userSession = r4.A09;
        if (C319886rO.A02(userSession) && C319886rO.A01(userSession) && 182.A06(0Tu.A05, userSession, 36318887702174289L)) {
            C49908FEg.A00(r4.A06, userSession);
        } else if (z) {
            FragmentActivity fragmentActivity = r4.A06;
            if (0oI.A0A(fragmentActivity)) {
                FH7.A02(fragmentActivity, 002.A0R(C273654mx.A00(1525), ""));
            } else {
                C49965FGy.A03(fragmentActivity, userSession, "settings", (String) null);
            }
        } else {
            User user = r4.A0E;
            if (user == null) {
                user = DbT.A0j(userSession);
            }
            C49965FGy.A01(r4.A06, userSession, (Integer) null, r4.A0I, user.getUsername(), "settings");
        }
    }

    public final void A03() {
        C323256xC r0 = this.A01;
        C323256xC.A01(r0);
        C49908FEg.A00(r0.A06, r0.A09);
    }
}
