package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LIm  reason: case insensitive filesystem */
public abstract class C64006LIm {
    public static final C331157Pu A00(FragmentActivity fragmentActivity, UserSession userSession) {
        C331127Pr A0W = DbS.A0W(userSession);
        DbZ.A0z(fragmentActivity, A0W, 2131952127);
        A0W.A0k = true;
        A0W.A1G = false;
        DbS.A1S(A0W, true);
        A0W.A08 = AnonymousClass7TF.A02(DbT.A05(fragmentActivity), R.dimen.achievements_list_container_height);
        A0W.A1E = true;
        return A0W.A00();
    }

    public static final C331127Pr A01(FragmentActivity fragmentActivity, UserSession userSession) {
        int[] iArr;
        C331127Pr A0W = DbS.A0W(userSession);
        if (0mk.A02(fragmentActivity.getApplicationContext())) {
            iArr = C331127Pr.A1W;
        } else {
            iArr = C331127Pr.A1X;
        }
        A0W.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
        return A0W;
    }
}
