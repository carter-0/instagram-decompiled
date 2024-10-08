package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Epu  reason: case insensitive filesystem */
public abstract class C49131Epu {
    public static void A00(AnonymousClass0iw r3, 0lg r4, Integer num, String str, boolean z) {
        String str2;
        String str3;
        r3.getClass();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r4), "enable_sso");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r3);
            A0e.AAJ(AnonymousClass000.A00(3052), str);
            switch (num.intValue()) {
                case 1:
                    str2 = "one_tap_screen";
                    break;
                case 2:
                    str2 = "aymh_screen";
                    break;
                case 3:
                    str2 = "settings";
                    break;
                case 4:
                    str2 = "nux";
                    break;
                case 5:
                    str2 = "logout_dialog";
                    break;
                case 6:
                    str2 = "logout_bottom_sheet";
                    break;
                case 7:
                    str2 = "login_screen";
                    break;
                case 8:
                    str2 = "change_password_upsell";
                    break;
                case 9:
                    str2 = "save_password_registration";
                    break;
                case 10:
                    str2 = "login_upsell";
                    break;
                case 11:
                    str2 = "passwordless_password_creation_unlinking";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str2 = "passwordless_password_creation_setting";
                    break;
                case 13:
                    str2 = "multiple_account_recovery_screen";
                    break;
                default:
                    str2 = "one_tap_login_nonce_callback";
                    break;
            }
            DbS.A1M(A0e, str2);
            if (z) {
                str3 = "YES";
            } else {
                str3 = "NO";
            }
            A0e.AAJ("to_enabled", str3);
            A0e.Cgf();
        }
    }
}
