package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Flt  reason: case insensitive filesystem */
public final class C50966Flt implements C20929X4u {
    public final /* synthetic */ C50302FXh A00;

    public C50966Flt(C50302FXh fXh) {
        this.A00 = fXh;
    }

    public final void CtC(User user) {
        C50302FXh fXh = this.A00;
        C276544tV r7 = fXh.A08;
        C277014uI A0A = r7.A0A(52);
        String str = "";
        if (!fXh.A03() || !DbV.A11(r7, str, 45).equals(AnonymousClass000.A00(3785)) || A0A == null) {
            if (fXh.A03()) {
                0hq r1 = (0hq) fXh.A07.A00(R.id.bloks_ig_fragment_manager);
                if (r1.A0M() > 0) {
                    r1.A13();
                    return;
                } else if (A0A == null) {
                    return;
                }
            } else if ("profile".equals(r7.A0I())) {
                ((Activity) fXh.A09.getValue()).finish();
                return;
            } else {
                UserSession userSession = fXh.A02;
                if (userSession != null) {
                    C309516Yo A0Q = DbU.A0Q((FragmentActivity) fXh.A09.getValue(), userSession);
                    1a1 A02 = C46447Df9.A02();
                    C46474Dfc A022 = C46548Dgp.A02(userSession, user.getUsername(), "shoppable_media_id", DbV.A11(r7, str, 45));
                    String str2 = str;
                    String A0H = r7.A0H();
                    if (A0H != null) {
                        str2 = A0H;
                    }
                    A022.A0G = str2;
                    String A0E = r7.A0E();
                    if (A0E != null) {
                        str = A0E;
                    }
                    A022.A0L = str;
                    C46474Dfc.A03(A0Q, userSession, A02, A022);
                    return;
                }
                return;
            }
        }
        C307886Rw.A03(fXh.A07, r7, AnonymousClass6Tm.A01, A0A);
    }
}
