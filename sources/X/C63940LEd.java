package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LEd  reason: case insensitive filesystem */
public final class C63940LEd {
    public final 0wc A00;

    public final void A00(int i) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "mwb_muted_words_settings_event");
        AnonymousClass7TE.A1W(A0e, "action", 8);
        A0e.A9F("word_list_size", JTT.A0l(A0e, 1L, "word_count", i));
        A0e.Cgf();
    }

    public final void A01(int i, int i2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "mwb_muted_words_settings_event");
        AnonymousClass7TE.A1W(A0e, "action", 5);
        A0e.A9F("word_list_size", JTT.A0l(A0e, DbS.A0j(i), "word_count", i2));
        A0e.Cgf();
    }

    public C63940LEd(AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
