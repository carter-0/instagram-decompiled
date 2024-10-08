package X;

import com.instagram.common.session.UserSession;

public abstract class OP4 {
    public static final String A01(UserSession userSession, C70998OVt oVt, 2FW r5, Object obj, C62320sa r7) {
        0qQ.A0B(oVt, 0);
        return A00(userSession, oVt, new O65(true), r5, obj, r7);
    }

    public static final String A00(UserSession userSession, C70998OVt oVt, O65 o65, 2FW r7, Object obj, C62320sa r9) {
        int i;
        C62320sa ay7;
        Object ods;
        C69879Nth nth = C69879Nth.$redex_init_class;
        int ordinal = r7.ordinal();
        if (ordinal == 22 || ordinal == 28) {
            if (obj instanceof 1Xj) {
                i = 33;
            } else if (obj instanceof C39798A9t) {
                ay7 = new C41655Ay7(obj, 24);
                ods = new ODS(obj, ay7);
            } else if (obj instanceof AnonymousClass7FN) {
                i = 34;
            } else if (obj instanceof AnonymousClass7FJ) {
                i = 35;
            } else {
                throw C66582MXn.A0k(obj, "Expected Media, DirectReelMedia, or DirectStoryShareMedia: ", AnonymousClass7TE.A1A());
            }
            ay7 = new C73664Phd(i, userSession, obj);
            ods = new ODS(obj, ay7);
        } else {
            if (ordinal == 32) {
                if (obj instanceof String) {
                    C41655Ay7 ay72 = new C41655Ay7(r9, 23);
                    r7 = 2FW.A19;
                    ods = new OBM((String) obj, ay72);
                } else if (!(obj instanceof C45425Cw5)) {
                    throw C66582MXn.A0k(obj, "Expected String or DirectLiveViewerInvite: ", AnonymousClass7TE.A1A());
                }
            }
            return oVt.A01(r7, obj);
        }
        return oVt.A00(o65, r7, ods);
    }
}
