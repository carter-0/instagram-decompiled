package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public abstract class FCI {
    public static 1OC A02(0lg r2, String str, String str2, String str3, boolean z) {
        String str4;
        1NY A0N = DbU.A0N(r2);
        A0N.A0A("fb/show_continue_as/");
        DbU.A1O(A0N, str);
        A0N.A9m("phone_id", str2);
        A0N.A9m("screen", "landing");
        if (z) {
            str4 = "big_blue_token";
        } else {
            str4 = "fb_access_token";
        }
        A0N.A9m(str4, str3);
        return DbY.A0N(A0N, Dw8.class, C49771F6e.class);
    }

    public static 1OC A00(Context context, 0lg r4, String str, String str2, String str3) {
        1NY A0N = DbU.A0N(r4);
        A0N.A0A("accounts/send_signup_sms_code/");
        A0N.A9m(Dbj.A00(), str);
        DbU.A1O(A0N, str2);
        DbY.A1J(A0N, "guid", str3);
        DbW.A19(19f.A1r, A0N, DbT.A0P(r4));
        A0N.A0R(ENM.class, C49772F6f.class);
        if (SMf.A00(context)) {
            A0N.A9m("android_build_type", ((0lY) 0lY.A02.getValue()).name().toLowerCase());
        }
        if (DbV.A04(r4) > 0) {
            A0N.A0N = true;
        }
        return DbW.A0K(A0N);
    }

    public static 1OC A01(Context context, 0lg r5, String str, String str2, String str3, List list) {
        1NY A0N = DbU.A0N(r5);
        DbZ.A0y(context, A0N, Dbj.A01(), DbT.A0t(context, A0N, "accounts/send_verify_email/"));
        A0N.A9m("email", str);
        DbY.A1J(A0N, "auto_confirm_only", "false");
        A0N.A0G("big_blue_token", str2);
        A0N.A0G("phone_id", str3);
        if (!AnonymousClass4KJ.A00(list)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DbT.A1W(it, jSONArray);
            }
            DbW.A1G(A0N, jSONArray);
        }
        if (DbV.A04(r5) > 0) {
            A0N.A0N = true;
        }
        return DbY.A0N(A0N, Dv9.class, C49767F6a.class);
    }
}
