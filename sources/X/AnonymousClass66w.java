package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.66w  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66w implements MailboxCallback {
    public final /* synthetic */ MailboxCallback A00;

    public /* synthetic */ AnonymousClass66w(MailboxCallback mailboxCallback) {
        this.A00 = mailboxCallback;
    }

    public final void onCompletion(Object obj) {
        this.A00.onCompletion(((Mailbox) obj).getAccountSession());
    }
}
