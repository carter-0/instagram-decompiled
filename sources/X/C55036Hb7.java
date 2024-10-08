package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hb7  reason: case insensitive filesystem */
public abstract class C55036Hb7 {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        C51972G9s.A1D(str, str2);
        if (z) {
            C48898Ely.A00(userSession, 1ES.A01(), new C57207ISu(fragmentActivity, userSession, str, str2), str2);
            return;
        }
        C310336ap A0a = DbS.A0a();
        DbS.A19(fragmentActivity, A0a, 2131976697);
        Dbb.A1Q(A0a);
    }
}
