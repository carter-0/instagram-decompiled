package X;

import com.instagram.common.session.UserSession;

public final class GKV implements C59596JPq {
    public final 0xa A00;
    public final UserSession A01;
    public final C52249GKq A02;

    public GKV(UserSession userSession, 0xa r3, C52249GKq gKq) {
        0qQ.A0B(r3, 2);
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = gKq;
    }

    public final boolean CRo() {
        0xa r7 = this.A00;
        boolean z = false;
        if (r7.getInt("KEY_CLIPS_TAB_VISIT_COUNT", 0) <= 4 && System.currentTimeMillis() - r7.getLong("KEY_LAST_TAB_VISIT_TIMESTAMP_MS", 0) > 604800000 && System.currentTimeMillis() - r7.getLong("KEY_LAST_SEEN_UPSELL_IN_VIEWER_TIMESTAMP_MS", 0) > 86400000) {
            z = true;
        }
        if (!z) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.A02.A00;
        if (currentTimeMillis - DbW.A06(r7, 002.A0R("KEY_LAST_SEEN_UPSELL_IN_VIEWER_TIMESTAMP_MS", str)) <= 604800000 || r7.getInt(002.A0R("KEY_TOOLTIP_COUNT", str), 0) > 3) {
            return false;
        }
        return true;
    }

    public final void Dka() {
        String str = this.A02.A00;
        String A0R = 002.A0R("KEY_TOOLTIP_COUNT", str);
        0xa r0 = this.A00;
        int A002 = DbT.A00(r0, A0R);
        0xY AR4 = r0.AR4();
        AR4.E5c("KEY_LAST_SEEN_UPSELL_IN_VIEWER_TIMESTAMP_MS", System.currentTimeMillis());
        AR4.E5c(002.A0R("KEY_LAST_SEEN_UPSELL_IN_VIEWER_TIMESTAMP_MS", str), System.currentTimeMillis());
        AR4.E5Z(A0R, A002 + 1);
        AR4.apply();
    }
}
