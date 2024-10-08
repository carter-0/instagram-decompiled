package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MessageSyncService;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OMh  reason: case insensitive filesystem */
public final class C70812OMh {
    public MailboxCallback A00 = null;
    public MessageSyncService A01;
    public AtomicBoolean A02 = JTQ.A0k();
    public final AnonymousClass68F A03;

    public final void A00(MailboxCallback mailboxCallback) {
        Execution.initialize(this.A03.A00.A01.A0C, (Executor) null);
        Execution.executeAsync(new NBU(this, mailboxCallback), (AccountSession) null, 1);
    }

    public final void A01(MailboxCallback mailboxCallback, int i) {
        if (this.A01 == null) {
            0KC.A0N("LazyMessageSyncService", "Message sync service is null, no shutdown has occurred for %s", AnonymousClass7TE.A15(C273654mx.A00(1381)), new Object[]{this.A03.A00.A04});
            this.A01 = null;
            this.A00 = null;
            this.A02.set(false);
        } else if (this.A02.get()) {
            Execution.executeAsync(new NBV(this, mailboxCallback), this.A03.A00.A02, 1);
        } else {
            this.A00 = new C67192Mjo(i, 8, this, mailboxCallback);
        }
    }

    public C70812OMh(AnonymousClass68F r2) {
        this.A03 = r2;
    }
}
