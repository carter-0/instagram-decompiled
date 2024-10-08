package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;

public final class NBT extends AnonymousClass45Y {
    public final /* synthetic */ AnonymousClass68H A00;
    public final /* synthetic */ MailboxCallback A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBT(AnonymousClass68H r2, MailboxCallback mailboxCallback) {
        super("LazyMailbox-runWithMailbox");
        this.A00 = r2;
        this.A01 = mailboxCallback;
    }

    public final void run() {
        Mailbox mailbox = this.A00.A02;
        if (mailbox != null) {
            this.A01.onCompletion(mailbox);
        }
    }
}
