package X;

import com.instagram.common.session.UserSession;

public final class PAR implements AnonymousClass786 {
    public final UserSession A00;
    public final C333517Zg A01;

    public final void FHO(AnonymousClass9I5 r18) {
        C333517Zg r7 = this.A01;
        AnonymousClass7S7 C6l = r7.C6l();
        Integer num = C6l.C6Q().A0N.A00;
        Integer num2 = C6l.C6Q().A0N.A01;
        UserSession userSession = this.A00;
        C329757Kc A012 = C329737Ka.A01(userSession, C6l.C6Q(), true);
        boolean COV = A012.COV(userSession, C66580MXl.A0Z(C6l));
        C254793t3 CBU = C6l.CBU();
        if (CBU != null) {
            AnonymousClass9I5 r6 = r18;
            boolean z = r6.A01;
            if (z && num != null && (!COV || num2 != null)) {
                C71103Och och = C71103Och.A00;
                C242373Tu r2 = C6l.C6Q().A0H;
                int intValue = num.intValue();
                Integer num3 = null;
                if (COV) {
                    num3 = num2;
                }
                if (och.A03(userSession, r2, num3, intValue) && A012.Ce3(userSession)) {
                    r7.C62().FHI(userSession, CBU, num2, r6.A00, intValue);
                    return;
                }
            }
            r7.C62().FHH(userSession, C6l.C6Q().A0H, CBU, r6.A00, z, COV);
        }
    }

    public PAR(UserSession userSession, C333517Zg r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
