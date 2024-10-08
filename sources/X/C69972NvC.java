package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.NvC  reason: case insensitive filesystem */
public abstract class C69972NvC {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, C62032KWk kWk, String str) {
        C51974G9v.A1O(userSession, fragmentActivity, str, kWk);
        C67730Mtj mtj = new C67730Mtj(userSession, kWk);
        NJR njr = new NJR();
        njr.A05 = mtj;
        C66583MXo.A1G(DbV.A0M(njr, fragmentActivity, userSession), str);
    }
}
