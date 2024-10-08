package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nue  reason: case insensitive filesystem */
public abstract class C69938Nue {
    public static final void A00(UserSession userSession, Integer num, Integer num2, String str, String str2) {
        String str3;
        String str4;
        DbY.A1S(userSession, num);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "direct_change_nickname");
        if (A0e.isSampled()) {
            switch (num2.intValue()) {
                case 0:
                    str3 = "impression";
                    break;
                case 1:
                    str3 = "tap";
                    break;
                case 2:
                    str3 = "submit";
                    break;
                default:
                    str3 = "exit";
                    break;
            }
            DbS.A1J(A0e, str3);
            if (num.intValue() != 0) {
                str4 = "admin_text";
            } else {
                str4 = "thread_details";
            }
            DbS.A1N(A0e, str4);
            A0e.A9F("target_user_id", DbZ.A0d(str2));
            C66580MXl.A1K(A0e, str);
            A0e.Cgf();
        }
    }
}
