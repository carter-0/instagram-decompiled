package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F9w  reason: case insensitive filesystem */
public final class C49856F9w {
    public final 0wc A00;

    public static final void A00(C49856F9w f9w, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(f9w.A00, "direct_inbox_message_settings");
        if (A0e.isSampled()) {
            DbV.A1G(A0e, str);
        }
    }

    public C49856F9w(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
