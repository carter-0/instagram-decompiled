package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.Ook  reason: case insensitive filesystem */
public final class C71665Ook implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        MailboxNullable A0K;
        C71726Opk A002;
        String str;
        String str2;
        int i;
        int i2;
        Mailbox mailbox = (Mailbox) obj;
        if (this.A00 != 0) {
            mailboxFutureImpl = (MailboxFutureImpl) this.A03;
            A0K = C66581MXm.A0K();
            A002 = C71726Opk.A00(this, 44);
            str = "MCAMailboxNotificationEngineInstagramIntegrator";
            str2 = "InsertPushPathNotificationData";
            i = 0;
            i2 = 1;
            AnonymousClass681 r0 = NAR.A00;
        } else {
            C3030067a.A04("MailboxInstagramSecureMessage", "loadInstagramSecureThreadKeyFromIgThreadId", this.A01);
            mailboxFutureImpl = (MailboxFutureImpl) this.A03;
            A0K = C66581MXm.A0K();
            A002 = C71726Opk.A00(this, 37);
            str = "MCAMailboxInstagramSecureMessage";
            str2 = "InstagramSecureThreadKeyFromIgThreadId";
            i = 0;
            AnonymousClass681 r02 = AnonymousClass67N.A00;
            i2 = 0;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0K, i, i2, str, str2, A002);
    }

    public C71665Ook(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
        this.A04 = str;
    }
}
