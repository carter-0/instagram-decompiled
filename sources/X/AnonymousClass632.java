package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.632  reason: invalid class name */
public final class AnonymousClass632 extends MailboxFeature {
    public static AnonymousClass681 A00 = new AnonymousClass633();

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, String str, int i, long j, long j2, boolean z, boolean z2) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        mailboxFutureImpl.Eiu(mailboxCallback);
        if (!ASa.EJd(new C22239Xxu(this, mailboxFutureImpl, str, i, j, j2, z, z2))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }
}
