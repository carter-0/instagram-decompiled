package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class PER implements C74415PuV {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;

    public final void EMg(OH1 oh1) {
        OH1 oh12 = oh1;
        0qQ.A0B(oh12, 0);
        Object obj = oh12.A02;
        0qQ.A0C(obj, AnonymousClass000.A00(38));
        1Xj r5 = (1Xj) obj;
        UserSession userSession = this.A01;
        User A2A = r5.A2A(userSession);
        if (A2A != null) {
            ImageUrl Bh3 = A2A.Bh3();
            C254783t2 A0c = DbS.A0c(oh12.A00);
            String str = oh12.A03;
            int A08 = C71148Oe6.A00.A08(userSession, r5);
            String str2 = oh12.A04;
            1a8 r2 = this.A00;
            0qQ.A0B(r2, 10);
            AnonymousClass7TE.A1Z(new C73559PfO(r2, userSession, Bh3, r5, A0c, A2A, "ClipsXmaShareSender", str, str2, (AnonymousClass4D7) null, 1005, A08, 0), DbY.A0r(AnonymousClass12T.A00, 47));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void EMZ(OGF ogf) {
        throw AnonymousClass7TE.A1B("sendReply for reels share not supported");
    }

    public PER(UserSession userSession) {
        this.A01 = userSession;
    }
}
