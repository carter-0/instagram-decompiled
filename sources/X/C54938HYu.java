package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HYu  reason: case insensitive filesystem */
public abstract class C54938HYu {
    public static final void A00(C286575Wy r7, FragmentActivity fragmentActivity, UserSession userSession, String str, List list, int i) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(userSession, fragmentActivity);
        if (C51967G9n.A1T(r7, -205067999)) {
            0fL.A01(1766305791, "com.instagram.creator.achievements.modules.views.EarnedAchievementsScreen (EarnedAchievementsScreen.kt:25)");
        }
        String str2 = str;
        List list2 = list;
        AnonymousClass6HY.A06(r7, C51969G9p.A0U(), new C74189PqV((Object) list2, (Object) userSession2, (Object) fragmentActivity2, str2, 33));
        if (0fL.A02()) {
            0fL.A00(645619271);
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59144J8a(list2, userSession2, fragmentActivity2, str2, i, 5);
        }
    }
}
