package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Bw  reason: invalid class name and case insensitive filesystem */
public final class C327707Bw implements C327687Bu {
    public final boolean ABE() {
        return false;
    }

    public final boolean AFJ(UserSession userSession, C254703su r8) {
        2FW r1;
        C254873tC r0;
        ImmutableList A01;
        C254873tC r02;
        0qQ.A0B(r8, 0);
        0qQ.A0B(userSession, 1);
        if (r8.A0P() == null) {
            return false;
        }
        if (!182.A06(0Tu.A05, userSession, 36327499109579231L)) {
            return true;
        }
        C254933tI A0P = r8.A0P();
        if (A0P == null || (((r0 = A0P.A09) == null || !r0.A1i) && ((A01 = A0P.A01()) == null || (r02 = (C254873tC) A01.get(0)) == null || !r02.A1i))) {
            C254933tI A0P2 = r8.A0P();
            if (A0P2 != null) {
                r1 = A0P2.A0F;
            } else {
                r1 = null;
            }
            if (r1 == 2FW.A1M) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean AFS(UserSession userSession, C254703su r5, int i) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        if (r5.A2P || r5.A0G() != AnonymousClass5FV.None) {
            return false;
        }
        if (i != 29 || 182.A06(0Tu.A05, userSession, 36319342966873226L)) {
            return true;
        }
        return false;
    }

    public final boolean AFY(C254703su r2) {
        return true;
    }

    public final boolean AFk(UserSession userSession, C254703su r5) {
        0qQ.A0B(r5, 1);
        if (r5.A0g() == null || r5.A2P || r5.A0G() == AnonymousClass5FV.GiftWrap) {
            return false;
        }
        return true;
    }

    public final boolean AFl(UserSession userSession, C254703su r3) {
        return true;
    }

    public final boolean AFm(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AFn(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AFq(UserSession userSession, C254703su r3) {
        return true;
    }

    public final boolean AG2(UserSession userSession, C254703su r3, int i) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        return AnonymousClass7FL.A00(r3, userSession.A06);
    }

    public final String C1n(UserSession userSession, C254703su r5) {
        0qQ.A0B(r5, 1);
        Object obj = r5.A1T;
        if (obj instanceof String) {
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        }
        0f9 AEf = 0wj.A01.AEf("DirectTextMessagePresenter: message content is not String", 817891009);
        AEf.ABQ("message content", String.valueOf(r5.A1T));
        AEf.report();
        return null;
    }

    public final String CFp() {
        return null;
    }

    public final boolean CPF() {
        return true;
    }

    public final boolean CRy(UserSession userSession) {
        return false;
    }

    public final boolean CS1(UserSession userSession, C254703su r3) {
        0qQ.A0B(userSession, 0);
        return C3267277x.A00(1Au.A00(userSession));
    }

    public final boolean CS3(UserSession userSession, C254703su r3) {
        0qQ.A0B(userSession, 0);
        return C3267277x.A01(1Au.A00(userSession));
    }

    public final boolean CSF(UserSession userSession, C254703su r3) {
        0qQ.A0B(userSession, 0);
        return C3267277x.A02(1Au.A00(userSession));
    }

    public final boolean CVT(UserSession userSession, C254703su r3) {
        return true;
    }

    public final boolean CdO() {
        return true;
    }

    public final boolean Ce6(C254713sv r2) {
        return true;
    }

    public final /* synthetic */ boolean AFO(C254703su r2) {
        return false;
    }

    public final /* synthetic */ boolean AFp(C254703su r2) {
        return false;
    }

    public final /* synthetic */ boolean AG3(C254703su r2) {
        return false;
    }
}
