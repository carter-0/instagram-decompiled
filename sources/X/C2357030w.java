package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.30w  reason: invalid class name and case insensitive filesystem */
public final class C2357030w implements C227282ix {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass2xS A02;

    public final void Dk4() {
    }

    public final void Dk5(1Xj r5) {
        UserSession userSession = this.A01;
        C246353eS.A05(this.A00, C246353eS.A00(AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU, new C64547Ldo(), userSession, r5, AnonymousClass05K.A01), userSession);
    }

    public C2357030w(Fragment fragment, UserSession userSession, AnonymousClass2xS r3) {
        this.A02 = r3;
        this.A00 = fragment;
        this.A01 = userSession;
    }

    public final void D0t(1Xj r5) {
        if (r5.A5G()) {
            UserSession userSession = this.A01;
            if (182.A06(0Tu.A05, userSession, 36323156897639330L)) {
                C232722uK r2 = this.A02.A0G;
                boolean A0B = AnonymousClass3WS.A0B(userSession, r5.CEL());
                AnonymousClass4M3 r0 = r2.A05;
                if (r0 != null) {
                    r0.EPC(A0B);
                }
            }
        }
    }
}
