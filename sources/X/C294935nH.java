package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.5nH  reason: invalid class name and case insensitive filesystem */
public final class C294935nH implements MailboxCallback {
    public final /* synthetic */ MailboxCallback A00;
    public final /* synthetic */ C66796Mci A01;

    public C294935nH(MailboxCallback mailboxCallback, C66796Mci mci) {
        this.A01 = mci;
        this.A00 = mailboxCallback;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        this.A00.onCompletion(((Mailbox) obj).getSlimMailbox());
    }
}
