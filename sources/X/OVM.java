package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

public final class OVM {
    public static final C70736OIt A05 = new Object();
    public final C70812OMh A00;
    public final AnonymousClass1aS A01;
    public final AnonymousClass68G A02;
    public final AtomicBoolean A03 = JTQ.A0k();
    public final UserSession A04;

    public final void A00(boolean z, Runnable runnable) {
        C66611MYx mYx = C66612MYy.A00;
        UserSession userSession = this.A04;
        int i = 0;
        if (mYx.A03(userSession, true) || 2Aj.A04(userSession)) {
            runnable.run();
        } else {
            this.A01.accept(C69297Nix.TEAR_DOWN_START);
            if (!z) {
                i = 2;
            }
            this.A00.A01(new C71723Oph(51, (Object) runnable, (Object) this), i);
        }
        0qQ.A07(OWK.A00);
    }

    public OVM(C70812OMh oMh, AnonymousClass1aS r3, UserSession userSession, AnonymousClass68G r5) {
        this.A04 = userSession;
        this.A02 = r5;
        this.A00 = oMh;
        this.A01 = r3;
    }
}
