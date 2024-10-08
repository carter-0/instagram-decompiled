package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.NAd  reason: case insensitive filesystem */
public final class C68316NAd extends C66796Mci {
    public final /* synthetic */ Mailbox A00;

    public C68316NAd(Mailbox mailbox) {
        this.A00 = mailbox;
    }

    public final boolean A03(MailboxCallback mailboxCallback) {
        mailboxCallback.onCompletion(this.A00);
        return true;
    }

    public final boolean A04(MailboxCallback mailboxCallback) {
        mailboxCallback.onCompletion(this.A00);
        return true;
    }
}
