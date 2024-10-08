package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Oof  reason: case insensitive filesystem */
public final class C71660Oof implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass67N A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ boolean A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateRestrictStatus", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        C71726Opk A002 = C71726Opk.A00(this, 32);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramSecureParticipantsUpdateRestrictStatus", A002);
    }

    public C71660Oof(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, int i, long j, boolean z) {
        this.A02 = r1;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
        this.A04 = z;
    }
}
