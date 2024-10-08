package X;

import com.facebook.msys.mca.MailboxCallback;
import com.instagram.common.session.UserSession;

/* renamed from: X.67M  reason: invalid class name */
public final class AnonymousClass67M extends 0ng {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 1xN A01;
    public final /* synthetic */ MailboxCallback A02;
    public final /* synthetic */ 1a8 A03;
    public final /* synthetic */ UserSession A04;

    public final void run() {
        Thread.sleep(this.A00);
        this.A03.A01();
        C295625ob r5 = C295615oa.A01;
        UserSession userSession = this.A04;
        r5.A02(new AnonymousClass9MC(38, userSession, this.A02, this.A01), userSession);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass67M(1xN r4, MailboxCallback mailboxCallback, 1a8 r6, UserSession userSession, long j) {
        super(1522582880, 3, false, false);
        this.A00 = j;
        this.A03 = r6;
        this.A04 = userSession;
        this.A02 = mailboxCallback;
        this.A01 = r4;
    }
}
