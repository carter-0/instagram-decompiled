package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IhZ  reason: case insensitive filesystem */
public final class C57856IhZ implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C2376138k A01;

    public C57856IhZ(FragmentActivity fragmentActivity, C2376138k r2) {
        this.A01 = r2;
        this.A00 = fragmentActivity;
    }

    public final void run() {
        C2376138k r0 = this.A01;
        r0.A02(true);
        UserSession userSession = r0.A03;
        if (!userSession.A07()) {
            C309516Yo A0M = DbS.A0M(this.A00, userSession);
            A0M.A0D(C55101HcA.A00(userSession, true, false));
            A0M.A04();
        }
    }
}
