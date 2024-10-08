package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

public abstract class F8Z {
    public static void A00(Activity activity, AnonymousClass0iw r13, C307896Rx r14, C277014uI r15, C277014uI r16, UserSession userSession, C331157Pu r18, C331127Pr r19, User user, String str, String str2, JSONObject jSONObject) {
        C331127Pr r5 = r19;
        String moduleName = r13.getModuleName();
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        User user2 = user;
        Activity activity3 = activity2;
        C51050Fng fng = new C51050Fng(activity3, r13, r14, r16, r15, userSession2, user2, str2);
        String username = user2.getUsername();
        if (r19 == null) {
            r5 = DbS.A0W(userSession2);
            DbS.A1S(r5, true);
            r5.A0x = true;
        }
        0qQ.A0B(moduleName, 2);
        1Z5.A00(activity2, (FragmentActivity) null, userSession2, r18, r5, user2, fng, moduleName, str, username, jSONObject);
    }

    public static void A01(Activity activity, AnonymousClass0iw r5, UserSession userSession, C331157Pu r7, User user, String str, String str2, JSONObject jSONObject) {
        A00(activity, r5, (C307896Rx) null, (C277014uI) null, (C277014uI) null, userSession, r7, (C331127Pr) null, user, str, str2, jSONObject);
    }
}
