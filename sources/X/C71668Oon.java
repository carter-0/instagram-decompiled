package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.Oon  reason: case insensitive filesystem */
public final class C71668Oon implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ C68313NAa A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A00;
        OT5 ot5 = new OT5((String) null, (Number) null);
        C71726Opk A002 = C71726Opk.A00(this, 59);
        AnonymousClass681 r0 = C68313NAa.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, ot5, 0, 1, "MCAMailboxShim", "SHIMThreadsCalculateTransportKey", A002);
    }

    public C71668Oon(MailboxFutureImpl mailboxFutureImpl, C68313NAa nAa, List list, List list2, boolean z) {
        this.A01 = nAa;
        this.A00 = mailboxFutureImpl;
        this.A03 = list;
        this.A02 = list2;
        this.A04 = z;
    }
}
