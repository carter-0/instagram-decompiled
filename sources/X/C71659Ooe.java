package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Ooe  reason: case insensitive filesystem */
public final class C71659Ooe implements MailboxCallback {
    public final /* synthetic */ NAF A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ PrivacyContext A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, false, 0, 1, (NotificationScope) null, this.A02, "MCAMailboxInstagramPresence", "ReportUserPresenceSetting", C71726Opk.A00(this, 19));
    }

    public C71659Ooe(NAF naf, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, String str, boolean z) {
        this.A00 = naf;
        this.A01 = mailboxFutureImpl;
        this.A02 = privacyContext;
        this.A03 = str;
        this.A04 = z;
    }
}
