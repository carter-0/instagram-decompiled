package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.P1n  reason: case insensitive filesystem */
public final class C72322P1n implements C74388Pu4 {
    public final UserSession A00;
    public final AnonymousClass4kA A01;

    public final void Clj() {
        0xa r6 = AnonymousClass4k9.A00(this.A00).A00;
        if (r6.getLong("direct_cutout_sticker_new_badge_first_seen_timestamp", 0) == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR4 = r6.AR4();
            AR4.E5c("direct_cutout_sticker_new_badge_first_seen_timestamp", currentTimeMillis);
            AR4.apply();
        }
    }

    public final boolean Et0() {
        if (!182.A06(0Tu.A05, this.A00, 36325166942401192L) || C51966G9m.A07(DbW.A06(this.A01.A00, "direct_cutout_sticker_new_badge_first_seen_timestamp")) > 604800000) {
            return false;
        }
        return true;
    }

    public C72322P1n(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AnonymousClass4k9.A00(userSession);
    }
}
