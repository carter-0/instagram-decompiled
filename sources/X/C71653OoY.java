package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.OoY  reason: case insensitive filesystem */
public final class C71653OoY implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ C68313NAa A03;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        C71726Opk A002 = C71726Opk.A00(this, 56);
        AnonymousClass681 r0 = C68313NAa.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxShim", "SHIMTransportHybridMuteCallsForThreadUntil", A002);
    }

    public C71653OoY(MailboxFutureImpl mailboxFutureImpl, C68313NAa nAa, long j, long j2) {
        this.A03 = nAa;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A01 = j2;
    }
}
