package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6wn  reason: invalid class name and case insensitive filesystem */
public final class C323016wn {
    public final 0xa A00;

    public final void A00() {
        0xY AR4 = this.A00.AR4();
        AR4.E5T("seen_my_week_nux", true);
        AR4.apply();
    }

    public final void A01(boolean z) {
        0xY AR4 = this.A00.AR4();
        AR4.E5T("my_week_enabled", z);
        AR4.apply();
        if (z) {
            A00();
        }
    }

    public C323016wn(UserSession userSession) {
        this.A00 = 1Al.A01(userSession).A04(1An.A2S, getClass());
    }
}
