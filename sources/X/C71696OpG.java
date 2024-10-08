package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.OpG  reason: case insensitive filesystem */
public final class C71696OpG implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ C68314NAb A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxTam", "runTamClientPollUpdate", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        C71726Opk A002 = C71726Opk.A00(this, 61);
        AnonymousClass681 r0 = C68314NAb.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxTam", "TamClientPollUpdate", A002);
    }

    public C71696OpG(MailboxFutureImpl mailboxFutureImpl, C68314NAb nAb, List list, List list2, List list3, int i, long j, long j2) {
        this.A04 = nAb;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = list;
        this.A06 = list2;
        this.A07 = list3;
    }
}
