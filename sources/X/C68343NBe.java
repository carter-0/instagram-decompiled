package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.NBe  reason: case insensitive filesystem */
public final class C68343NBe extends AnonymousClass45Y {
    public final /* synthetic */ MailboxCallback A00;
    public final /* synthetic */ C67357MmZ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68343NBe(MailboxCallback mailboxCallback, C67357MmZ mmZ) {
        super("StandaloneDatabaseHandle.runWithHandle");
        this.A01 = mmZ;
        this.A00 = mailboxCallback;
    }

    public final void run() {
        this.A00.onCompletion(this.A01.A00);
    }
}
