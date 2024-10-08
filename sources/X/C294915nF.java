package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.5nF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C294915nF implements Runnable {
    public final /* synthetic */ MailboxCallback A00;
    public final /* synthetic */ C295025nR A01;
    public final /* synthetic */ Object A02;

    public /* synthetic */ C294915nF(MailboxCallback mailboxCallback, C295025nR r2, Object obj) {
        this.A01 = r2;
        this.A00 = mailboxCallback;
        this.A02 = obj;
    }

    public final void run() {
        C295025nR r0 = this.A01;
        MailboxCallback mailboxCallback = this.A00;
        Object obj = this.A02;
        if (!r0.Eze()) {
            mailboxCallback.onCompletion(obj);
        }
    }
}
