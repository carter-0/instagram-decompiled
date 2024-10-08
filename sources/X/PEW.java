package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryReply$1;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

public final class PEW implements C74415PuV {
    public final UserSession A00;
    public final 1a8 A01 = C66581MXm.A0P();

    public final void EMZ(OGF ogf) {
        int i;
        OGF ogf2 = ogf;
        0qQ.A0B(ogf2, 0);
        Object obj = ogf2.A02;
        0qQ.A0C(obj, C273654mx.A00(C11152SCh.MAX_FACTORIAL));
        AnonymousClass7FN r6 = (AnonymousClass7FN) obj;
        1Xj r9 = r6.A02;
        if (r9 != null) {
            UserSession userSession = this.A00;
            User A2A = r9.A2A(userSession);
            if (A2A != null) {
                int A002 = C71148Oe6.A00(r9.BQf());
                C381429bk r1 = ogf2.A00;
                String str = r1.A0H;
                AnonymousClass7Q3 r4 = r6.A01;
                AnonymousClass7Q3 r5 = AnonymousClass7Q3.EMOJI_REACTION;
                if ((r4 == r5 || r4 == AnonymousClass7Q3.AVATAR_REACTION) && r9.A0C.B2n() == null) {
                    i = 1016;
                } else {
                    AnonymousClass7Q3 r42 = r6.A01;
                    if (r42 == r5 || r42 == AnonymousClass7Q3.AVATAR_REACTION) {
                        i = 1008;
                    } else {
                        i = 1002;
                        if (r9.A0C.B2n() == null) {
                            i = 1015;
                        }
                    }
                }
                C254783t2 A0c = DbS.A0c(r1.A01);
                Object obj2 = ogf2.A03;
                DbS.A1Y(obj2);
                String str2 = (String) obj2;
                String str3 = r1.A07;
                ExtendedImageUrl extendedImageUrl = r1.A03;
                Long l = r1.A06;
                if (l != null) {
                    long longValue = l.longValue();
                    String str4 = ogf2.A04;
                    1a8 r62 = this.A01;
                    C72647PEa pEa = new C72647PEa(this, r1);
                    AnonymousClass7TF.A1F(str2, 2, str);
                    0qQ.A0B(r62, 13);
                    AnonymousClass7TE.A1Z(new XmaShareSenderHelper$sendXmaStoryReply$1(r62, userSession, pEa, r9, A0c, extendedImageUrl, A2A, "StoryReplySender", str3, str, str4, str2, (AnonymousClass4D7) null, i, A002, longValue), DbY.A0r(AnonymousClass12T.A00, 47));
                    return;
                }
                throw AnonymousClass7TE.A0z("Failed to get sender EIMU");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void EMg(OH1 oh1) {
        throw AnonymousClass7TE.A1B("send share for story reply with text not supported");
    }

    public PEW(UserSession userSession) {
        this.A00 = userSession;
    }
}
