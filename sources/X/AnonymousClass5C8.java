package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5C8  reason: invalid class name */
public final class AnonymousClass5C8 implements AnonymousClass5C9 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;

    public AnonymousClass5C8(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATp(Object obj, Object obj2) {
        1Xj r2 = (1Xj) obj;
        0qQ.A0B(r2, 0);
        return C254373sN.A01(r2);
    }

    public final /* bridge */ /* synthetic */ C52472GTy AUP(Object obj, Object obj2, String str) {
        C230472pg r1;
        1Xj r12 = (1Xj) obj;
        AnonymousClass3W1 r13 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r12, 0);
        0qQ.A0B(r13, 1);
        String str2 = str;
        0qQ.A0B(str, 2);
        String moduleName = this.A01.getModuleName();
        String A06 = C254373sN.A06(r12.A0C.BIl());
        UserSession userSession = this.A00;
        String A012 = C228202kx.A01(userSession, r12);
        String A04 = C254373sN.A04(userSession, r12);
        if (r12.CcK()) {
            r1 = C230472pg.SPONSORED;
        } else {
            r1 = C230472pg.ORGANIC;
        }
        return new C52472GTy(r1, moduleName, A06, A012, A04, C254373sN.A05(r12, r13), str2, C254373sN.A07(r12), System.currentTimeMillis());
    }
}
