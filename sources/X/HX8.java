package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

public abstract class HX8 {
    public static final void A00(Activity activity, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r19, User user, G87 g87, String str, String str2, JSONObject jSONObject) {
        Activity activity2 = activity;
        0qQ.A0B(activity2, 0);
        C52971GgO ggO2 = ggO;
        UserSession userSession2 = userSession;
        String str3 = str;
        DbZ.A0t(1, ggO2, userSession2, str3);
        User user2 = user;
        G87 g872 = g87;
        JSONObject jSONObject2 = jSONObject;
        C51974G9v.A1N(user2, g872, jSONObject2);
        AnonymousClass4DU r1 = r19;
        0qQ.A0B(r1, 8);
        C57477IbL ibL = new C57477IbL(ggO2, user2, str3, str2);
        C331127Pr A0e = DbX.A0e(userSession2, true);
        A0e.A0x = true;
        A0e.A03 = 0.7f;
        C57385IZq.A00(A0e, ggO2, 0);
        C331157Pu A00 = C48943Emh.A00(DbT.A0i(activity2));
        1YZ r0 = 1YZ.A02;
        if (r0 != null && r0.A00() != null) {
            0wc A01 = AnonymousClass0kN.A01(r1, userSession2);
            String moduleName = r1.getModuleName();
            C48088EVg eVg = C48088EVg.COMMENT_REPORTING;
            0qQ.A0B(moduleName, 3);
            User user3 = user2;
            C331127Pr r16 = A0e;
            C49925FFb.A01(activity2, (C3263576k) null, (C69445Nlp) null, A01, userSession2, A00, r16, user3, g872, eVg, ibL, moduleName, (String) null, jSONObject2, false);
        }
    }
}
