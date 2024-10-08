package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

public final class DI5 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ MsysActiveUserSession A01;
    public final /* synthetic */ AnonymousClass2HN A02;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ boolean A05;

    public DI5(UserSession userSession, MsysActiveUserSession msysActiveUserSession, AnonymousClass2HN r3, MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, C62320sa r5, boolean z) {
        this.A03 = msysMailboxSessionManagerImpl;
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = msysActiveUserSession;
        this.A04 = r5;
        this.A05 = z;
    }

    public final void run() {
        MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl = this.A03;
        UserSession userSession = this.A00;
        AnonymousClass2HN r5 = this.A02;
        MsysMailboxSessionManagerImpl.access$teardownMessageProcessor(msysMailboxSessionManagerImpl, userSession, ((Number) r5.A1N.A00()).longValue(), new DI4(userSession, this.A01, r5, msysMailboxSessionManagerImpl, this.A04, this.A05));
    }
}
