package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaProfileShare$1;
import com.instagram.user.model.User;

public final class PEU implements C74415PuV {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;

    public final void EMg(OH1 oh1) {
        0qQ.A0B(oh1, 0);
        Object obj = oh1.A02;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.User");
        User user = (User) obj;
        ImageUrl Bh3 = user.Bh3();
        String str = oh1.A04;
        UserSession userSession = this.A01;
        C254783t2 A0c = DbS.A0c(oh1.A00);
        1a8 r3 = this.A00;
        0qQ.A0B(r3, 5);
        AnonymousClass7TE.A1Z(new XmaShareSenderHelper$sendXmaProfileShare$1(r3, userSession, Bh3, A0c, user, "ProfileXmaShareSender", str, (AnonymousClass4D7) null), 19E.A02(AnonymousClass12T.A00.AOJ(47, 3)));
    }

    public final void EMZ(OGF ogf) {
        throw AnonymousClass7TE.A1B("sendReply for profile share not supported");
    }

    public PEU(UserSession userSession) {
        this.A01 = userSession;
    }
}
