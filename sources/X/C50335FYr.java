package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FYr  reason: case insensitive filesystem */
public final class C50335FYr implements AnonymousClass0lh {
    public C348437yS A00 = new Object();
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.7yS, java.lang.Object] */
    public C50335FYr(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public static final boolean A00(C50335FYr fYr, boolean z) {
        boolean booleanValue;
        UserSession userSession = fYr.A01;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36314450998856242L)) {
            booleanValue = false;
        } else {
            if (z) {
                r2 = 0Tu.A05;
            }
            booleanValue = Boolean.valueOf(182.A06(r2, userSession, 36314450999052853L)).booleanValue();
        }
        if (booleanValue || !182.A06(0Tu.A05, userSession, 2342155969858962998L) || !AnonymousClass7TE.A0q(userSession).getBoolean("fx_cal_profile_pic_is_upsell_seen", false)) {
            return false;
        }
        return true;
    }

    public final boolean A01(boolean z) {
        UserSession userSession = this.A01;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 2342155969858897461L) || !this.A00.A04 || A00(this, false)) {
            return false;
        }
        if (!z) {
            r2 = 0Tu.A06;
        }
        return 182.A06(r2, userSession, 36312956350236211L);
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C50335FYr.class);
    }
}
