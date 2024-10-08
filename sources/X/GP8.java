package X;

import com.instagram.common.session.UserSession;

public final class GP8 implements C282095Bq {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public GP8(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATr(Object obj, Object obj2) {
        return C51973G9u.A0I(obj);
    }

    public final /* bridge */ /* synthetic */ HF5 ATs(Object obj, Object obj2) {
        C267324bN A0g = C51969G9p.A0g(obj);
        String str = this.A01;
        String A06 = C254373sN.A06(G9t.A1B(A0g.A02));
        UserSession userSession = this.A00;
        String A0i = C51973G9u.A0i(A0g, userSession);
        String A04 = C254373sN.A04(userSession, A0g.A02);
        return new HF5(C51974G9v.A0R(A0g), str, A06, A0i, A04, C52020GBr.A02(A0g), 0sn.A00, System.currentTimeMillis());
    }
}
