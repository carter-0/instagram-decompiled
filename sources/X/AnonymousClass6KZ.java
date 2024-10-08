package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6KZ  reason: invalid class name */
public final class AnonymousClass6KZ implements C298135sw {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;

    public AnonymousClass6KZ(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATk(Object obj, Object obj2) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        return C254373sN.A01(r2.A0b);
    }

    public final /* bridge */ /* synthetic */ HF9 ATl(C376459Ib r16, Object obj, Object obj2) {
        String str;
        C230472pg r5;
        long j;
        boolean z;
        C255773uh r3 = (C255773uh) obj;
        C250973mM r4 = (C250973mM) obj2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        String moduleName = this.A01.getModuleName();
        1Xj r2 = r3.A0b;
        if (r2 != null) {
            str = r2.A0C.BIl();
        } else {
            str = null;
        }
        String A06 = C254373sN.A06(str);
        UserSession userSession = this.A00;
        String A04 = C254373sN.A04(userSession, r2);
        if (r2 == null || r2.CcK()) {
            r5 = C230472pg.SPONSORED;
        } else {
            r5 = C230472pg.ORGANIC;
        }
        ArrayList A03 = C309976aE.A03(userSession, r4);
        C376459Ib r42 = r16;
        Number number = (Number) r42.A00;
        if (number != null) {
            j = number.longValue();
        } else {
            j = 0;
        }
        Boolean bool = (Boolean) r42.A01;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return new HF9(r5, A04, moduleName, A06, C309976aE.A02(r3), C254373sN.A03(userSession, r2), A03, j, z);
    }
}
