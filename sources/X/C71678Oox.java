package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.shim.mca.MailboxShimJNI;

/* renamed from: X.Oox  reason: case insensitive filesystem */
public final class C71678Oox implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C71678Oox(int i, long j, long j2, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A01 = j;
        this.A02 = j2;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                C71726Opk A002 = C71726Opk.A00(this, 54);
                AnonymousClass681 r0 = C68313NAa.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, (MailboxFutureImpl) this.A05, false, 0, 1, (NotificationScope) null, (PrivacyContext) this.A04, "MCAMailboxShim", "SHIMClientHybridThreadUpdateThreadImage", A002);
                return;
            case 1:
                C71726Opk A003 = C71726Opk.A00(this, 57);
                AnonymousClass681 r02 = C68313NAa.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, (MailboxFutureImpl) this.A04, false, 0, 1, "MCAMailboxShim", "SHIMTransportHybridThreadSetTheme", A003);
                return;
            default:
                String A0u = C66580MXl.A0u(C68313NAa.A00, 0);
                NotificationScope EBU = mailbox.getSlimMailbox().getNotificationCenterCallbackManager().EBU(new C71734Opu(this, 40), A0u, 1);
                C66580MXl.A1N(EBU, this.A04, A0u);
                MailboxShimJNI.dispatchVJJOOOOZ(0, this.A01, this.A02, mailbox, this.A05, (Object) null, EBU, true);
                return;
        }
    }
}
