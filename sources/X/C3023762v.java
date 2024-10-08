package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.62v  reason: invalid class name and case insensitive filesystem */
public final class C3023762v implements AnonymousClass68L {
    public final /* synthetic */ C3023662u A00;

    public C3023762v(C3023662u r1) {
        this.A00 = r1;
    }

    public final void AGQ(NotificationScope notificationScope, String str) {
        Execution.executeAsync(new C68352NBo(this, notificationScope, str), this.A00.A01, 1);
    }

    public final boolean EJd(MailboxCallback mailboxCallback) {
        int executionContext = Execution.getExecutionContext();
        if (executionContext == 0) {
            executionContext = this.A00.A00;
        }
        Execution.executePossiblySync(new C301385z6(this, mailboxCallback), this.A00.A01, executionContext);
        return true;
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
