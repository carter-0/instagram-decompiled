package X;

import com.instagram.common.session.UserSession;

public final class FG9 {
    public static final FG9 A00 = new Object();

    public static final void A00(0lg r1, String str, String str2) {
        A01(r1, str, str2, (String) null);
    }

    public static final void A01(0lg r6, String str, String str2, String str3) {
        String str4;
        C48150EZs eZs;
        Long l = null;
        if (r6 instanceof UserSession) {
            str4 = ((UserSession) r6).A06;
        } else {
            str4 = null;
        }
        String A0t = DbV.A0t();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "fxcal_linking_product");
        DbS.A1I(A0e, str);
        try {
            eZs = C48150EZs.valueOf(AnonymousClass7TF.A0k(str2));
        } catch (IllegalArgumentException unused) {
            eZs = C48150EZs.A04;
        }
        A0e.A8M(eZs, "linking_flow_entry_point");
        if (str4 != null) {
            l = AnonymousClass7TE.A10(str4);
        }
        A0e.A9F("initiator_account_id", l);
        A0e.A8M(C46397DeK.INSTAGRAM, "initiator_account_type");
        A0e.AAJ("app_device_id", A0t);
        A0e.AAJ("debug_data", str3);
        A0e.Cgf();
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1N(userSession, str);
        A01(userSession, "generic_error", str, str2);
    }
}
