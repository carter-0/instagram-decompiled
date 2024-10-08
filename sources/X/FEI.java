package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FEI {
    public static final FEI A00 = new Object();

    public static final void A00(AnonymousClass0iw r2, UserSession userSession, User user, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "instagram_smb_partner_flow_consumer");
        String str3 = userSession.A06;
        A0e.A9F("igid", Long.valueOf(DbZ.A07(str3)));
        Dba.A1B(A0e, "step", str2);
        A0e.AAJ(Dd6.A01(), AnonymousClass7TG.A0j());
        A0e.A7p("is_profile_owner", Boolean.valueOf(0qQ.A0K(user.getId(), str3)));
        A0e.A9F("profile_owner_id", Long.valueOf(DbZ.A07(user.getId())));
        DbU.A1N(A0e, AnonymousClass000.A00(5283), C317876nz.A1Y.A0Z, str);
        A0e.Cgf();
    }
}
