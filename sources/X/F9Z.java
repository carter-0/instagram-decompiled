package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public abstract class F9Z {
    public static final AnonymousClass4D6 A00 = 1ES.A01();

    public static void A00(UserSession userSession, C270374gd r4, Integer num, Integer num2) {
        String str;
        String str2;
        AnonymousClass4D6 r2 = A00;
        Integer num3 = r4.A06;
        if (num3 != AnonymousClass05K.A0j) {
            switch (num3.intValue()) {
                case 1:
                    str = "fb_connect_upsell";
                    break;
                case 2:
                    str = "vk_connect_upsell";
                    break;
                case 3:
                    str = "ci_connect_upsell";
                    break;
                case 4:
                    str = "rux";
                    break;
                case 5:
                    str = "generic_megaphone";
                    break;
                case 6:
                    str = AnonymousClass000.A00(2915);
                    break;
                case 7:
                    str = "confirm_phone";
                    break;
                default:
                    str = "follow_destination";
                    break;
            }
        } else {
            str = ((C15966Uli) r4.A00).A0F;
        }
        String str3 = r4.A00.A00;
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("megaphone/log/");
        A0N.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A0N.A9m("action", C48986EnO.A00(num));
        A0N.A0R(1XP.class, 1XY.class);
        switch (num2.intValue()) {
            case 3:
                str2 = "main_feed";
                break;
            case 4:
                str2 = "news_feed";
                break;
            case 5:
                str2 = "profile_page";
                break;
            case 6:
                str2 = "recap_page";
                break;
            default:
                str2 = "bc_policy_violation";
                break;
        }
        A0N.A9m("display_medium", str2);
        if (str3 != null) {
            A0N.A9m("uuid", str3);
        }
        r2.schedule(A0N.A0M());
    }
}
