package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

public final class NSH extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C332587Vp A01;
    public final /* synthetic */ String A02;

    public final void run() {
        11Z.A05("This operation can't be run on UI thread.");
        AnonymousClass2Ep A002 = C71129OdS.A00(this.A00, ThreadFetchReason.FETCH_CHANNEL_MESSAGES, 20, this.A02, true);
        C332587Vp r1 = this.A01;
        if (r1 != null && A002 != null) {
            11Z.A02(new C73195PYZ(r1, A002));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSH(UserSession userSession, C332587Vp r5, String str) {
        super(952861280, 3, false, false);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = r5;
    }
}
