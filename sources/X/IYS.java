package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class IYS implements JPZ {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;

    public IYS(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATi(Object obj, Object obj2) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        return C254373sN.A01(r2.A0b);
    }

    public final /* bridge */ /* synthetic */ HF8 ATj(C53251Gkz gkz, Object obj, Object obj2) {
        String str;
        C230472pg r4;
        User A2A;
        C255773uh r15 = (C255773uh) obj;
        C250973mM r3 = (C250973mM) obj2;
        AnonymousClass7TG.A1N(r15, r3);
        String moduleName = this.A01.getModuleName();
        1Xj r2 = r15.A0b;
        String A06 = C254373sN.A06(G9t.A1B(r2));
        if (r2 == null || (A2A = r2.A2A(this.A00)) == null) {
            str = "n/a";
        } else {
            str = A2A.getId();
        }
        UserSession userSession = this.A00;
        String A04 = C254373sN.A04(userSession, r2);
        if (r2 == null || r2.CcK()) {
            r4 = C230472pg.SPONSORED;
        } else {
            r4 = C230472pg.ORGANIC;
        }
        ArrayList A03 = C309976aE.A03(userSession, r3);
        return new HF8(gkz, r4, moduleName, A06, str, A04, C309976aE.A02(r15), A03, System.currentTimeMillis());
    }
}
