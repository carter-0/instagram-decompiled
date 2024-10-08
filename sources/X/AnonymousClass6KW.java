package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6KW  reason: invalid class name */
public final class AnonymousClass6KW implements AnonymousClass5C9 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;

    public AnonymousClass6KW(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATp(Object obj, Object obj2) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        return C254373sN.A01(r2.A0b);
    }

    public final /* bridge */ /* synthetic */ C52472GTy AUP(Object obj, Object obj2, String str) {
        String str2;
        String str3;
        C230472pg r2;
        User A2A;
        C255773uh r13 = (C255773uh) obj;
        C250973mM r14 = (C250973mM) obj2;
        0qQ.A0B(r13, 0);
        0qQ.A0B(r14, 1);
        String str4 = str;
        0qQ.A0B(str, 2);
        String moduleName = this.A01.getModuleName();
        1Xj r22 = r13.A0b;
        if (r22 != null) {
            str2 = r22.A0C.BIl();
        } else {
            str2 = null;
        }
        String A06 = C254373sN.A06(str2);
        if (r22 == null || (A2A = r22.A2A(this.A00)) == null) {
            str3 = "n/a";
        } else {
            str3 = A2A.getId();
        }
        UserSession userSession = this.A00;
        String A04 = C254373sN.A04(userSession, r22);
        if (r22 == null || !r22.CcK()) {
            r2 = C230472pg.ORGANIC;
        } else {
            r2 = C230472pg.SPONSORED;
        }
        return new C52472GTy(r2, moduleName, A06, str3, A04, C309976aE.A02(r13), str4, C309976aE.A03(userSession, r14), System.currentTimeMillis());
    }
}
