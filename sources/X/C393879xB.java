package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.9xB  reason: invalid class name and case insensitive filesystem */
public abstract class C393879xB {
    public static final void A00(Activity activity, Fragment fragment, UserSession userSession, C262934Go r12, String str, boolean z) {
        0qQ.A0B(userSession, 3);
        C331157Pu A00 = C48943Emh.A00(AnonymousClass37D.A00.A01(activity));
        C331127Pr r4 = new C331127Pr(userSession);
        r4.A0X = r12;
        r4.A11 = AnonymousClass7TF.A1V(A00);
        if (fragment instanceof C273494mf) {
            r4.A0T = (C273494mf) fragment;
        }
        if (str != null) {
            r4.A0d = str;
        }
        if (A00 != null) {
            if (str != null) {
                A00.A03.A0T(0);
            }
            if (z) {
                int[] iArr = C331127Pr.A1X;
                r4.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            r4.A03 = 0.7f;
            r4.A04 = 1.0f;
            r4.A0a = true;
            A00.A0F(fragment, r4);
            return;
        }
        r4.A00().A02(activity, fragment);
    }
}
