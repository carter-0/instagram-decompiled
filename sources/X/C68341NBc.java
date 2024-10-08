package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.NBc  reason: case insensitive filesystem */
public final class C68341NBc extends AnonymousClass45Y {
    public final /* synthetic */ MailboxCallback A00;
    public final /* synthetic */ C66794Mcg A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68341NBc(MailboxCallback mailboxCallback, C66794Mcg mcg) {
        super("MailboxProvider");
        this.A01 = mcg;
        this.A00 = mailboxCallback;
    }

    public final void run() {
        this.A00.onCompletion(this.A01.A00);
    }
}
