package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

public final class NAY extends MailboxFeature {
    public static AnonymousClass681 A00 = new C68315NAc(2);

    public final void A00(MailboxCallback mailboxCallback, Number number, String str, String str2) {
        AnonymousClass68L A0I = C66581MXm.A0I(this);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, mailboxCallback);
        C66582MXn.A1E(A0I, new C71681Op0(this, A0J, number, str, str2, 0), A0J);
    }
}
