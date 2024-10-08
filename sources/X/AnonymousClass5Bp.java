package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.5Bp  reason: invalid class name */
public final class AnonymousClass5Bp implements C282095Bq {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;

    public AnonymousClass5Bp(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATr(Object obj, Object obj2) {
        1Xj r2 = (1Xj) obj;
        0qQ.A0B(r2, 0);
        return C254373sN.A01(r2);
    }

    public final /* bridge */ /* synthetic */ HF5 ATs(Object obj, Object obj2) {
        C230472pg r1;
        1Xj r11 = (1Xj) obj;
        AnonymousClass3W1 r12 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        String moduleName = this.A01.getModuleName();
        String A06 = C254373sN.A06(r11.A0C.BIl());
        UserSession userSession = this.A00;
        User A2A = r11.A2A(userSession);
        if (A2A != null) {
            String id = A2A.getId();
            String A04 = C254373sN.A04(userSession, r11);
            if (r11.CcK()) {
                r1 = C230472pg.SPONSORED;
            } else {
                r1 = C230472pg.ORGANIC;
            }
            return new HF5(r1, moduleName, A06, id, A04, C254373sN.A05(r11, r12), C254373sN.A07(r11), System.currentTimeMillis());
        }
        throw new IllegalStateException("Required value was null.");
    }
}
