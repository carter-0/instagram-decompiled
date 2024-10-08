package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.MmZ  reason: case insensitive filesystem */
public final class C67357MmZ implements AnonymousClass68L {
    public final /* synthetic */ StandaloneDatabaseHandle A00;
    public final /* synthetic */ C71619Onz A01;

    public C67357MmZ(StandaloneDatabaseHandle standaloneDatabaseHandle, C71619Onz onz) {
        this.A01 = onz;
        this.A00 = standaloneDatabaseHandle;
    }

    public final void AGQ(NotificationScope notificationScope, String str) {
        Execution.executeAsync(new C68353NBp(this, notificationScope, str), (AccountSession) null, 1);
    }

    public final boolean EJd(MailboxCallback mailboxCallback) {
        int executionContext = Execution.getExecutionContext();
        if (executionContext == 0) {
            executionContext = 1;
        }
        Execution.executePossiblySync(new C68343NBe(mailboxCallback, this), (AccountSession) null, executionContext);
        return true;
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
