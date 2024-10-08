package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4HS  reason: invalid class name */
public final class AnonymousClass4HS {
    public long A00;
    public final UserSession A01;
    public final 1Av A02;

    public final void A00() {
        1Av r0 = this.A02;
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = r0.A01.AR4();
        AR4.E5c("notification_feed_304_cooldown_timestamp", currentTimeMillis);
        AR4.apply();
        this.A00 = System.currentTimeMillis();
    }

    public AnonymousClass4HS(1Av r5, UserSession userSession) {
        this.A01 = userSession;
        this.A02 = r5;
        this.A00 = r5.A01.getLong("notification_feed_304_cooldown_timestamp", 0);
    }
}
