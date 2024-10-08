package X;

import com.instagram.common.session.UserSession;

public abstract class JZX {
    public static final void A00(JZY jzy, JZZ jzz, AnonymousClass818 r11, C60757Jqo jqo, UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "crosspost_controls");
        Integer num = null;
        if (C367288qV.A01.A0D((BBV) null, userSession, false)) {
            num = AnonymousClass05K.A01;
        } else if (C347167wN.A00.A00(userSession, false)) {
            num = AnonymousClass05K.A00;
        }
        boolean A1Z = Dbb.A1Z(C363388je.A00(userSession), "CrosspostControlsLogger");
        0bb r3 = new 0bb();
        r3.A03("is_account_linked", Boolean.valueOf(A1Z));
        if (num != null && jzz == JZZ.REELS) {
            if (1 - num.intValue() != 0) {
                str = "RECOMMEND";
            } else {
                str = "CROSSPOST";
            }
            r3.A06("cross_app_share_type", str);
        }
        2D6 A00 = 2D5.A00(userSession);
        int ordinal = jzz.ordinal();
        boolean z = false;
        if (ordinal != 2) {
            z = ordinal != 0 ? C363558jv.A00(userSession) : C363018iu.A00(userSession);
        } else if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                z = C367288qV.A06(userSession);
            } else if (intValue == 0) {
                z = A00.A0C();
            }
        }
        r3.A03("is_auto_xpost_enabled", Boolean.valueOf(z));
        if (A0e.isSampled()) {
            DbS.A1F(r11, A0e);
            A0e.A8M(jzy, "event_type");
            A0e.A8M(jzz, "product_type");
            A0e.AAK(r3, "user_info");
            A0e.AAK(jqo, "creation_info");
            A0e.Cgf();
        }
    }
}
