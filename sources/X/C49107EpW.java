package X;

import android.content.Context;
import com.instagram.registration.model.RegFlowExtras;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EpW  reason: case insensitive filesystem */
public abstract class C49107EpW {
    public static 1OC A00(Context context, AnonymousClass0aP r8, RegFlowExtras regFlowExtras, Integer num, String str, String str2) {
        String str3;
        if (num == AnonymousClass05K.A00) {
            str3 = "accounts/create/";
        } else if (num == AnonymousClass05K.A01) {
            str3 = "accounts/create_validated/";
        } else {
            str3 = "";
        }
        boolean z = true;
        boolean A1R = AnonymousClass7TF.A1R(DbV.A04(r8));
        1NY A0N = DbU.A0N(r8);
        A0N.A03 = null;
        A0N.A0L = true;
        A0N.A02 = null;
        A0N.A0M = true;
        A0N.A0E = str3;
        DbW.A1F(A0N);
        String string = DbV.A0d().getString("google_ad_id", (String) null);
        Pattern pattern = 0mp.A01;
        if (string == null) {
            string = "";
        }
        A0N.A9m("adid", string);
        C60820jg r4 = 0jh.A04;
        0jh A01 = r4.A01(r8);
        19f r3 = 19f.A1Z;
        DbW.A19(r3, A0N, A01);
        A0N.A9m("_uuid", DbT.A0s(context));
        A0N.A0H(AnonymousClass000.A00(1527), A1R);
        if (EXD.SAC == regFlowExtras.A01()) {
            z = false;
        }
        A0N.A0H("do_not_auto_login_if_credentials_match", z);
        A0N.A0G("logged_in_user_id", str);
        A0N.A0G("logged_in_user_authorization_token", str2);
        A0N.A0G("supervised_user_consent_token", regFlowExtras.A0d);
        C49243Erm.A00(r3, A0N, r4, r8);
        A0N.A0O(0aS.A00, DwQ.class, F7K.class, false);
        RegFlowExtras.A00(context, A0N, r8, regFlowExtras, true);
        Dbc.A0l(A0N, regFlowExtras);
        if (!(regFlowExtras.A0T == null || regFlowExtras.A0U == null)) {
            JSONObject A11 = DbS.A11();
            try {
                A11.put("intent", regFlowExtras.A0T);
                A11.put("surface", regFlowExtras.A0U);
                A0N.A9m("secondary_account_intent", A11.toString());
            } catch (JSONException e) {
                0wb.A03("CreateAccountApi", AnonymousClass7TF.A0m("Error adding secondary account creation intent JSON object: ", e));
            }
        }
        return A0N.A0M();
    }
}
