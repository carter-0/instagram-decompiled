package X;

import com.instagram.common.session.UserSession;

public abstract class FCE {
    public static final void A00(UserSession userSession, Integer num) {
        String str;
        0qQ.A0B(userSession, 0);
        if (num == AnonymousClass05K.A02 || num == AnonymousClass05K.A03) {
            C49852F9r.A00 = AnonymousClass7TF.A0b();
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C49852F9r.A01, userSession), "instagram_two_fac_setup_action");
        switch (num.intValue()) {
            case 0:
                str = "change_phone_number";
                break;
            case 1:
                str = "copy_key";
                break;
            case 2:
                str = "copy_recovery_code";
                break;
            case 3:
                str = "enter_recovery_code";
                break;
            case 4:
                str = "get_new_recovery_code";
                break;
            case 5:
                str = "link";
                break;
            case 6:
                str = "next";
                break;
            case 7:
                str = "resend_code";
                break;
            case 8:
                str = AnonymousClass000.A00(3929);
                break;
            case 9:
                str = "setup_manually";
                break;
            default:
                str = "turn_on_sms";
                break;
        }
        DbS.A1J(A0e, str);
        A0e.AAJ("view", "");
        Dbc.A0W(A0e);
        A0e.Cgf();
    }

    public static final void A01(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C49852F9r.A01, userSession), "instagram_two_fac_setup_code_resend_failure");
        A0e.AAJ("reason", str);
        A0e.AAJ("view", "enter_code");
        Dbc.A0W(A0e);
        A0e.Cgf();
    }

    public static final void A02(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C49852F9r.A01, userSession), "instagram_two_fac_setup_view");
        Dbc.A0W(A0e);
        A0e.AAJ("view", str);
        A0e.Cgf();
    }
}
