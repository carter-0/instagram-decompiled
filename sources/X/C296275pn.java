package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5pn  reason: invalid class name and case insensitive filesystem */
public final class C296275pn implements C296285po {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;

    public C296275pn(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO ATv(Object obj, Object obj2) {
        1Xj r2 = (1Xj) obj;
        0qQ.A0B(r2, 0);
        return C254373sN.A01(r2);
    }

    public final /* bridge */ /* synthetic */ GA9 ATw(Object obj, Object obj2) {
        C230472pg r1;
        1Xj r11 = (1Xj) obj;
        AnonymousClass3W1 r12 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        String moduleName = this.A01.getModuleName();
        String A06 = C254373sN.A06(r11.A0C.BIl());
        UserSession userSession = this.A00;
        String A012 = C228202kx.A01(userSession, r11);
        String A04 = C254373sN.A04(userSession, r11);
        if (r11.CcK()) {
            r1 = C230472pg.SPONSORED;
        } else {
            r1 = C230472pg.ORGANIC;
        }
        return new GA9(r1, moduleName, A06, A012, A04, C254373sN.A05(r11, r12), C254373sN.A07(r11), System.currentTimeMillis());
    }
}
