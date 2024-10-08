package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.5sN  reason: invalid class name and case insensitive filesystem */
public final class C297805sN {
    public final void A01(UserSession userSession, AnonymousClass4DU r7, C250973mM r8, 1PW r9, Integer num, String str, String str2, String str3, int i, int i2, boolean z) {
        0qQ.A0B(r8, 2);
        0qQ.A0B(num, 9);
        C254523sc r2 = new C254523sc(A00(userSession, r8, str2, str3), r7, 002.A0R("instagram_netego_", str));
        r2.A42 = Long.valueOf((long) r9.A09);
        r2.A06(r9.A01);
        r2.A43 = Long.valueOf((long) r9.A0A);
        r2.A0A(r9.A04);
        Reel reel = r8.A0H;
        r2.A0O(reel.A0b);
        r2.A3z = Long.valueOf((long) reel.A01);
        r2.A47 = Long.valueOf((long) i);
        r2.A48 = Long.valueOf((long) r9.A02);
        r2.A0Q = i2;
        r2.A2r = num;
        r2.A1p = Boolean.valueOf(r9.A0H);
        r2.A1y = Boolean.valueOf(z);
        Integer num2 = AnonymousClass05K.A00;
        Integer num3 = r9.A0C;
        if (num2 == num3) {
            r2.A0G = r9.A03;
            r2.A80 = r9.A00();
        } else if (AnonymousClass05K.A01 == num3) {
            r2.A08 = r9.A03;
            if (!r9.A00().isEmpty()) {
                r2.A7P = (String) r9.A00().get(0);
            }
        }
        AnonymousClass3PI.A06(r2, reel);
        C233822wX.A0I(userSession, r2, r7, AnonymousClass05K.A01);
    }

    public static final C296215pf A00(UserSession userSession, C250973mM r8, String str, String str2) {
        return new C296215pf(userSession, r8.A0H, str, str2, r8.A01, r8.A0E);
    }
}
