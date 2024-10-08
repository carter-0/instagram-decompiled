package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.6AW  reason: invalid class name */
public final class AnonymousClass6AW extends MailboxFeature {
    public static AnonymousClass681 A00 = new C3029966y();

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, long j, boolean z) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        if (mailboxCallback != null) {
            mailboxFutureImpl.Eiu(mailboxCallback);
        }
        if (!ASa.EJd(new C293525ks(this, mailboxFutureImpl, j, z))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }

    public final MailboxFutureImpl A01(MailboxCallback mailboxCallback, String str, String str2, long j) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        if (mailboxCallback != null) {
            mailboxFutureImpl.Eiu(mailboxCallback);
        }
        if (!ASa.EJd(new AnonymousClass6AX(this, mailboxFutureImpl, str, str2, j))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }
}
