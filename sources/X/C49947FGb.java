package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FGb  reason: case insensitive filesystem */
public abstract class C49947FGb {
    public static final void A02(C48145EZn eZn, C48142EZk eZk, UserSession userSession, String str, boolean z) {
        0qQ.A0B(eZn, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "invite_succeeded");
        if (A0e.isSampled()) {
            DbX.A1K(eZn, A0e, DbY.A0a());
            A0e.A8M(eZk, "invite_option");
            A0e.AAJ("url", str);
            A00(A0e, z);
        }
    }

    public static void A00(0Aj r2, boolean z) {
        r2.A7p("is_contact_synced", Boolean.valueOf(z));
        r2.Cgf();
    }

    public static final void A01(C48145EZn eZn, C48142EZk eZk, UserSession userSession) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "invitation_failed");
        if (A0e.isSampled()) {
            DbX.A1K(eZn, A0e, DbY.A0a());
            A0e.A8M(eZk, "invite_option");
            A0e.Cgf();
        }
    }

    public static final void A03(C48145EZn eZn, C48142EZk eZk, UserSession userSession, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "invite_option_tapped");
        if (A0e.isSampled()) {
            DbX.A1K(eZn, A0e, DbY.A0a());
            A0e.A8M(eZk, "invite_option");
            A00(A0e, z);
        }
    }

    public static final void A04(C48145EZn eZn, UserSession userSession, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "invite_upsell_dismissed");
        if (A0e.isSampled()) {
            DbX.A1K(eZn, A0e, DbY.A0a());
            A00(A0e, z);
        }
    }

    public static final void A05(C48145EZn eZn, UserSession userSession, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "invite_upsell_impression");
        if (A0e.isSampled()) {
            DbX.A1K(eZn, A0e, DbY.A0a());
            A00(A0e, z);
        }
    }

    public static final void A06(C48145EZn eZn, UserSession userSession, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "invite_upsell_tapped");
        if (A0e.isSampled()) {
            DbX.A1K(eZn, A0e, DbY.A0a());
            A00(A0e, z);
        }
    }
}
