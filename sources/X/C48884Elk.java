package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Elk  reason: case insensitive filesystem */
public abstract class C48884Elk {
    public static final void A00(UserSession userSession, int i) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "mwb_hidden_words_nux_event");
        if (A0e.isSampled()) {
            AnonymousClass7TE.A1W(A0e, "action", i);
            A0e.Cgf();
        }
    }
}
