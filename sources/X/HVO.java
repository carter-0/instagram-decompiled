package X;

import com.instagram.common.session.UserSession;

public abstract class HVO {
    public static final void A00(UserSession userSession, 1Xj r5, AnonymousClass4DU r6, boolean z) {
        String str;
        0qQ.A0B(userSession, 1);
        C254523sc A0c = C51967G9n.A0c(userSession, r5, r6, "hide_response");
        C250513lZ A0w = C51966G9m.A0w(r5);
        if (A0w != null) {
            str = A0w.AZ4();
        } else {
            str = null;
        }
        A0c.A4N = str;
        A0c.A5u = r5.getId();
        A0c.A6x = r6.getModuleName();
        A0c.A1C = true;
        A0c.A1c = Boolean.valueOf(z);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_ad_hide_undo");
        0jB A01 = A0c.A01();
        if (A0e.isSampled()) {
            A0e.AAJ("a_pk", String.valueOf(A01.A01(C271774jZ.A0Z)));
            A0e.AAJ("ad_id", C51966G9m.A1C(C271774jZ.A0B, A01));
            A0e.A7p(AnonymousClass000.A00(3442), (Boolean) A01.A01(C271774jZ.A4S));
            C51965G9l.A1I(A0e, C51966G9m.A1C(C271774jZ.A5I, A01));
            C51965G9l.A1L(A0e, C51966G9m.A1C(C271774jZ.A9L, A01));
            C51965G9l.A1G(A0e, C51966G9m.A13(C271774jZ.A0z, A01));
            A0e.Cgf();
        }
    }
}
