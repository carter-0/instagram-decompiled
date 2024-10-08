package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.66x  reason: invalid class name and case insensitive filesystem */
public final class C3029866x extends AnonymousClass45Y {
    public final /* synthetic */ MailboxCallback A00;
    public final /* synthetic */ C66794Mcg A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3029866x(MailboxCallback mailboxCallback, C66794Mcg mcg) {
        super("MailboxProvider");
        this.A01 = mcg;
        this.A00 = mailboxCallback;
    }

    public final void run() {
        this.A00.onCompletion(this.A01.A00);
    }
}
