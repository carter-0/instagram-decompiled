package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;

/* renamed from: X.FlX  reason: case insensitive filesystem */
public final class C50944FlX implements G6O {
    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1T(context, userSession, fragmentActivity);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36312522558538907L) || 182.A06(r2, userSession, 36313514697885747L)) {
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
            A0Q.A0D(new C227812jx());
            A0Q.A04();
        } else if (2R8.A00(userSession)) {
            DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(context, fragmentActivity.getSupportFragmentManager(), fragmentActivity, userSession);
        } else {
            C310336ap A0W = DbV.A0W();
            A0W.A0H = "internal_settings_access_fail";
            A0W.A0D = "Internal Settings are only accessible to employees and test accounts.";
            DbY.A1N(A0W);
        }
    }
}
