package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Ct  reason: invalid class name and case insensitive filesystem */
public abstract class C327927Ct {
    public static final void A00(Activity activity, View view, UserSession userSession, String str, List list, C62320sa r10) {
        Activity activity2 = activity;
        0qQ.A0B(activity, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        if (view != null && 2R8.A00(userSession)) {
            view.setOnLongClickListener(new IDH(activity2, userSession2, str, list, r10));
        }
    }

    public static final void A01(Activity activity, UserSession userSession, String str, String str2, List list, C62320sa r11) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r11, 5);
        if (2R8.A00(userSession)) {
            Fragment fragment = null;
            try {
                Object newInstance = Class.forName("com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof Fragment) {
                    fragment = (Fragment) newInstance;
                    if (fragment != null) {
                        fragment.setArguments(Q21.A00(new 0eP("launcher_rig_parameter_names", new ArrayList(list)), new 0eP("is_in_launcher_rig_mode", true)));
                        if (!list.isEmpty()) {
                            C331127Pr r1 = new C331127Pr(userSession);
                            r1.A0d = str;
                            r1.A1G = true;
                            r1.A0c = str2;
                            r1.A1P = true;
                            r1.A0U = new C72945PQd(r11);
                            r1.A04 = 0.8f;
                            r1.A00().A02(activity, fragment);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
