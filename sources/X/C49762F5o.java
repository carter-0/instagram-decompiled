package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.F5o  reason: case insensitive filesystem */
public abstract class C49762F5o {
    public static final void A00(UserSession userSession, Integer num, Integer num2, Integer num3) {
        String str;
        String str2;
        String str3;
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "direct_hidden_words_adoption_click");
        if (A0e.isSampled()) {
            C268194cw r2 = new C268194cw(C269474fB.A00);
            switch (num2.intValue()) {
                case 1:
                    str = "bottomsheet";
                    break;
                case 2:
                    str = "toast";
                    break;
                case 3:
                    str = "ack_toast";
                    break;
                default:
                    str = "nux";
                    break;
            }
            r2.A0E("upsell_type", str);
            switch (num.intValue()) {
                case 0:
                    str2 = "help";
                    break;
                case 1:
                    str2 = "turn_on";
                    break;
                case 2:
                    str2 = "dismiss";
                    break;
                default:
                    str2 = "see_how";
                    break;
            }
            DbS.A1J(A0e, str2);
            if (num3 == null) {
                str3 = null;
            } else if (1 - num3.intValue() != 0) {
                str3 = "hw_upsell_on_request_folder";
            } else {
                str3 = "spam-re-consent";
            }
            DbS.A1L(A0e, str3);
            A0e.AAJ("extra_client_data", r2.toString());
            A0e.Cgf();
        }
    }

    public static final void A01(UserSession userSession, Integer num, Integer num2, String str) {
        String str2;
        String str3;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "direct_hidden_words_adoption_impression");
        if (A0e.isSampled()) {
            switch (num.intValue()) {
                case 1:
                    str2 = "bottomsheet";
                    break;
                case 2:
                    str2 = "toast";
                    break;
                case 3:
                    str2 = "ack_toast";
                    break;
                default:
                    str2 = "nux";
                    break;
            }
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
            if (num2 == null) {
                str3 = null;
            } else if (1 - num2.intValue() != 0) {
                str3 = "hw_upsell_on_request_folder";
            } else {
                str3 = "spam-re-consent";
            }
            DbS.A1L(A0e, str3);
            A0e.AAJ("extra_client_data", str);
            A0e.Cgf();
        }
    }
}
