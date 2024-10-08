package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eqe  reason: case insensitive filesystem */
public abstract class C49173Eqe {
    public static final void A00(UserSession userSession, User user, String str) {
        0wc A01 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
        C263944Ny A00 = C263944Ny.A00(userSession.A06);
        C263944Ny A002 = C263944Ny.A00(user.getId());
        0Aj A0e = AnonymousClass7TE.A0e(A01, "ig_ro_growth_friction");
        if (A0e.isSampled()) {
            A0e.AAJ("category", "follow");
            DbS.A1I(A0e, str);
            A0e.AAJ("intervention_name", "Follow Friction");
            A0e.AAE(A002, "target_user_ig_id");
            A0e.AAJ("subevent", "friction_intervention_type");
            A0e.AAE(A00, "viewer_user_ig_id");
            A0e.Cgf();
        }
    }
}
