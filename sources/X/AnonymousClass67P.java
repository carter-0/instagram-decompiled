package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.67P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass67P implements AnonymousClass67Q {
    public final /* synthetic */ AnonymousClass67N A00;
    public final /* synthetic */ MYb A01;

    public /* synthetic */ AnonymousClass67P(AnonymousClass67N r1, MYb mYb) {
        this.A01 = mYb;
        this.A00 = r1;
    }

    public final void Eyr(AnonymousClass67Z r12) {
        MYb mYb = this.A01;
        AnonymousClass67N r10 = this.A00;
        boolean z = mYb.A0H;
        Oo4 oo4 = new Oo4(r12);
        AnonymousClass68L ASa = r10.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        int A002 = C3030067a.A00(mailboxFutureImpl);
        TraceInfo A012 = C3030067a.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "loadTop20TamThreads");
        mailboxFutureImpl.Eiu(oo4);
        if (!ASa.EJd(new C71649OoU(r10, mailboxFutureImpl, A002, z))) {
            mailboxFutureImpl.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A012, "MailboxInstagramSecureMessage", "loadTop20TamThreads");
        }
        PlatformLogger.platformEventLog(5);
    }
}
