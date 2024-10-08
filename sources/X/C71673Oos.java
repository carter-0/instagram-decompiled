package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Oos  reason: case insensitive filesystem */
public final class C71673Oos implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass67N A04;
    public final /* synthetic */ MailboxFutureImpl A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantUpdateAdminStatus", this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A05;
        C71726Opk A002 = C71726Opk.A00(this, 30);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramSecureParticipantUpdateAdminStatus", A002);
    }

    public C71673Oos(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, int i, int i2, long j, long j2) {
        this.A04 = r1;
        this.A01 = i;
        this.A05 = mailboxFutureImpl;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
    }
}
