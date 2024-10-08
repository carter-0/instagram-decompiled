package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.6Ai  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C303676Ai implements C295025nR {
    public final /* synthetic */ MailboxFutureImpl A00;

    public /* synthetic */ C303676Ai(MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = mailboxFutureImpl;
    }

    public final boolean Eze() {
        MailboxFutureImpl mailboxFutureImpl = this.A00;
        Thread thread = MailboxFutureImpl.UI_THREAD;
        return mailboxFutureImpl.mSetResult;
    }
}
