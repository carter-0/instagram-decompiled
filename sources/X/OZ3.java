package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public final class OZ3 {
    public static final OZ3 A00 = new Object();

    public final void A01(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(userSession, 0);
        A00(userSession, "customer_details_page_info_copied", "", 0Yt.A06(AnonymousClass7TH.A0h("has_additional_info", String.valueOf(z4), AnonymousClass7TE.A1L("has_address", String.valueOf(z)), AnonymousClass7TE.A1L("has_phone_number", String.valueOf(z2)), AnonymousClass7TE.A1L("has_email", String.valueOf(z3)))));
    }

    public static final void A00(UserSession userSession, String str, String str2, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(C66580MXl.A0N(new AnonymousClass0kM(userSession), "business_inbox_customer_details"), "direct_customer_details");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A9H("event_data", map);
            A0e.AAe("participant_ids", AnonymousClass7TE.A1I(str2));
            A0e.Cgf();
        }
    }
}
