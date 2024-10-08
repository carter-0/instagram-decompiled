package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;

/* renamed from: X.7CD  reason: invalid class name */
public final class AnonymousClass7CD implements C327687Bu {
    public final boolean ABE() {
        return false;
    }

    public final boolean AFY(C254703su r2) {
        return true;
    }

    public final boolean AFm(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AFn(UserSession userSession, C254703su r3) {
        return false;
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

    public final boolean CVT(UserSession userSession, C254703su r3) {
        return true;
    }

    public final boolean CdO() {
        return true;
    }

    public final boolean Ce6(C254713sv r2) {
        return true;
    }

    public final boolean AFJ(UserSession userSession, C254703su r6) {
        Boolean bool;
        C254873tC r0;
        C48859ElL elL = C48859ElL.$redex_init_class;
        2FW r3 = r6.A10;
        int ordinal = r3.ordinal();
        if (ordinal == 28) {
            Object obj = r6.A1T;
            if (obj == null || ((AnonymousClass7FJ) obj).A01 == null) {
                return false;
            }
        } else if (ordinal == 29) {
            ImmutableList A0H = r6.A0H();
            if (A0H == null || (r0 = (C254873tC) A0H.get(0)) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(r0.A1i);
            }
            if (!0qQ.A0K(bool, true)) {
                return !182.A06(0Tu.A05, userSession, 36325914266580335L);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(r3);
            throw new IllegalStateException(sb.toString());
        }
        return true;
    }

    public final boolean AFS(UserSession userSession, C254703su r6, int i) {
        boolean equals;
        C254873tC r0;
        if (r6.A2P) {
            return false;
        }
        C48859ElL elL = C48859ElL.$redex_init_class;
        2FW r2 = r6.A10;
        int ordinal = r2.ordinal();
        if (ordinal == 28) {
            Object obj = r6.A1T;
            obj.getClass();
            AnonymousClass7FJ r1 = (AnonymousClass7FJ) obj;
            1Xj r02 = r1.A01;
            if (r02 == null) {
                return false;
            }
            if (r02.A5N()) {
                ReelType reelType = r1.A02;
                if (reelType == null) {
                    return false;
                }
                equals = reelType.equals(ReelType.A0P);
            }
            return true;
        } else if (ordinal == 29) {
            ImmutableList A0H = r6.A0H();
            if (A0H == null || (r0 = (C254873tC) A0H.iterator().next()) == null) {
                return false;
            }
            equals = r0.A04();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(r2);
            throw new IllegalStateException(sb.toString());
        }
        if (equals) {
            return true;
        }
        return false;
    }

    public final boolean AFk(UserSession userSession, C254703su r6) {
        2FW r3 = r6.A10;
        if (r3 == 2FW.A1e) {
            AnonymousClass7FJ r0 = (AnonymousClass7FJ) r6.A1T;
            if (r0 == null || r0.A04 != AnonymousClass05K.A00) {
                return false;
            }
            return true;
        } else if (r3 == 2FW.A20) {
            return true;
        }
        return false;
    }

    public final boolean AFl(UserSession userSession, C254703su r5) {
        return 182.A06(0Tu.A05, userSession, 36311281313317349L);
    }

    public final boolean AG2(UserSession userSession, C254703su r3, int i) {
        return AnonymousClass7FL.A00(r3, userSession.A06);
    }

    public final String C1n(UserSession userSession, C254703su r6) {
        C48859ElL elL = C48859ElL.$redex_init_class;
        2FW r3 = r6.A10;
        int ordinal = r3.ordinal();
        if (ordinal == 28) {
            Object obj = r6.A1T;
            if (obj != null) {
                return ((AnonymousClass7FJ) obj).A08;
            }
            return null;
        } else if (ordinal == 29) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(r3);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean CS1(UserSession userSession, C254703su r3) {
        return C3267277x.A00(1Au.A00(userSession));
    }

    public final boolean CS3(UserSession userSession, C254703su r3) {
        return C3267277x.A01(1Au.A00(userSession));
    }

    public final boolean CSF(UserSession userSession, C254703su r3) {
        return C3267277x.A02(1Au.A00(userSession));
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

    public final /* synthetic */ boolean AFq(UserSession userSession, C254703su r3) {
        return false;
    }
}
