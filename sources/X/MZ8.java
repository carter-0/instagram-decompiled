package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

public final class MZ8 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A01;
    public final /* synthetic */ String A02;

    public MZ8(MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, UserSession userSession, String str) {
        this.A01 = msysMailboxSessionManagerImpl;
        this.A00 = userSession;
        this.A02 = str;
    }

    public final void run() {
        MsysMailboxSessionManagerImpl.access$ensureMsysInitialization(this.A01, this.A00, this.A02);
    }
}
