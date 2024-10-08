package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Oor  reason: case insensitive filesystem */
public final class C71672Oor implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass67N A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", "runInstagramEditMessageClientSend", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        C71726Opk A002 = C71726Opk.A00(this, 28);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramEditMessageClientSend", A002);
    }

    public C71672Oor(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, String str, int i, long j, long j2) {
        this.A03 = r1;
        this.A00 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = str;
    }
}
