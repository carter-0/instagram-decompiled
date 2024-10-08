package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Ood  reason: case insensitive filesystem */
public final class C71658Ood implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NAF A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ PrivacyContext A03;
    public final /* synthetic */ String A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A02, false, 0, 1, (NotificationScope) null, this.A03, "MCAMailboxInstagramPresence", "ReportAppState", C71726Opk.A00(this, 18));
    }

    public C71658Ood(NAF naf, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, String str, int i) {
        this.A01 = naf;
        this.A02 = mailboxFutureImpl;
        this.A03 = privacyContext;
        this.A00 = i;
        this.A04 = str;
    }
}
