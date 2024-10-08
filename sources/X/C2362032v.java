package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.32v  reason: invalid class name and case insensitive filesystem */
public final class C2362032v {
    public final UserSession A00;
    public final AnonymousClass2rI A01;
    public final C233102ux A02;

    public final boolean A02(1Xj r6, Integer num) {
        C233102ux r1;
        UserSession userSession = this.A00;
        if ((!182.A06(0Tu.A05, userSession, 36326236389127821L) || C295435o9.A01(userSession)) && (r1 = this.A02) != null) {
            return r1.EsX(AFI_TYPE.SEE_MORE_LESS, r6, num);
        }
        return false;
    }

    public final void A00(1Xj r12, Integer num) {
        C233102ux r5;
        String A2R;
        UserSession userSession = this.A00;
        0Tu r3 = 0Tu.A05;
        if ((!182.A06(r3, userSession, 36326236389127821L) || C295435o9.A01(userSession)) && (r5 = this.A02) != null) {
            AnonymousClass2rI r2 = this.A01;
            1Xj r7 = r12;
            AnonymousClass3W1 BQr = r2.BQr(r12);
            if (182.A06(r3, userSession, 36312879040824667L) || C228342lQ.A08(userSession, 1Au.A00(userSession))) {
                A2R = r12.A2R();
            } else {
                A2R = r12.getId();
            }
            if (A2R != null) {
                r5.Cui(AFI_TYPE.SEE_MORE_LESS, r7, BQr, num, r2.BJU(A2R));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final boolean A01(1Xj r5) {
        Boolean CZV;
        C250513lZ injected = r5.A0C.getInjected();
        if (!(injected == null || (CZV = injected.CZV()) == null || !CZV.booleanValue())) {
            if (!182.A06(0Tu.A06, this.A00, 36314670042385143L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C2362032v(UserSession userSession, AnonymousClass2rI r2, C233102ux r3) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = r2;
    }
}
