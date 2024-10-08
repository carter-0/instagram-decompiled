package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5Gf  reason: invalid class name and case insensitive filesystem */
public final class C283125Gf {
    public final UserSession A00;
    public final 0xa A01;

    public final void A00(boolean z) {
        0xY AR4 = this.A01.AR4();
        AR4.E5T("is_self_security_alert_enabled", z);
        AR4.apply();
        C67572Mq6.A00(new GL4(z, 9), this.A00);
    }

    public final boolean A01() {
        if (!182.A06(0Tu.A06, this.A00, 36320317927858464L) || !this.A01.getBoolean("enable_security_alert_local_control", false)) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        0xa r2 = this.A01;
        boolean contains = r2.contains("is_self_security_alert_enabled");
        UserSession userSession = this.A00;
        if (contains) {
            return r2.getBoolean("is_self_security_alert_enabled", ((Boolean) 2HM.A00(userSession).A06.A00()).booleanValue());
        }
        0Tu r22 = 0Tu.A06;
        if (182.A06(r22, userSession, 36321481860785580L) || !A01()) {
            return ((Boolean) 2HM.A00(userSession).A06.A00()).booleanValue();
        }
        boolean A06 = 182.A06(r22, userSession, 36320317928317219L);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public C283125Gf(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = 1Al.A01(userSession).A04(1An.A1D, getClass());
    }
}
