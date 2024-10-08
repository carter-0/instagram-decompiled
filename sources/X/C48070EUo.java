package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EUo  reason: case insensitive filesystem */
public enum C48070EUo {
    ;

    public final void A00(Context context, AnonymousClass07i r7, 1P0 r8, 0lg r9, String str, String str2, String str3, List list, Map map, Set set, boolean z) {
        boolean z2 = this instanceof ENS;
        1NY A0N = DbU.A0N(r9);
        if (z2) {
            A0N.A0A("users/check_email/");
            A0N.A9m("email", str);
            A0N.A9m("qe_id", DbV.A0t());
            DbY.A1J(A0N, "android_device_id", str2);
            A0N.A0R(DwH.class, F6Z.class);
            if (set != null) {
                A0N.A9m("login_nonces", new JSONArray(set).toString());
                JSONObject A11 = DbS.A11();
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    A11.put(DbT.A13(A1J), A1J.getValue());
                }
                A0N.A9m("login_nonce_map", A11.toString());
                if (z) {
                    A0N.A9m("prefill_shown", "False");
                    if (list != null && !list.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            DbT.A1W(it, jSONArray);
                        }
                        DbW.A1G(A0N, jSONArray);
                    }
                    if (str3 != null) {
                        A0N.A9m("big_blue_token", str3);
                    }
                    DbW.A19(19f.A1r, A0N, DbT.A0P(r9));
                }
            }
            1OC A0K = DbW.A0K(A0N);
            A0K.A00 = r8;
            1ES.A00(context, r7, A0K);
            return;
        }
        DbU.A1O(A0N, str2);
        A0N.A9m("guid", DbV.A0t());
        A0N.A0A("accounts/check_phone_number/");
        DbW.A19(19f.A1r, A0N, DbW.A0I(A0N, r9, Dbj.A00(), str));
        A0N.A0R(DvA.class, C49769F6c.class);
        if (set != null) {
            A0N.A9m("login_nonces", new JSONArray(set).toString());
        }
        JSONObject A112 = DbS.A11();
        Iterator A0u2 = AnonymousClass7TF.A0u(map);
        while (A0u2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
            A112.put(DbT.A13(A1J2), A1J2.getValue());
        }
        A0N.A9m("login_nonce_map", A112.toString());
        if (z) {
            A0N.A9m("prefill_shown", "False");
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    DbT.A1W(it2, jSONArray2);
                }
                DbW.A1G(A0N, jSONArray2);
            }
            if (str3 != null) {
                A0N.A9m("big_blue_token", str3);
            }
        }
        1OC A0K2 = DbW.A0K(A0N);
        A0K2.A00 = r8;
        1ES.A00(context, r7, A0K2);
    }
}
