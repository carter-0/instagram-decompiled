package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EmN  reason: case insensitive filesystem */
public abstract class C48923EmN {
    public static final void A00(C48151EZt eZt, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        String str = userSession.A06;
        if (str.length() != 0) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "fx_settings_birthday");
            A0e.A8M(eZt, "event");
            A0e.A9F("initiator_account_id", AnonymousClass7TE.A10(str));
            A0e.A7p("is_cds", false);
            A0e.Cgf();
        }
    }
}
