package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.NuxConnectResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class FHA {
    public static 1OC A0D(0lg r5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DbT.A1W(it, jSONArray);
            }
        }
        1NY A0N = DbU.A0N(r5);
        A0N.A0A("accounts/login/");
        A0N.A9m(DcV.A01(), str8);
        Dbb.A1L(A0N, "enc_password", Dba.A0b(r5, str6), str2, str5);
        A0N.A9m("adid", A0H());
        C60820jg r4 = 0jh.A04;
        0jh A01 = r4.A01(r5);
        19f r0 = 19f.A1v;
        DbW.A19(r0, A0N, A01);
        C49243Erm.A00(r0, A0N, r4, r5);
        A0N.A9m("login_attempt_count", Integer.toString(i));
        DbW.A1G(A0N, jSONArray);
        A0N.A0G("sn_result", str4);
        A0N.A0G("sn_nonce", str3);
        A0N.A0G("country_codes", str);
        A0N.A0G("stop_deletion_token", str7);
        return Dbb.A0K(A0N, EM4.class, FCB.class);
    }

    public static 1OC A0E(0lg r4, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DbT.A1W(it, jSONArray);
        }
        1NY A0N = DbU.A0N(r4);
        A0N.A0A("accounts/google_token_users/");
        DbW.A1G(A0N, jSONArray);
        return DbY.A0N(A0N, Dv8.class, F69.class);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.F0H, java.lang.Object] */
    public static F0H A0G(FxcalAccountType fxcalAccountType, String str, String str2) {
        EX1 ex1 = EX1.FIRST_PARTY;
        ? obj = new Object();
        obj.A00 = fxcalAccountType;
        obj.A04 = str;
        obj.A05 = str2;
        obj.A01 = ex1;
        obj.A02 = "Instagram";
        obj.A03 = "active_account";
        return obj;
    }

    public static 1OC A00(Context context, AnonymousClass0aP r4, Boolean bool, Boolean bool2, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        1NY A0N = DbU.A0N(r4);
        DbZ.A0y(context, A0N, DcV.A00(), DbT.A0t(context, A0N, "users/lookup_phone/"));
        A0N.A0H("supports_sms_code", z);
        DbW.A1F(A0N);
        A0N.A0G("query", str);
        A0N.A0G("use_whatsapp", String.valueOf(z2));
        A0N.A0G("client_message", str2);
        A0N.A0E("auth_failed", bool);
        A0N.A0E("is_resend", bool2);
        A0N.A0R(DwY.class, F6H.class);
        if (SMf.A00(context)) {
            A0N.A9m("android_build_type", DbX.A0s((0lY) 0lY.A02.getValue()));
        }
        return DbW.A0K(A0N);
    }

    public static 1OC A01(Context context, AnonymousClass0aP r2, Integer num, String str) {
        String str2;
        1NY A0N = DbU.A0N(r2);
        A0N.A0A("accounts/assisted_account_recovery/");
        DbZ.A0x(context, A0N, "query", str);
        switch (num.intValue()) {
            case 0:
                str2 = "login_help";
                break;
            case 1:
                str2 = "account_access";
                break;
            case 2:
                str2 = "multi_account";
                break;
            case 3:
                str2 = "recovery_upsell";
                break;
            default:
                str2 = "login_upsell";
                break;
        }
        A0N.A9m("source", str2);
        A0N.A0R(DwI.class, F66.class);
        String A00 = new C275714ro().A00("vetted_device_nonces");
        if (A00 != null) {
            A0N.A9m("vetted_device_nonces", A00);
        }
        return DbW.A0K(A0N);
    }

    public static 1OC A02(Context context, AnonymousClass0aP r2, String str) {
        1NY A0N = DbU.A0N(r2);
        A0N.A0A("accounts/send_recovery_flow_email/");
        DbZ.A0x(context, A0N, "query", str);
        DbY.A1J(A0N, "adid", A0H());
        return DbY.A0N(A0N, DwE.class, F6D.class);
    }

    public static 1OC A03(Context context, AnonymousClass0aP r4, String str, String str2, String str3) {
        1NY A0N = DbU.A0N(r4);
        A0N.A0A("accounts/one_tap_app_login/");
        DbZ.A0x(context, A0N, "login_nonce", str);
        DbS.A1P(A0N, str2);
        DbW.A19(19f.A1v, A0N, DbW.A0I(A0N, r4, "adid", A0H()));
        A0N.A0G("device_base_login_session", str3);
        return Dbb.A0K(A0N, EM4.class, FCB.class);
    }

    public static 1OC A04(Context context, AnonymousClass0aP r4, String str, String str2, String str3) {
        1NY A0N = DbU.A0N(r4);
        A0N.A0A("accounts/one_tap_app_login/");
        DbZ.A0x(context, A0N, "login_nonce", str);
        DbS.A1P(A0N, str2);
        DbW.A19(19f.A1v, A0N, DbW.A0I(A0N, r4, "adid", A0H()));
        A0N.A0G("stop_deletion_token", str3);
        return Dbb.A0K(A0N, EM4.class, FCB.class);
    }

    public static 1OC A05(Context context, AnonymousClass0aP r2, String str, String str2, String str3, String str4) {
        1NY A0N = DbU.A0N(r2);
        A0N.A9m(DcV.A00(), DbT.A0t(context, A0N, "accounts/account_recovery_code_verify/"));
        DbY.A1J(A0N, "recover_code", str);
        A0N.A0G("recovery_handle", str2);
        A0N.A9m("recovery_handle_type", str3);
        A0N.A9m("recovery_type", str4);
        return Dbb.A0K(A0N, C47360Dvu.class, F64.class);
    }

    public static 1OC A06(Context context, AnonymousClass0aP r4, String str, String str2, String str3, String str4, String str5, String str6) {
        1NY A0N = DbU.A0N(r4);
        A0N.A0A("accounts/account_recovery_code_login/");
        A0N.A9m("query", str);
        A0N.A9m("recover_code", str2);
        DbZ.A0x(context, A0N, "source", "account_recover_code");
        DbW.A1A(19f.A1v, A0N, DbW.A0I(A0N, r4, "waterfall_id", 1Q0.A01()));
        A0N.A0G("flow_type", str3);
        A0N.A0G("client_message", str4);
        A0N.A0G("auth_start_response", str5);
        A0N.A0G("autoconf_metadata_blob", str6);
        return Dbb.A0K(A0N, EM4.class, FCB.class);
    }

    public static 1OC A07(Context context, 0lg r4, String str, List list) {
        String str2;
        String str3;
        1NY A0N = DbU.A0N(r4);
        A0N.A9m(DcV.A00(), DbT.A0t(context, A0N, "fxcal/get_sso_accounts/"));
        A0N.A0G("surface", str);
        A0N.A9m("include_social_context", "false");
        A0N.A0O(0aS.A00, C47339Dv6.class, F5t.class, false);
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(C48914EmE.A00((F0H) it.next())));
            }
            A0N.A0G("tokens", jSONArray.toString());
        } catch (IOException e) {
            str2 = e.toString();
            str3 = "Fail to fetch IG SSO users";
            0wb.A03(str3, str2);
            return DbW.A0K(A0N);
        } catch (JSONException e2) {
            str2 = e2.toString();
            str3 = "Fail to build JSON object";
            0wb.A03(str3, str2);
            return DbW.A0K(A0N);
        }
        return DbW.A0K(A0N);
    }

    public static 1OC A08(Context context, UserSession userSession, Boolean bool) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("accounts/opt_out_feo2_service/");
        DbS.A1P(A0N, userSession.A06);
        A0N.A0E("retrieve_only", bool);
        DbW.A1F(A0N);
        DbZ.A0x(context, A0N, "source", "account_recover_code");
        DbW.A1A(19f.A1v, A0N, DbT.A0P(userSession));
        return Dbb.A0K(A0N, C47342Dvc.class, F6C.class);
    }

    public static 1OC A09(Context context, UserSession userSession, String str, String str2, String str3, boolean z) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("accounts/register_feo2_service/");
        A0N.A0G("enc_verifier", str);
        DbY.A1J(A0N, "recover_code", str2);
        DbS.A1P(A0N, userSession.A06);
        A0N.A0H("has_feo2_consent", z);
        DbZ.A0x(context, A0N, "source", "account_recover_code");
        A0N.A9m("sms_flow_type", str3);
        return Dbb.A0K(A0N, C47327Duu.class, F6F.class);
    }

    public static 1OC A0A(0lg r4, F0H f0h, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        1NY A0N = DbU.A0N(r4);
        A0N.A0A("fxcal/sso_login/");
        A0N.A0G("pk", str);
        Dbb.A1L(A0N, "adid", A0H(), str2, str3);
        DbY.A1J(A0N, "phone_id", DbT.A0P(r4).A02(19f.A1v));
        A0N.A0G("surface", str4);
        A0N.A0E("require_password_reset", bool);
        A0N.A0G("stop_deletion_token", str5);
        A0N.A0O(0aS.A00, EM5.class, F68.class, false);
        A0N.A0R = true;
        try {
            A0N.A9m("token", C48914EmE.A00(f0h));
        } catch (IOException e) {
            0wb.A03("Fail to fetch SSO token", e.toString());
        }
        return A0N.A0M();
    }

    public static 1OC A0B(0lg r8, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str8;
        1NY A0N = DbU.A0N(r8);
        A0N.A0A("fb/facebook_signup/");
        String str9 = "false";
        String str10 = str9;
        if (z2) {
            str10 = "true";
        }
        A0N.A9m("dryrun", str10);
        A0N.A9m(DcV.A01(), str);
        A0N.A9m("adid", A0H());
        if (z) {
            str8 = "big_blue_token";
        } else {
            str8 = "fb_access_token";
        }
        Dbb.A1L(A0N, str8, str2, str5, str6);
        C60820jg r7 = 0jh.A04;
        0jh A01 = r7.A01(r8);
        19f r6 = 19f.A1v;
        DbW.A19(r6, A0N, A01);
        1YW r5 = 1YW.A00;
        if (r5 != null) {
            DbY.A1J(A0N, "jazoest", r5.A00(r7.A01(r8).A02(r6)));
            A0N.A0H("fb_reg_flag", z4);
            if (z5) {
                str9 = "true";
            }
            A0N.A9m("force_signup_with_fb_after_cp_claiming", str9);
            A0N.A0E("require_password_reset", bool);
            A0N.A0O(0aS.A00, EM5.class, F68.class, false);
            A0N.A0R = true;
            if (z3) {
                A0N.A9m(AnonymousClass000.A00(245), "true");
            }
            if (str3 != null) {
                A0N.A9m("sn_result", str3);
            }
            if (str4 != null) {
                A0N.A9m("sn_nonce", str4);
            }
            String str11 = str7;
            if (str7 != null) {
                A0N.A9m("surface", str11);
            }
            return A0N.A0M();
        }
        throw new RuntimeException("SprinklePlugin instance needs to be set before get");
    }

    public static 1OC A0C(0lg r2, String str, String str2, String str3, String str4, String str5) {
        1NY A0N = DbU.A0N(r2);
        A0N.A0A("fb/nux_fb_connect/");
        A0N.A9m("access_token", str);
        A0N.A9m("ap", str2);
        A0N.A9m("selected_age_account_id", str3);
        A0N.A9m("selected_age_account_type", str4);
        A0N.A0G("linking_entry_point", str5);
        return Dbb.A0K(A0N, NuxConnectResponse.class, C49780F6n.class);
    }

    public static 1OC A0F(UserSession userSession, String str) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("accounts/change_password/");
        A0N.A9m("enc_new_password", Dba.A0b(userSession, str));
        return DbY.A0N(A0N, 1XP.class, 1XY.class);
    }

    public static String A0H() {
        String string = DbV.A0d().getString("google_ad_id", (String) null);
        Pattern pattern = 0mp.A01;
        if (string == null) {
            return "";
        }
        return string;
    }
}
