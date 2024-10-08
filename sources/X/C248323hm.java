package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hm  reason: invalid class name and case insensitive filesystem */
public final class C248323hm extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248323hm(2Lk r3) {
        super("maybeLogOneTapStatus", 377);
        this.A00 = r3;
    }

    public final void loggedRun() {
        String str;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0xa r4 = 1Au.A00(userSession).A01;
        long j = r4.getLong("last_one_tap_status_logged_date", 0);
        if (j == 0 || System.currentTimeMillis() - j > 604800000) {
            String str2 = userSession.A06;
            0wc A02 = AnonymousClass0kN.A02(userSession);
            0Aj A002 = A02.A00(A02.A00, "sso_status");
            if (C319606qt.A01(userSession).A0K(str2)) {
                str = "YES";
            } else {
                str = "NO";
            }
            A002.AAJ("enabled", str);
            A002.A9F(AnonymousClass000.A00(3052), Long.valueOf(Long.parseLong(str2)));
            A002.AAJ("containermodule", "sso_status");
            A002.Cgf();
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR4 = r4.AR4();
            AR4.E5c("last_one_tap_status_logged_date", currentTimeMillis);
            AR4.apply();
        }
    }
}
