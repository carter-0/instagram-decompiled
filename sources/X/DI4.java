package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

public final class DI4 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ MsysActiveUserSession A01;
    public final /* synthetic */ AnonymousClass2HN A02;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ boolean A05;

    public DI4(UserSession userSession, MsysActiveUserSession msysActiveUserSession, AnonymousClass2HN r3, MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, C62320sa r5, boolean z) {
        this.A01 = msysActiveUserSession;
        this.A04 = r5;
        this.A03 = msysMailboxSessionManagerImpl;
        this.A00 = userSession;
        this.A05 = z;
        this.A02 = r3;
    }

    public final void run() {
        MsysActiveUserSession msysActiveUserSession = this.A01;
        if (!msysActiveUserSession.A05(1aD.class) && !msysActiveUserSession.A05(OVM.class)) {
            this.A04.invoke();
        } else if (msysActiveUserSession.A05(OVM.class)) {
            MsysMailboxSessionManagerImpl.access$teardownMessageSyncService(this.A03, this.A00, this.A05, ((Number) this.A02.A1M.A00()).longValue(), new C45984DHn(this.A04));
        } else {
            MsysMailboxSessionManagerImpl.access$teardownMailbox(this.A03, this.A00, this.A05, ((Number) this.A02.A1M.A00()).longValue(), new C45985DHo(this.A04));
        }
    }
}
