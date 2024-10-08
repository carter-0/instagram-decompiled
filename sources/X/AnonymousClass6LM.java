package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6LM  reason: invalid class name */
public final class AnonymousClass6LM implements C282095Bq {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;

    public AnonymousClass6LM(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATr(Object obj, Object obj2) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        return C254373sN.A01(r2.A0b);
    }

    public final /* bridge */ /* synthetic */ HF5 ATs(Object obj, Object obj2) {
        String str;
        String str2;
        C230472pg r2;
        User A2A;
        C255773uh r12 = (C255773uh) obj;
        C250973mM r13 = (C250973mM) obj2;
        0qQ.A0B(r12, 0);
        0qQ.A0B(r13, 1);
        String moduleName = this.A01.getModuleName();
        1Xj r22 = r12.A0b;
        if (r22 != null) {
            str = r22.A0C.BIl();
        } else {
            str = null;
        }
        String A06 = C254373sN.A06(str);
        if (r22 == null || (A2A = r22.A2A(this.A00)) == null) {
            str2 = "n/a";
        } else {
            str2 = A2A.getId();
        }
        UserSession userSession = this.A00;
        String A04 = C254373sN.A04(userSession, r22);
        if (r22 == null || r22.CcK()) {
            r2 = C230472pg.SPONSORED;
        } else {
            r2 = C230472pg.ORGANIC;
        }
        return new HF5(r2, moduleName, A06, str2, A04, C309976aE.A02(r12), C309976aE.A03(userSession, r13), System.currentTimeMillis());
    }
}
