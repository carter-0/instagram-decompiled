package X;

import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FEL {
    public static final FEL A00 = new Object();

    public static final void A00(GrowthFrictionInterventionDetail growthFrictionInterventionDetail, UserSession userSession, User user, Integer num, String str) {
        String str2;
        0wc A01 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
        C263944Ny A002 = C263944Ny.A00(userSession.A06);
        C263944Ny A003 = C263944Ny.A00(user.getId());
        0Aj A0e = AnonymousClass7TE.A0e(A01, "ig_ro_growth_friction");
        String AYH = growthFrictionInterventionDetail.AYH();
        String str3 = "friction_intervention_type";
        if (!0qQ.A0K(AYH, "Friction") && 0qQ.A0K(AYH, "Disable")) {
            str3 = "disable_intervention_type";
        }
        if (A0e.isSampled()) {
            int intValue = num.intValue();
            if (intValue == 2) {
                str2 = "mention";
            } else if (intValue != 1) {
                str2 = "follow";
            } else {
                str2 = "tag";
            }
            A0e.AAJ("category", str2);
            DbS.A1I(A0e, str);
            String BIY = growthFrictionInterventionDetail.BIY();
            if (BIY == null) {
                BIY = "";
            }
            A0e.AAJ("intervention_name", BIY);
            A0e.AAE(A003, "target_user_ig_id");
            A0e.AAJ("subevent", str3);
            A0e.AAE(A002, "viewer_user_ig_id");
            A0e.Cgf();
        }
    }
}
