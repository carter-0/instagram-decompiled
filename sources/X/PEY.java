package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.util.List;

public final class PEY implements C74415PuV {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;
    public final AnonymousClass0eK A02;
    public final AnonymousClass0eK A03;

    public final void EMZ(OGF ogf) {
        OGF ogf2 = ogf;
        0qQ.A0B(ogf2, 0);
        C70998OVt oVt = (C70998OVt) C66580MXl.A0s(this.A02);
        UserSession userSession = this.A01;
        2FW r12 = ogf2.A01;
        Object obj = ogf2.A02;
        C41655Ay7 ay7 = new C41655Ay7(userSession, 25);
        AnonymousClass7TF.A1B(oVt, 0, r12);
        String A002 = OP4.A00(userSession, oVt, new O65(false), r12, obj, ay7);
        C333547Zj r4 = (C333547Zj) this.A03.get();
        Object obj2 = ogf2.A03;
        if (obj2 instanceof String) {
            DbS.A1Y(obj2);
            String str = (String) obj2;
            C381429bk r3 = ogf2.A00;
            C254783t2 A0c = DbS.A0c(r3.A01);
            0qQ.A0A(r4);
            1a8 r9 = this.A00;
            C333547Zj r10 = r4;
            C71148Oe6.A05(r9, r10, (C74343PtJ) null, r12, A0c, A002, ogf2.A04);
            if (!00l.A0W(str)) {
                C71148Oe6.A05(r9, r10, new PEZ(this, r3), r12, A0c, str, (String) null);
            }
        } else if (obj2 instanceof DirectAnimatedMedia) {
            0qQ.A0A(r4);
            DirectShareTarget directShareTarget = ogf2.A00.A01;
            C254783t2 A0c2 = DbS.A0c(directShareTarget);
            1a8 r0 = this.A00;
            String str2 = ogf2.A04;
            C71148Oe6.A05(r0, r4, (C74343PtJ) null, r12, A0c2, A002, str2);
            List A14 = DbT.A14(directShareTarget);
            if (A14 == null) {
                A14 = null;
            }
            C254783t2 A0c3 = DbS.A0c(directShareTarget);
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.model.direct.gifs.DirectAnimatedMedia");
            r4.ELL((Context) null, userSession, (C254933tI) null, (DirectAnimatedMedia) obj2, A0c3, str2, (String) null, A14, false);
        } else {
            throw AnonymousClass7TE.A0w("Unrecognized sendReplyParams.reply type");
        }
    }

    public final void EMg(OH1 oh1) {
        0qQ.A0B(oh1, 0);
        C254783t2 A0c = DbS.A0c(oh1.A00);
        C70998OVt oVt = (C70998OVt) C66580MXl.A0s(this.A02);
        UserSession userSession = this.A01;
        2FW r4 = oh1.A01;
        Object obj = oh1.A02;
        C41655Ay7 ay7 = new C41655Ay7(userSession, 25);
        0qQ.A0B(oVt, 0);
        String A002 = OP4.A00(userSession, oVt, new O65(false), r4, obj, ay7);
        C333547Zj r2 = (C333547Zj) this.A03.get();
        0qQ.A0A(r2);
        1a8 r1 = this.A00;
        String str = oh1.A04;
        C71148Oe6.A05(r1, r2, (C74343PtJ) null, r4, A0c, A002, str);
        String str2 = oh1.A03;
        if (str2 != null && !00l.A0W(str2)) {
            C71148Oe6.A05(r1, r2, (C74343PtJ) null, r4, A0c, str2, str);
        }
    }

    public PEY(UserSession userSession, AnonymousClass0eK r5) {
        C73459Pd1 pd1 = new C73459Pd1(new C74215Pqw(C70998OVt.A01, 5), 8);
        this.A01 = userSession;
        this.A03 = r5;
        this.A02 = pd1;
    }
}
