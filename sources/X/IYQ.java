package X;

import com.instagram.common.session.UserSession;

public final class IYQ implements JPZ {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public IYQ(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATi(Object obj, Object obj2) {
        return C51973G9u.A0I(obj);
    }

    public final /* bridge */ /* synthetic */ HF8 ATj(C53251Gkz gkz, Object obj, Object obj2) {
        C230472pg r3;
        C267324bN A0g = C51969G9p.A0g(obj);
        String str = this.A01;
        String A06 = C254373sN.A06(G9t.A1B(A0g.A02));
        UserSession userSession = this.A00;
        String A0i = C51973G9u.A0i(A0g, userSession);
        String A04 = C254373sN.A04(userSession, A0g.A02);
        1Xj r0 = A0g.A02;
        if (r0 == null || r0.CcK()) {
            r3 = C230472pg.SPONSORED;
        } else {
            r3 = C230472pg.ORGANIC;
        }
        0sn r9 = 0sn.A00;
        long currentTimeMillis = System.currentTimeMillis();
        return new HF8(gkz, r3, str, A06, A0i, A04, C52020GBr.A02(A0g), r9, currentTimeMillis);
    }
}
