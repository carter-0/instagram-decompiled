package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class OL4 {
    public final 1Ng A00;
    public final UserSession A01;
    public final 2Dm A02;
    public final String A03;

    public OL4(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass1Nd.A00(userSession);
        this.A02 = 2L2.A00(userSession);
        this.A03 = DbX.A0t(AnonymousClass7TF.A0Q(userSession).BST());
    }

    public final void A00() {
        List A0F = this.A02.A0C.A0F(AnonymousClass43A.A00);
        if (AnonymousClass7TE.A1b(A0F)) {
            long A0P = AnonymousClass7TE.A0P(((2Eu) 00k.A0K(A0F)).BKd());
            MailboxFeature mailboxFeature = new MailboxFeature(C66845Mdd.A00.A00(this.A01));
            AnonymousClass68L A0I = C66581MXm.A0I(mailboxFeature);
            MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
            C66582MXn.A1D(A0I, new C71718Opc(A0P, (Object) mailboxFeature, 6, (Object) A0G), A0G);
            C71722Opg.A01(A0G, this, 37);
        }
    }
}
