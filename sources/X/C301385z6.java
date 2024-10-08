package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.5z6  reason: invalid class name and case insensitive filesystem */
public final class C301385z6 extends AnonymousClass45Y {
    public final /* synthetic */ C3023762v A00;
    public final /* synthetic */ MailboxCallback A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C301385z6(C3023762v r2, MailboxCallback mailboxCallback) {
        super("AccountSessionMailboxApiHandleMetaProvider.runWithHandle");
        this.A00 = r2;
        this.A01 = mailboxCallback;
    }

    public final void run() {
        this.A01.onCompletion(this.A00.A00.A01);
    }
}
