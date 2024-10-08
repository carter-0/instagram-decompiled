package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.Op3  reason: case insensitive filesystem */
public final class C71684Op3 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ AnonymousClass67N A05;
    public final /* synthetic */ MailboxFutureImpl A06;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", "loadInstagramSecureMessageAttachmentList", this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A06;
        MailboxNullable A0K = C66581MXm.A0K();
        C71726Opk A002 = C71726Opk.A00(this, 23);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0K, 0, 0, "MCAMailboxInstagramSecureMessage", "InstagramSecureMessageAttachmentList", A002);
    }

    public C71684Op3(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, int i, int i2, int i3, long j, long j2) {
        this.A05 = r1;
        this.A01 = i;
        this.A06 = mailboxFutureImpl;
        this.A02 = i2;
        this.A00 = i3;
        this.A04 = j;
        this.A03 = j2;
    }
}
