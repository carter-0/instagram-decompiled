package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryMention$1;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

public final class PEV implements C74415PuV {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;

    public final void EMg(OH1 oh1) {
        OH1 oh12 = oh1;
        0qQ.A0B(oh12, 0);
        Object obj = oh12.A02;
        0qQ.A0C(obj, C273654mx.A00(C11152SCh.MAX_FACTORIAL));
        AnonymousClass7FN r4 = (AnonymousClass7FN) obj;
        1Xj r7 = r4.A02;
        0qQ.A07(r7);
        UserSession userSession = this.A01;
        User A2A = r7.A2A(userSession);
        if (A2A != null) {
            DirectShareTarget directShareTarget = oh12.A00;
            String A0A = directShareTarget.A0A();
            if (A0A != null) {
                boolean z = !AnonymousClass7TF.A1Y(r7.A0C.BRf(), false);
                User B9t = r7.A0C.B9t();
                String str = oh12.A04;
                int i = 1014;
                if (r7.A5p()) {
                    i = 1004;
                }
                String str2 = r4.A08;
                if (str2 == null) {
                    str2 = A2A.getId();
                }
                String str3 = r4.A09;
                0qQ.A07(str3);
                C254783t2 A0c = DbS.A0c(directShareTarget);
                1a8 r5 = this.A00;
                C51969G9p.A1O(str2, 4, r5);
                AnonymousClass7TE.A1Z(new XmaShareSenderHelper$sendXmaStoryMention$1(r5, userSession, r7, A0c, A2A, B9t, "StoryMentionSender", A0A, str2, str3, str, (AnonymousClass4D7) null, i, 0, z), 19E.A02(AnonymousClass12T.A00.AOJ(47, 3)));
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void EMZ(OGF ogf) {
        throw AnonymousClass7TE.A1B("send story mentions not supported");
    }

    public PEV(UserSession userSession) {
        this.A01 = userSession;
    }
}
