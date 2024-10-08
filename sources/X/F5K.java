package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

public abstract class F5K {
    public static final void A01(Context context, UserSession userSession) {
        Intent launchIntentForPackage;
        0qQ.A0B(userSession, 1);
        String str = 0oI.A02;
        if (!0oI.A0I(context.getPackageManager(), "com.oculus.twilight")) {
            0oI.A07(context, "com.oculus.twilight", (String) null);
        } else if (AnonymousClass5FF.A00(context, userSession, "oculus.store://link/media")) {
            FH7.A03(context, "oculus.store://link/media");
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.oculus.twilight")) != null) {
                0kR.A00(context, launchIntentForPackage);
            }
        }
    }

    public static final void A00(Activity activity, UserSession userSession) {
        if (activity != null) {
            E0S e0s = new E0S();
            C331127Pr A0W = DbS.A0W(userSession);
            DbZ.A0z(activity, A0W, 2131956208);
            DbU.A0y(activity, e0s, A0W);
        }
    }
}
