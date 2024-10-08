package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.65d  reason: invalid class name and case insensitive filesystem */
public final class C3027565d implements C61110lV {
    public final /* synthetic */ C3027465c A00;

    public C3027565d(C3027465c r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(80277411);
        C3027465c r1 = this.A00;
        if (r1.A01.isValid()) {
            AnonymousClass65N r5 = r1.A00;
            C56938IIh iIh = new C56938IIh();
            AnonymousClass68L ASa = r5.mMailboxApiHandleMetaProvider.ASa(0);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
            mailboxFutureImpl.Eiu(iIh);
            if (!ASa.EJd(new C22236Xxr(r5, mailboxFutureImpl))) {
                mailboxFutureImpl.cancel(false);
            }
        }
        AnonymousClass0fD.A0A(-1907157192, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1297296280, AnonymousClass0fD.A03(-1483927025));
    }
}
