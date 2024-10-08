package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ejg  reason: case insensitive filesystem */
public abstract class C48757Ejg {
    public static final void A00(1P0 r3, UserSession userSession, AnonymousClass4D6 r5, String str) {
        1NY A0L = DbZ.A0L(userSession);
        A0L.A0A("accounts/update_profile_action_button/");
        DbV.A1N(A0L, DwN.class, F5A.class);
        A0L.A9m("smb_partner_type", str);
        DbW.A1E(A0L, r3, r5);
    }
}
