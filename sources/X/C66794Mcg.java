package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.Execution;

/* renamed from: X.Mcg  reason: case insensitive filesystem */
public final class C66794Mcg extends C66796Mci {
    public final Mailbox A00;

    public final boolean A04(MailboxCallback mailboxCallback) {
        Execution.executePossiblySync(new C68341NBc(mailboxCallback, this), this.A00.getAccountSession(), 1);
        return true;
    }

    public C66794Mcg(Mailbox mailbox) {
        this.A00 = mailbox;
    }

    public final boolean A03(MailboxCallback mailboxCallback) {
        Execution.getExecutionContext();
        Execution.executePossiblySync(new C3029866x(mailboxCallback, this), this.A00.getAccountSession(), 1);
        return true;
    }
}
