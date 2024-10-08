package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

/* renamed from: X.6p2  reason: invalid class name and case insensitive filesystem */
public abstract class C318486p2 {
    public static final 1OC A00(Context context, 0lg r4, String str) {
        0qQ.A0B(r4, 0);
        1NY r2 = new 1NY(r4, -2);
        r2.A04();
        r2.A0A("users/check_username/");
        r2.A9m(Dbe.A01(), str);
        r2.A9m("_uuid", 0qv.A02.A05(context));
        r2.A9m("is_group_creation", "false");
        r2.A0Q(C47365Dvz.class, F80.class);
        r2.A0R = true;
        return r2.A0M();
    }

    public static final 1OC A01(Context context, 0lg r6, String str, String str2) {
        0qQ.A0B(r6, 0);
        1NY r3 = new 1NY(r6, -2);
        r3.A04();
        r3.A0A("accounts/verify_email_code/");
        r3.A9m(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str2);
        r3.A9m("email", str);
        r3.A9m(Dbe.A02(0, 9, 4), 0qv.A00(context));
        r3.A0Q(C47345Dvf.class, F6M.class);
        r3.A0R = true;
        return r3.A0M();
    }

    public static final 1OC A02(Context context, UserSession userSession, Integer num, String str) {
        String str2;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(context, 3);
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A("accounts/initiate_phone_number_confirmation/");
        r2.A0Q(C47343Dvd.class, F6E.class);
        r2.A9m(Dbe.A02(9, 12, 17), str);
        r2.A9m("phone_id", 0jh.A04.A01(userSession).A02(19f.A2M));
        r2.A9m("guid", 0qv.A02.A05(context));
        if (1 - num.intValue() != 0) {
            str2 = "edit_profile";
        } else {
            str2 = "profile_megaphone";
        }
        r2.A9m("send_source", str2);
        if (SMf.A00(context)) {
            String name = ((0lY) 0lY.A02.getValue()).name();
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            String lowerCase = name.toLowerCase(locale);
            0qQ.A07(lowerCase);
            r2.A9m("android_build_type", lowerCase);
        }
        if (AnonymousClass0BO.A00(userSession).CKD()) {
            r2.A0N = true;
        }
        r2.A0R = true;
        return r2.A0M();
    }

    public static final 1OC A03(Context context, UserSession userSession, Integer num, String str, String str2, List list) {
        String str3;
        0qQ.A0B(userSession, 0);
        1NY r3 = new 1NY(userSession, -2);
        r3.A04();
        r3.A0A("accounts/send_confirm_email/");
        r3.A0Q(Dw4.class, F81.class);
        r3.A9m(Dbe.A02(0, 9, 4), 0qv.A00(context));
        r3.A9m("guid", 0qv.A02.A05(context));
        switch (num.intValue()) {
            case 1:
                str3 = "profile_megaphone";
                break;
            case 2:
                str3 = "edit_profile";
                break;
            case 3:
                str3 = "personal_information";
                break;
            case 4:
                str3 = "profile_qp";
                break;
            case 5:
                str3 = "nux";
                break;
            case 6:
                str3 = "logout_upsell";
                break;
            case 7:
                str3 = "2fa_sms";
                break;
            default:
                str3 = "email_cliff_megaphone";
                break;
        }
        r3.A9m("send_source", str3);
        r3.A0G("email", str);
        r3.A0G("phone_id", str2);
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (Object put : list) {
                jSONArray.put(put);
            }
            r3.A9m("google_tokens", jSONArray.toString());
        }
        if (AnonymousClass0BO.A00(userSession).CKD()) {
            r3.A0N = true;
        }
        r3.A0R = true;
        return r3.A0M();
    }

    public static final 1OC A04(0lg r4, String str) {
        0qQ.A0B(r4, 0);
        1NY r3 = new 1NY(r4, -2);
        r3.A04();
        r3.A0A("accounts/send_sms_code/");
        r3.A9m(Dbe.A02(9, 12, 17), str);
        r3.A0Q(DwW.class, FCC.class);
        r3.A0R = true;
        return r3.A0M();
    }

    public static final 1OC A05(0lg r4, String str, String str2, boolean z) {
        0qQ.A0B(r4, 0);
        1NY r3 = new 1NY(r4, -2);
        r3.A04();
        r3.A0A("accounts/verify_sms_code/");
        r3.A9m(Dbe.A02(9, 12, 17), str);
        r3.A9m(Dbe.A02(39, 17, 53), str2);
        if (z) {
            r3.A9m("has_sms_consent", "true");
        }
        r3.A0Q(DwX.class, FCD.class);
        r3.A0R = true;
        return r3.A0M();
    }

    public static final 1OC A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A("accounts/current_user/");
        r2.A9m("edit", "true");
        r2.A0O((15p) null, DvS.class, F85.class, false);
        return r2.A0M();
    }

    public static final 1OC A07(UserSession userSession, F1D f1d, String str, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(f1d, 1);
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A("accounts/edit_profile/");
        r2.A9m(Dbe.A01(), f1d.A0O);
        r2.A9m(Pxd.A00(215), f1d.A0F);
        r2.A9m(Dbe.A02(9, 12, 17), f1d.A0M);
        r2.A9m("email", f1d.A0D);
        r2.A9m("biography", f1d.A0A);
        r2.A9m(AnonymousClass000.A00(349), f1d.A02.A00);
        r2.A0H(AnonymousClass000.A00(190), f1d.A0b);
        r2.A0H(AnonymousClass000.A00(191), f1d.A0c);
        if (z) {
            r2.A9m("gender", String.valueOf(f1d.A00));
        }
        r2.A0Q(DwB.class, F86.class);
        r2.A9m(Dbe.A02(0, 9, 4), str);
        r2.A0R = true;
        return r2.A0M();
    }

    public static final 1OC A08(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A("multiple_accounts/get_featured_accounts/");
        r2.A9m("target_user_id", str);
        r2.A0O((15p) null, C318496p3.class, C318506p4.class, false);
        return r2.A0M();
    }
}
