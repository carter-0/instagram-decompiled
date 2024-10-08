package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.P1m  reason: case insensitive filesystem */
public final class C72321P1m implements C74388Pu4 {
    public final UserSession A00;
    public final String A01;

    public final void Clj() {
        String str = this.A01;
        if (str != null) {
            0xa r6 = AnonymousClass4k9.A00(this.A00).A00;
            if (r6.getLong(002.A0R("direct_music_sticker_nux_first_seen_timestamp_", str), 0) == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR4 = r6.AR4();
                AR4.E5c(002.A0R("direct_music_sticker_nux_first_seen_timestamp_", str), currentTimeMillis);
                AR4.apply();
            }
        }
    }

    public final boolean Et0() {
        String str = this.A01;
        if (str == null) {
            return false;
        }
        UserSession userSession = this.A00;
        if (!182.A06(0Tu.A05, userSession, 36328478362189172L)) {
            return false;
        }
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
        0qQ.A0B(str, 0);
        long j = A002.A00.getLong(002.A0R("direct_music_sticker_nux_first_seen_timestamp_", str), 0);
        if (j == 0) {
            return true;
        }
        long A07 = C51966G9m.A07(j);
        long A0R = AnonymousClass7TE.A0R(AnonymousClass0yP.A00(36609953338955721L).A00(userSession));
        if (A0R <= 0) {
            A0R = 604800000;
        }
        if (A07 <= A0R) {
            return true;
        }
        return false;
    }

    public C72321P1m(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }
}
