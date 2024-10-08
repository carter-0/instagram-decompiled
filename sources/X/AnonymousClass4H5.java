package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.4H5  reason: invalid class name */
public final class AnonymousClass4H5 implements AnonymousClass4H6 {
    public final Fragment A00;
    public final UserSession A01;

    public final void D24(String str, String str2) {
        0qQ.A0B(str2, 1);
        UserSession userSession = this.A01;
        C46474Dfc A012 = C46548Dgp.A01(userSession, str, AnonymousClass000.A00(3698), str2);
        C309516Yo r2 = new C309516Yo(this.A00.requireActivity(), userSession);
        r2.A08();
        r2.A0D(C46447Df9.A03().A01.A02(userSession, A012.A04()));
        r2.A04();
    }

    public AnonymousClass4H5(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
