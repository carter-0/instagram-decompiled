package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eje  reason: case insensitive filesystem */
public abstract class C48755Eje {
    public static final void A00(Activity activity, Context context, UserSession userSession, Integer num, String str) {
        Intent A03;
        String A00;
        0qQ.A0B(activity, 0);
        AnonymousClass7TF.A1C(userSession, 1, str);
        String str2 = userSession.A05;
        Bundle A0B = DbV.A0B(str2, 0);
        DbS.A1A(A0B, str2);
        DbS.A1B(A0B, "professional_account_onboarding_checklist");
        A0B.putBoolean(AnonymousClass000.A00(627), true);
        A0B.putBoolean(AnonymousClass000.A00(628), true);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        int intValue = num.intValue();
        Intent A09 = DbS.A09();
        if (intValue != 5) {
            A09.putExtra("EXTRA_PROFILE_SHARE_WITH_FOA_DISABLED", true);
            A09.putExtra("EXTRA_PROFILE_SHARE_USER_ID", A0Q.getId());
            A09.putExtra("EXTRA_PROFILE_SHARE_PREFILL_MESSAGE", DbY.A0b(context, A0Q, 2131964501));
            A03 = DbT.A0e().A03(context, 268468224);
            A00 = "EXTRA_PROFILE_SHARE_INTENT";
        } else {
            A09.putExtra("StoryHandlerActivity.EXTRA_STORY_SHARE_WITH_TOOL_TIP_ENABLED", true);
            A03 = DbT.A0e().A03(context, 268468224);
            A00 = AnonymousClass000.A00(1032);
        }
        A03.putExtra(A00, A09);
        A0B.putParcelable(AnonymousClass000.A00(647), A03);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0d = str;
        C331157Pu A002 = A0W.A00();
        E6S e6s = new E6S();
        e6s.setArguments(A0B);
        A002.A02(activity, e6s);
    }
}
