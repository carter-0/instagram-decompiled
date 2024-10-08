package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.F9g  reason: case insensitive filesystem */
public abstract class C49841F9g {
    public static final 0bY A00 = new C50186FSs(3);

    public static void A00(Activity activity, Fragment fragment, UserSession userSession, User user, String str) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        Activity activity2 = activity;
        Fragment fragment2 = fragment;
        User user2 = user;
        String str2 = str;
        if (user == null || !AnonymousClass430.A01(userSession) || !JYR.A00(userSession) || !user.A1S()) {
            1pE A01 = 1pE.A01(activity, (AnonymousClass0iw) fragment2, userSession, str);
            A01.A0B = new C291175gg(DbW.A0n(user));
            A01.A0q = true;
            A01.A01 = fragment;
            A01.A06();
            return;
        }
        String id = user.getId();
        C46498Dg1 dg1 = new C46498Dg1(activity, userSession2);
        dg1.A04(new FOD(activity2, fragment2, userSession2, user2, str2, 3), 2131959732);
        dg1.A04(new C50105FOv((Object) userSession2, (Object) fragment, id, str2, 4), 2131969193);
        new C49945FFy(dg1).A05(fragment.requireContext());
    }
}
