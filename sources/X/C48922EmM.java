package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EmM  reason: case insensitive filesystem */
public abstract class C48922EmM {
    public static final void A00(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        String A0t = DbV.A0t();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "fx_igpc_migration_upsell");
        DbS.A1I(A0e, "linking_flow_initiated");
        A0e.AAJ("linking_flow_entry_point", AnonymousClass7TF.A0j(str));
        A0e.A9F("initiator_account_id", 00y.A0n(10, userSession.A06));
        A0e.A9F("initiator_account_type", 1L);
        A0e.A9F(Pxd.A00(275), 00y.A0n(10, str2));
        A0e.AAJ("app_device_id", A0t);
        A0e.AAJ("debug_data", (String) null);
        A0e.Cgf();
    }
}
