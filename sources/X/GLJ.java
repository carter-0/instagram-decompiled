package X;

import com.instagram.common.session.UserSession;

public final class GLJ implements C296075pR {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public GLJ(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ HFA AU0(C376459Ib r13, Object obj, Object obj2) {
        C230472pg r2;
        C267324bN r14 = (C267324bN) obj;
        DbY.A1S(r14, r13);
        String A06 = C254373sN.A06(G9t.A1B(r14.A02));
        1Xj r0 = r14.A02;
        UserSession userSession = this.A00;
        String A04 = C254373sN.A04(userSession, r0);
        1Xj r02 = r14.A02;
        if (r02 == null || r02.CcK()) {
            r2 = C230472pg.SPONSORED;
        } else {
            r2 = C230472pg.ORGANIC;
        }
        0sn r8 = 0sn.A00;
        long A042 = DbY.A04((Number) r13.A00);
        boolean A1Z = C51972G9s.A1Z((Boolean) r13.A02);
        return new HFA(r2, A04, this.A01, A06, C52020GBr.A02(r14), C254373sN.A03(userSession, r14.A02), r8, A042, A1Z);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATz(Object obj, Object obj2) {
        return C51973G9u.A0I(obj);
    }
}
