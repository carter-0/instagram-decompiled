package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.OoU  reason: case insensitive filesystem */
public final class C71649OoU implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass67N A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ boolean A03;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", C273654mx.A00(2992), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        MailboxNullable A0K = C66581MXm.A0K();
        C71726Opk A002 = C71726Opk.A00(this, 40);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0K, 0, 0, "MCAMailboxInstagramSecureMessage", "Top20TamThreads", A002);
    }

    public C71649OoU(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A03 = z;
    }
}
