package X;

import com.instagram.common.session.UserSession;

public final class GLH implements AnonymousClass5C9 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public GLH(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C52472GTy AUP(Object obj, Object obj2, String str) {
        C267324bN r12 = (C267324bN) obj;
        DbY.A1S(r12, str);
        String str2 = this.A01;
        String A06 = C254373sN.A06(G9t.A1B(r12.A02));
        UserSession userSession = this.A00;
        String A0i = C51973G9u.A0i(r12, userSession);
        String A04 = C254373sN.A04(userSession, r12.A02);
        C230472pg A0R = C51974G9v.A0R(r12);
        0sn r8 = 0sn.A00;
        long currentTimeMillis = System.currentTimeMillis();
        return new C52472GTy(A0R, str2, A06, A0i, A04, C52020GBr.A02(r12), str, r8, currentTimeMillis);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATp(Object obj, Object obj2) {
        return C51973G9u.A0I(obj);
    }
}
