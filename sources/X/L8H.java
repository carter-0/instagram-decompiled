package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class L8H {
    public final C63880LAj A00;
    public final C63655L1r A01;
    public final AnonymousClass0eM A02;
    public final C64310LZk A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.Kuq] */
    public L8H(FragmentActivity fragmentActivity, UserSession userSession) {
        C63655L1r l1r = new C63655L1r(userSession);
        this.A01 = l1r;
        this.A00 = new C63880LAj(l1r, new Object(), 1Au.A00(userSession));
        C227862kA A0I = DbS.A0I(MML.A00(fragmentActivity, 5), MML.A00(this, 6), new C20612Wvt(47, (Object) null, fragmentActivity), DbS.A0z(AnonymousClass57X.class));
        this.A02 = A0I;
        C64310LZk lZk = new C64310LZk(fragmentActivity, (AnonymousClass57X) A0I.getValue());
        fragmentActivity.getLifecycle().A09(lZk);
        this.A03 = lZk;
    }
}
