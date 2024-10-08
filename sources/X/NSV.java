package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

public final class NSV extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ MZB A01;
    public final /* synthetic */ MZ9 A02;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSV(UserSession userSession, MZB mzb, MZ9 mz9, MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, String str) {
        super(542353022, 3, false, false);
        this.A03 = msysMailboxSessionManagerImpl;
        this.A02 = mz9;
        this.A01 = mzb;
        this.A00 = userSession;
        this.A04 = str;
    }

    public final void run() {
        MsysMailboxSessionManagerImpl.access$logMemLoginEvent(this.A03, this.A02, this.A01, "Attempting msys mailbox init after MEM login");
        UserSession userSession = this.A00;
        String str = this.A04;
        1aD.A01(userSession, str).A02(str);
    }
}
