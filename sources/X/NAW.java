package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Map;

public final class NAW extends MailboxFeature {
    public static AnonymousClass681 A00 = new C68315NAc(0);

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, Map map) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl A0J = C66581MXm.A0J(ASa, mailboxCallback);
        C66582MXn.A1D(ASa, new C71651OoW(2, A0J, map, this), A0J);
        return A0J;
    }
}
