package X;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class OX7 {
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, long j, boolean z) {
        String str;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        02m r2 = 02m.A0p;
        0BQ A0o = C66580MXl.A0o(userSession, r2);
        AnonymousClass65E A00 = AnonymousClass65D.A00(userSession);
        AnonymousClass7TG.A1Q(A0o, A00);
        C66913Mex mex = new C66913Mex(r2, A00, A0o);
        mex.A09();
        mex.A0B("OTC_NOTIFICATION_TAPPED");
        if (z) {
            str = "OTC_NOTIFICATION";
        } else {
            str = "OTC_ACTIVITY_FEED";
        }
        mex.A0D("SOURCE", str);
        C69901Nu3.A00(userSession, AnonymousClass05K.A0j).A06(new C59134J7q(j, fragmentActivity2, userSession2, mex, 2));
    }

    public static final boolean A02(Context context) {
        ActivityManager activityManager;
        String str;
        0qQ.A0B(context, 0);
        Object systemService = context.getSystemService("activity");
        if (!(systemService instanceof ActivityManager) || (activityManager = (ActivityManager) systemService) == null) {
            return false;
        }
        for (ActivityManager.AppTask taskInfo : activityManager.getAppTasks()) {
            List list = O4F.A00;
            ComponentName componentName = taskInfo.getTaskInfo().topActivity;
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            if (00k.A0u(list, str)) {
                return true;
            }
        }
        return false;
    }

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession) {
        C69358Njy njy;
        Integer num;
        C69271NiX niX;
        boolean A01 = AnonymousClass65D.A00(userSession).A01();
        OW5 ow5 = (OW5) userSession.A01(OW5.class, new C67485Mof(userSession, 22));
        if (A01) {
            njy = C69358Njy.OTC_DISPLAY_CODE_INTRO_V2;
            num = AnonymousClass05K.A05;
            niX = C69271NiX.DIALOG;
        } else {
            njy = C69358Njy.OTC_DISPLAY_CODE_INTRO;
            num = AnonymousClass05K.A05;
            niX = C69271NiX.BOTTOM_SHEET;
        }
        OW5.A00(fragmentActivity, njy, niX, ow5, num);
    }
}
