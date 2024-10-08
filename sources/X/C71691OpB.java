package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OpB  reason: case insensitive filesystem */
public final class C71691OpB implements MailboxCallback {
    public final /* synthetic */ NAE A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        NotificationScope EBU = C66580MXl.A0H(mailbox.getAccountSession()).EBU(new C71734Opu(mailboxFutureImpl, 35), "MCATaskCompletionNotification", 1);
        mailboxFutureImpl.setNotification("MCATaskCompletionNotification", EBU);
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, this.A01, false, 0, 1, EBU, (PrivacyContext) null, "MCAMailboxInstagramOpenXmaReceiverFetch", "IgdXMADispatchBatchedReceiverFetchBase", C71726Opk.A00(this, 15));
    }

    public C71691OpB(NAE nae, MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = nae;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A07 = z;
    }
}
