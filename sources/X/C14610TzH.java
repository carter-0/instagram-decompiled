package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TzH  reason: case insensitive filesystem */
public abstract class C14610TzH {
    public static boolean A02(UserSession userSession, Reel reel) {
        if (reel.A1a || A01(userSession, reel)) {
            return true;
        }
        User A0j = DbT.A0j(userSession);
        for (C255773uh r0 : reel.A0O(userSession)) {
            if (A0j.equals(r0.A0i)) {
                return true;
            }
        }
        return false;
    }

    public static void A00(List list, List list2, String str) {
        if (str.isEmpty()) {
            list2.addAll(list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9J5 r3 = (AnonymousClass9J5) it.next();
            User user = (User) r3.A05;
            if ((!TextUtils.isEmpty(user.getUsername()) && 0mp.A0I(user.getUsername(), str, 0)) || (!TextUtils.isEmpty(user.getFullName()) && 0mp.A0H(user.getFullName(), str))) {
                list2.add(r3);
            }
        }
    }

    public static boolean A01(UserSession userSession, Reel reel) {
        for (C255773uh A0g : reel.A0O(userSession)) {
            if (A0g.A0g()) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(UserSession userSession, C255773uh r2) {
        if (!DbT.A0j(userSession).A1M() || r2.A0B() == AnonymousClass3QO.CLOSE_FRIENDS || r2.A0B() == AnonymousClass3QO.OPAL || r2.A0B() == AnonymousClass3QO.CUSTOM) {
            return false;
        }
        return true;
    }
}
