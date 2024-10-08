package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.62j  reason: invalid class name and case insensitive filesystem */
public final class C3022762j implements AnonymousClass67Q {
    public final /* synthetic */ C3022662i A00;
    public final /* synthetic */ AnonymousClass61J A01;

    public C3022762j(C3022662i r1, AnonymousClass61J r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Eyr(AnonymousClass67Z r7) {
        0qQ.A0B(r7, 0);
        C3022662i r4 = this.A00;
        C3022962l r3 = new C3022962l(r7, this.A01);
        AnonymousClass68L ASa = r4.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        mailboxFutureImpl.Eiu(r3);
        if (!ASa.EJd(new C3023062m(mailboxFutureImpl, r4))) {
            mailboxFutureImpl.cancel(false);
        }
    }
}
