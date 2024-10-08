package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MessageSyncService;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.util.NotificationScope;

public final class NBV extends AnonymousClass45Y {
    public final /* synthetic */ C70812OMh A00;
    public final /* synthetic */ MailboxCallback A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBV(C70812OMh oMh, MailboxCallback mailboxCallback) {
        super("LazyMessageSyncService.cleanUp");
        this.A00 = oMh;
        this.A01 = mailboxCallback;
    }

    public final void run() {
        NotificationScope notificationScope = new NotificationScope();
        C70812OMh oMh = this.A00;
        SessionedNotificationCenter sessionedNotificationCenter = oMh.A03.A00.A02.getSessionedNotificationCenter();
        sessionedNotificationCenter.addObserver(new C71738Opy(0, this, sessionedNotificationCenter), "MCAMailboxDidShutdownNotification", 1, notificationScope);
        MessageSyncService messageSyncService = oMh.A01;
        messageSyncService.getClass();
        Execution.executePossiblySync(new C68342NBd(messageSyncService, notificationScope), messageSyncService.mAccountSession, 1);
    }
}
