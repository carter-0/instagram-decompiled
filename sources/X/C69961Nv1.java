package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;

/* renamed from: X.Nv1  reason: case insensitive filesystem */
public abstract class C69961Nv1 {
    public static final void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, C332257Ug r19, ThemeViewModelDelegate themeViewModelDelegate, C254743sy r21, String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, context2);
        int i3 = i2;
        if (i3 != 6 && i3 != 8) {
            NKI A04 = 1as.A04.A02.A04(userSession2, themeViewModelDelegate, r21, str, i, 0, z, z2, z3);
            0qQ.A0C(A04, C273654mx.A00(3077));
            C331127Pr A0W = DbS.A0W(userSession2);
            A0W.A0T = A04;
            DbS.A1S(A0W, A1U);
            A0W.A1C = false;
            A0W.A0A = 2Yu.A02(context2);
            float f = 0.5f;
            if (182.A06(0Tu.A05, userSession2, 36324222049464204L)) {
                f = 0.75f;
            }
            A0W.A03 = f;
            C332257Ug r2 = r19;
            C331157Pu A00 = C72959PQr.A00(A0W, r2, 8);
            A04.A05 = new C72332P1x(A00);
            A00.A02(fragmentActivity, A04);
            r2.Cyt();
        }
    }
}
