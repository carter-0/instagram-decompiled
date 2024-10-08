package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5lb  reason: invalid class name and case insensitive filesystem */
public final class C293945lb implements C298135sw {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;

    public C293945lb(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATk(Object obj, Object obj2) {
        1Xj r2 = (1Xj) obj;
        0qQ.A0B(r2, 0);
        return C254373sN.A01(r2);
    }

    public final /* bridge */ /* synthetic */ HF9 ATl(C376459Ib r13, Object obj, Object obj2) {
        C230472pg r2;
        long j;
        boolean z;
        1Xj r14 = (1Xj) obj;
        AnonymousClass3W1 r15 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        String moduleName = this.A01.getModuleName();
        String A06 = C254373sN.A06(r14.A0C.BIl());
        if (r14.CcK()) {
            r2 = C230472pg.SPONSORED;
        } else {
            r2 = C230472pg.ORGANIC;
        }
        List A07 = C254373sN.A07(r14);
        Number number = (Number) r13.A00;
        if (number != null) {
            j = number.longValue();
        } else {
            j = 0;
        }
        UserSession userSession = this.A00;
        String A04 = C254373sN.A04(userSession, r14);
        Boolean bool = (Boolean) r13.A01;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return new HF9(r2, A04, moduleName, A06, C254373sN.A05(r14, r15), C254373sN.A03(userSession, r14), A07, j, z);
    }
}
