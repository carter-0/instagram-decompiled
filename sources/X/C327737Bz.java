package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Bz  reason: invalid class name and case insensitive filesystem */
public final class C327737Bz implements C327687Bu {
    public final boolean ABE() {
        return true;
    }

    public final boolean AFJ(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AFS(UserSession userSession, C254703su r5, int i) {
        String str;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        if (r5.A2P || r5.A0s == null) {
            return false;
        }
        1E8 A00 = 1E7.A00(userSession);
        1Xj r0 = r5.A0s;
        if (r0 != null) {
            str = r0.getId();
        } else {
            str = null;
        }
        if (A00.A02(str) == null) {
            return false;
        }
        if (i == 29 && !182.A06(0Tu.A05, userSession, 36319342966938763L)) {
            return false;
        }
        if (r5.A10 != 2FW.A1q || 182.A06(0Tu.A05, userSession, 36327653729778272L)) {
            return true;
        }
        return false;
    }

    public final boolean AFY(C254703su r2) {
        return true;
    }

    public final boolean AFk(UserSession userSession, C254703su r5) {
        1Xj r0;
        String id;
        Integer A0d;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        if (r5.A0g() == null || r5.A2P || (((r0 = r5.A0s) != null && (id = r0.getId()) != null && C66797Mcj.A02(userSession, r5.A1S()) && (A0d = r5.A0d(id)) != null && A0d.intValue() == 100) || r5.A0W() == 1iA.A0E)) {
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

    public final boolean AFn(UserSession userSession, C254703su r5) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        if ((C66797Mcj.A02(userSession, r5.A1S()) && r5.A1b()) || r5.A0W() == 1iA.A0E || r5.A10 == 2FW.A1q) {
            return false;
        }
        return true;
    }

    public final boolean AFq(UserSession userSession, C254703su r3) {
        return true;
    }

    public final boolean AG2(UserSession userSession, C254703su r3, int i) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        return AnonymousClass7FL.A00(r3, userSession.A06);
    }

    public final String C1n(UserSession userSession, C254703su r3) {
        return null;
    }

    public final String CFp() {
        return "permanent_media_message";
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
