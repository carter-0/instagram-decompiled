package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.OpD  reason: case insensitive filesystem */
public final class C71693OpD implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass67N A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", "runInstagramReactionSetOptimistic", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        Boolean A0u = AnonymousClass7TE.A0u();
        C71726Opk A002 = C71726Opk.A00(this, 25);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0u, IgNetworkConsentStorage.MAX_ENTRIES, 1, "MCAMailboxInstagramSecureMessage", "InstagramReactionSetOptimistic", A002);
    }

    public C71693OpD(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, int i, int i2, long j) {
        this.A03 = r1;
        this.A00 = i;
        this.A04 = mailboxFutureImpl;
        this.A01 = i2;
        this.A02 = j;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = number;
    }
}
