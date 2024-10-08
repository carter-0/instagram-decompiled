package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class IYV implements C296075pR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IYV(UserSession userSession, AnonymousClass4DU r2, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATz(Object obj, Object obj2) {
        1Xj r0;
        switch (this.A00) {
            case 1:
                C296935qt r2 = (C296935qt) obj;
                0qQ.A0B(r2, 0);
                C295795ov r02 = r2.A03;
                if (r02 == null) {
                    r0 = null;
                    break;
                } else {
                    r0 = r02.A0A;
                    break;
                }
            case 3:
                C255773uh r22 = (C255773uh) obj;
                0qQ.A0B(r22, 0);
                r0 = r22.A0b;
                break;
            default:
                r0 = C51968G9o.A0m(obj);
                break;
        }
        return C254373sN.A01(r0);
    }

    public final /* bridge */ /* synthetic */ HFA AU0(C376459Ib r16, Object obj, Object obj2) {
        1Xj r0;
        String A1F;
        String A06;
        C230472pg r5;
        List list;
        long A04;
        UserSession userSession;
        String A042;
        boolean A1Z;
        String str;
        C230472pg r52;
        String A03;
        Object obj3 = obj2;
        Object obj4 = obj;
        C376459Ib r1 = r16;
        switch (this.A00) {
            case 1:
                C296935qt r02 = (C296935qt) obj4;
                DbY.A1S(r02, r1);
                C295795ov r03 = r02.A03;
                String str2 = null;
                if (r03 != null) {
                    r0 = r03.A0A;
                } else {
                    r0 = null;
                }
                A1F = C51966G9m.A1F(this.A01);
                if (r0 != null) {
                    str2 = C51965G9l.A0t(r0);
                }
                A06 = C254373sN.A06(str2);
                if (r0 == null || r0.CcK()) {
                    r5 = C230472pg.SPONSORED;
                } else {
                    r5 = C230472pg.ORGANIC;
                }
                list = 0sn.A00;
                A04 = DbY.A04((Number) r1.A00);
                userSession = (UserSession) this.A02;
                A042 = C254373sN.A04(userSession, r0);
                A1Z = C51972G9s.A1Z((Boolean) r1.A02);
                if (r0 == null || (str = r0.getId()) == null) {
                    str = "n/a";
                    break;
                }
                break;
            case 3:
                C255773uh r04 = (C255773uh) obj4;
                C250973mM r2 = (C250973mM) obj3;
                AnonymousClass7TG.A1T(r04, r2, r1);
                A1F = C51966G9m.A1F(this.A01);
                1Xj r3 = r04.A0b;
                A06 = C254373sN.A06(G9t.A1B(r3));
                UserSession userSession2 = (UserSession) this.A02;
                A042 = C254373sN.A04(userSession2, r3);
                if (r3 == null || r3.CcK()) {
                    r52 = C230472pg.SPONSORED;
                } else {
                    r52 = C230472pg.ORGANIC;
                }
                list = C309976aE.A03(userSession2, r2);
                A04 = DbY.A04((Number) r1.A00);
                A1Z = C51972G9s.A1Z((Boolean) r1.A02);
                str = C309976aE.A02(r04);
                A03 = C254373sN.A03(userSession2, r3);
                break;
            default:
                r0 = (1Xj) obj4;
                AnonymousClass3W1 r22 = (AnonymousClass3W1) obj3;
                AnonymousClass7TG.A1T(r0, r22, r1);
                A1F = C51966G9m.A1F(this.A01);
                A06 = C51971G9r.A0r(r0);
                r5 = C51972G9s.A0e(r0);
                list = C254373sN.A07(r0);
                A04 = DbY.A04((Number) r1.A00);
                userSession = (UserSession) this.A02;
                A042 = C254373sN.A04(userSession, r0);
                A1Z = C51972G9s.A1Z((Boolean) r1.A02);
                str = C254373sN.A05(r0, r22);
                break;
        }
        A03 = C254373sN.A03(userSession, r0);
        return new HFA(r52, A042, A1F, A06, str, A03, list, A04, A1Z);
    }
}
