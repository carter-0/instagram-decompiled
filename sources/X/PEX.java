package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class PEX implements C74415PuV {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;

    public final void EMg(OH1 oh1) {
        OH1 oh12 = oh1;
        0qQ.A0B(oh1, 0);
        Object obj = oh1.A02;
        0qQ.A0C(obj, C273654mx.A00(3080));
        AnonymousClass7FJ r3 = (AnonymousClass7FJ) obj;
        1Xj r6 = r3.A01;
        if (r6 != null) {
            int i = 1003;
            if (r6.CeS()) {
                i = 1007;
            }
            UserSession userSession = this.A01;
            User A2A = r6.A2A(userSession);
            if (A2A != null) {
                String str = r3.A07;
                if (str == null) {
                    str = A2A.getId();
                }
                ImageUrl Bh3 = A2A.Bh3();
                int A08 = C71148Oe6.A00.A08(userSession, r6);
                AnonymousClass7TE.A1Z(new C73562Pfi(Bh3, this, oh12, r6, A2A, str, (AnonymousClass4D7) null, i, A08), DbY.A0r(AnonymousClass12T.A00, 47));
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void EMZ(OGF ogf) {
        throw AnonymousClass7TE.A1B("sendReply for story share not supported");
    }

    public PEX(UserSession userSession) {
        this.A01 = userSession;
    }
}
