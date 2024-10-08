package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

public final class OLR {
    public final UserSession A00;
    public final C74415PuV A01;
    public final Map A02;
    public final Map A03;
    public final AnonymousClass0eK A04;

    public OLR(UserSession userSession) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        C73459Pd1 pd1 = new C73459Pd1(new C74215Pqw(C70998OVt.A01, 6), 10);
        PEY pey = new PEY(userSession2, new C73459Pd1(userSession2, 9));
        2FW r8 = 2FW.A1D;
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession2, 2342156773017848030L)) {
            obj = new PET(userSession2);
        } else {
            obj = pey;
        }
        0eP A1L = AnonymousClass7TE.A1L(r8, obj);
        2FW r7 = 2FW.A1e;
        if (182.A06(r4, userSession2, 2342156773017913567L)) {
            obj2 = new PEX(userSession2);
        } else {
            obj2 = pey;
        }
        0eP A1L2 = AnonymousClass7TE.A1L(r7, obj2);
        2FW r5 = 2FW.A1T;
        if (182.A06(r4, userSession2, 2342156773017979104L)) {
            obj3 = new PEW(userSession2);
        } else {
            obj3 = pey;
        }
        0eP A1L3 = AnonymousClass7TE.A1L(r5, obj3);
        2FW r2 = 2FW.A0W;
        if (182.A06(r4, userSession2, 2342156773018372322L)) {
            obj4 = new PER(userSession2);
        } else {
            obj4 = pey;
        }
        0eP A1L4 = AnonymousClass7TE.A1L(r2, obj4);
        2FW r6 = 2FW.A0t;
        if (182.A06(r4, userSession2, 2342156773018568932L)) {
            obj5 = new PES(userSession2);
        } else {
            obj5 = pey;
        }
        0eP A1L5 = AnonymousClass7TE.A1L(r6, obj5);
        2FW r10 = 2FW.A1O;
        if (182.A06(r4, userSession2, 2342156773018175713L)) {
            obj6 = new PEU(userSession2);
        } else {
            obj6 = pey;
        }
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, AnonymousClass7TE.A1L(r10, obj6), AnonymousClass7TE.A1L(2FW.A1x, new PEV(userSession2))});
        LinkedHashMap A062 = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L(r8, new PET(userSession2)), AnonymousClass7TE.A1L(r7, new PEX(userSession2)), AnonymousClass7TE.A1L(r5, new PEW(userSession2)), AnonymousClass7TE.A1L(r2, new PER(userSession2)), AnonymousClass7TE.A1L(r6, new PES(userSession2))});
        0qQ.A0B(A06, 4);
        0qQ.A0B(A062, 5);
        this.A00 = userSession2;
        this.A04 = pd1;
        this.A01 = pey;
        this.A03 = A06;
        this.A02 = A062;
    }

    public final void A00(OH1 oh1) {
        C74415PuV puV;
        if (oh1.A05) {
            Object obj = this.A02.get(oh1.A01);
            if (obj != null) {
                puV = (C74415PuV) obj;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            puV = (C74415PuV) this.A03.get(oh1.A01);
            if (puV == null) {
                puV = this.A01;
            }
        }
        puV.EMg(oh1);
    }
}
