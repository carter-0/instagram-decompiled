package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaPostShare$1;
import com.instagram.user.model.User;

public final class PET implements C74415PuV {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;

    public final void EMg(OH1 oh1) {
        1Xj r9;
        int i;
        String str;
        C247733gp A1T;
        OH1 oh12 = oh1;
        0qQ.A0B(oh12, 0);
        Object obj = oh12.A02;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectMediaShare");
        AnonymousClass9JI r1 = (AnonymousClass9JI) obj;
        1Xj r10 = (1Xj) r1.A00;
        String str2 = r1.A02;
        if (!r10.A5D() || str2 == null || ((r9 = r10.A1f(str2)) == null && (r9 = r10.A1c(0)) == null)) {
            r9 = r10;
        }
        UserSession userSession = this.A01;
        User A2A = r10.A2A(userSession);
        if (A2A != null) {
            ImageUrl Bh3 = A2A.Bh3();
            int A08 = C71148Oe6.A00.A08(userSession, r10);
            if (r10.A5D()) {
                i = 1001;
            } else if (r10.A5p()) {
                i = IgNetworkConsentStorage.MAX_ENTRIES;
            } else if (r10.CeS()) {
                i = 1006;
            } else {
                throw AnonymousClass7TE.A0z("Unknown media type");
            }
            C254783t2 A0c = DbS.A0c(oh12.A00);
            String str3 = oh12.A03;
            String str4 = oh12.A04;
            1a8 r6 = this.A00;
            0qQ.A0B(r6, 12);
            AnonymousClass19S A0r = DbY.A0r(AnonymousClass12T.A00, 47);
            if (A08 == 1 || (A1T = r10.A1T()) == null) {
                str = null;
            } else {
                str = A1T.A0d;
            }
            AnonymousClass7TE.A1Z(new XmaShareSenderHelper$sendXmaPostShare$1(r6, userSession, Bh3, r9, r10, A0c, A2A, "MediaXmaShareSender", str3, str2, str, str4, (AnonymousClass4D7) null, i, A08), A0r);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void EMZ(OGF ogf) {
        throw AnonymousClass7TE.A1B("sendReply for media share not supported");
    }

    public PET(UserSession userSession) {
        this.A01 = userSession;
    }
}
