package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class F5J {
    public static final String A01(Resources resources, List list) {
        0qQ.A0B(list, 0);
        try {
            Object A0O = 00k.A0O(list, 0);
            Object A0O2 = 00k.A0O(list, 1);
            if (A0O == null || A0O2 == null) {
                Object A0J = 00k.A0J(list);
                if (A0J == null) {
                    A0J = AnonymousClass7TF.A0d(resources, 2131962941);
                }
                String string = resources.getString(2131962953, new Object[]{A0J});
                0qQ.A07(string);
                return string;
            }
            String string2 = resources.getString(2131962948, new Object[]{A0O, A0O2});
            0qQ.A07(string2);
            return string2;
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public static final AnonymousClass5Gv A00(Activity activity, View view, UserSession userSession, C226262fy r4, String str) {
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, str);
        A0f.A03(view);
        A0f.A05 = r4;
        A0f.A07(C283255Gu.A0A);
        A0f.A08(C283255Gu.A09);
        return C47898ELs.A00(A0f, userSession, 0);
    }
}
