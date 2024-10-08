package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.KrL  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63092KrL {
    public static void A00(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C51974G9v.A1P(user, userSession, fragmentActivity, str);
        String id = user.getId();
        0qQ.A0B(userSession, 1);
        C46474Dfc.A03(DbU.A0Q(fragmentActivity, userSession), userSession, C46447Df9.A02(), C46548Dgp.A01(userSession, id, "user_list", str));
    }
}
