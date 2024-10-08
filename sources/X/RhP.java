package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class RhP {
    public static final void A00(Activity activity, Context context, UserSession userSession, 2EG r17, User user, String str, String str2) {
        UserSession userSession2 = userSession;
        String str3 = str;
        C51972G9s.A1D(userSession2, str3);
        User user2 = user;
        String B4P = user2.A03.B4P();
        Activity activity2 = activity;
        if (B4P == null || !B4P.equals("Eventbrite")) {
            S00 s00 = S00.A00;
            if (s00 == null) {
                s00 = new R8e();
                S00.A00 = s00;
            }
            Intent instantExperiencesIntent = s00.getInstantExperiencesIntent(context, user2.getId(), userSession2, str3, "instagram", r17, user2.A03.B4N());
            if (instantExperiencesIntent != null) {
                0kR.A07(activity, instantExperiencesIntent, 1001);
                return;
            }
            return;
        }
        SUL sul = new SUL(activity2, userSession2, 2EG.A2y, str3, false);
        sul.A0E(user2.getId());
        sul.A0O = 0mp.A06("%s %s %s", new Object[]{"FBExtensions/0.1", "IGInstantExperience/0.1", "(autofill-enabled)"});
        sul.A0S = str2;
        sul.A0A();
    }
}
