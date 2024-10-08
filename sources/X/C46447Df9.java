package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Df9  reason: case insensitive filesystem */
public abstract class C46447Df9 {
    public static C309516Yo A01(FragmentActivity fragmentActivity, 0lg r2) {
        C309516Yo r0 = new C309516Yo(fragmentActivity, r2);
        A03();
        return r0;
    }

    public static final 1a0 A03() {
        1a0 r0 = 1a0.A03;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_instance");
        throw AnonymousClass00P.createAndThrow();
    }

    public static Fragment A00(UserSession userSession, C46474Dfc dfc) {
        return A03().A01.A02(userSession, dfc.A04());
    }

    public static 1a1 A02() {
        return A03().A01;
    }
}
