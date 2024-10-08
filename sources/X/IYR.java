package X;

import com.instagram.common.session.UserSession;

public final class IYR implements JPZ {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;

    public IYR(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ HF8 ATj(C53251Gkz gkz, Object obj, Object obj2) {
        1Xj r13 = (1Xj) obj;
        AnonymousClass3W1 r14 = (AnonymousClass3W1) obj2;
        AnonymousClass7TG.A1N(r13, r14);
        String moduleName = this.A01.getModuleName();
        String A0r = C51971G9r.A0r(r13);
        UserSession userSession = this.A00;
        String A012 = C228202kx.A01(userSession, r13);
        String A04 = C254373sN.A04(userSession, r13);
        return new HF8(gkz, C51972G9s.A0e(r13), moduleName, A0r, A012, A04, C254373sN.A05(r13, r14), C254373sN.A07(r13), System.currentTimeMillis());
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATi(Object obj, Object obj2) {
        return C254373sN.A01(C51968G9o.A0m(obj));
    }
}
