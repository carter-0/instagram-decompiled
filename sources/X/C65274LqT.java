package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.LqT  reason: case insensitive filesystem */
public final class C65274LqT implements AnonymousClass7YC {
    public final UserSession A00;

    public C65274LqT(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void CpO(Activity activity, User user, String str, boolean z) {
        Activity activity2 = activity;
        0qQ.A0B(activity, 0);
        User user2 = user;
        if (user != null) {
            UserSession userSession = this.A00;
            String str2 = str;
            boolean z2 = z;
            if (182.A06(0Tu.A05, userSession, 36318230570473486L)) {
                C252733pa r10 = (C252733pa) userSession.A01(HDZ.class, new C73657PhW(userSession, 46));
                L98 l98 = new L98(activity2, this, user2, str2, z2);
                AnonymousClass7TE.A1Z(new C66171MGi(user, l98, r10, (AnonymousClass4D7) null, 37), r10.A01);
                return;
            }
            11Z.A02(new C51533Fvf(activity2, this, user2, str2, z2));
        }
    }
}
