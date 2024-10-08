package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

public final class PSZ implements 1aV {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Capabilities A01;
    public final /* synthetic */ C74449Pv4 A02;
    public final /* synthetic */ C74550Pwj A03;
    public final /* synthetic */ OCX A04;

    public PSZ(UserSession userSession, Capabilities capabilities, C74449Pv4 pv4, C74550Pwj pwj, OCX ocx) {
        this.A00 = userSession;
        this.A01 = capabilities;
        this.A02 = pv4;
        this.A03 = pwj;
        this.A04 = ocx;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        N4P A002;
        N8T n8t = (N8T) obj;
        if (n8t != null && (A002 = n8t.A00()) != null) {
            UserSession userSession = this.A00;
            Capabilities capabilities = this.A01;
            Bundle A0A = DbV.A0A(userSession);
            A0A.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
            NK6 nk6 = new NK6();
            nk6.setArguments(A0A);
            nk6.A01 = this.A02;
            nk6.A02 = A002;
            nk6.A03 = false;
            this.A03.stop();
            OCX ocx = this.A04;
            1Yk r0 = ocx.A01;
            r0.A00.A02(ocx.A00, nk6);
        }
    }
}
