package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.66t  reason: invalid class name */
public final class AnonymousClass66t extends MailboxFeature {
    public static AnonymousClass681 A00 = new AnonymousClass66u();

    public final void A00(MailboxCallback mailboxCallback, String str) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        mailboxFutureImpl.Eiu(mailboxCallback);
        if (!ASa.EJd(new C67574Mq8(this, mailboxFutureImpl, str))) {
            mailboxFutureImpl.cancel(false);
        }
    }

    public final void A01(MailboxCallback mailboxCallback, String str, boolean z) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        mailboxFutureImpl.Eiu(mailboxCallback);
        if (!ASa.EJd(new C71648OoT(this, mailboxFutureImpl, str, z))) {
            mailboxFutureImpl.cancel(false);
        }
    }

    public final void A02(String str, boolean z) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        if (!ASa.EJd(new C71647OoS(this, mailboxFutureImpl, str, z))) {
            mailboxFutureImpl.cancel(false);
        }
    }
}
