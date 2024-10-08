package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IYx  reason: case insensitive filesystem */
public final class C57366IYx implements C296145pY {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C57366IYx(UserSession userSession, AnonymousClass4DU r2, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUV(Object obj) {
        1Xj r0;
        if (2 - this.A00 != 0) {
            r0 = C51968G9o.A0m(obj);
        } else {
            C255773uh r2 = (C255773uh) obj;
            0qQ.A0B(r2, 0);
            r0 = r2.A0b;
        }
        return C254373sN.A01(r0);
    }

    public final /* bridge */ /* synthetic */ HFB AUW(Object obj, Object obj2, String str) {
        String A1F;
        String A0r;
        String id;
        String A04;
        C230472pg A0e;
        List A07;
        long currentTimeMillis;
        String A05;
        User A2A;
        String str2 = str;
        switch (this.A00) {
            case 0:
                1Xj r13 = (1Xj) obj;
                AnonymousClass3W1 r14 = (AnonymousClass3W1) obj2;
                AnonymousClass7TG.A1T(r13, r14, str);
                A1F = C51966G9m.A1F(this.A01);
                A0r = C51971G9r.A0r(r13);
                UserSession userSession = (UserSession) this.A02;
                User A2A2 = r13.A2A(userSession);
                if (A2A2 != null) {
                    id = A2A2.getId();
                    A04 = C254373sN.A04(userSession, r13);
                    A0e = C51972G9s.A0e(r13);
                    A07 = C254373sN.A07(r13);
                    currentTimeMillis = System.currentTimeMillis();
                    A05 = C254373sN.A05(r13, r14);
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            case 1:
                1Xj r132 = (1Xj) obj;
                AnonymousClass3W1 r142 = (AnonymousClass3W1) obj2;
                AnonymousClass7TG.A1T(r132, r142, str);
                A1F = C51966G9m.A1F(this.A01);
                A0r = C51971G9r.A0r(r132);
                UserSession userSession2 = (UserSession) this.A02;
                id = C228202kx.A01(userSession2, r132);
                A04 = C254373sN.A04(userSession2, r132);
                A0e = C51972G9s.A0e(r132);
                A07 = C254373sN.A07(r132);
                currentTimeMillis = System.currentTimeMillis();
                A05 = C254373sN.A05(r132, r142);
                break;
            default:
                C255773uh r133 = (C255773uh) obj;
                C250973mM r143 = (C250973mM) obj2;
                AnonymousClass7TG.A1T(r133, r143, str);
                A1F = C51966G9m.A1F(this.A01);
                1Xj r2 = r133.A0b;
                A0r = C254373sN.A06(G9t.A1B(r2));
                if (r2 == null || (A2A = r2.A2A((UserSession) this.A02)) == null) {
                    id = "n/a";
                } else {
                    id = A2A.getId();
                }
                UserSession userSession3 = (UserSession) this.A02;
                A04 = C254373sN.A04(userSession3, r2);
                if (r2 == null || !r2.CcK()) {
                    A0e = C230472pg.ORGANIC;
                } else {
                    A0e = C230472pg.SPONSORED;
                }
                A07 = C309976aE.A03(userSession3, r143);
                currentTimeMillis = System.currentTimeMillis();
                A05 = C309976aE.A02(r133);
                break;
        }
        return new HFB(A0e, A1F, A0r, id, A04, A05, str2, A07, currentTimeMillis);
    }
}
