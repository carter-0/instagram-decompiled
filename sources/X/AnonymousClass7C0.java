package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7C0  reason: invalid class name */
public final class AnonymousClass7C0 implements C327687Bu {
    public final boolean ABE() {
        return false;
    }

    public final boolean AFJ(UserSession userSession, C254703su r3) {
        return true;
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

    public final boolean AFq(UserSession userSession, C254703su r5) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36319342966807689L);
    }

    public final String CFp() {
        return "media_reshare_message";
    }

    public final boolean CPF() {
        return true;
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

    public final boolean AFS(UserSession userSession, C254703su r6, int i) {
        C254873tC r0;
        if (r6.A2P) {
            return false;
        }
        if (i == 29) {
            0qQ.A0B(userSession, 0);
            if (!182.A06(0Tu.A05, userSession, 36319342967463059L)) {
                return false;
            }
        }
        if (r6.A1Y() || r6.A1X()) {
            return false;
        }
        2FW r3 = r6.A10;
        if (r3.equals(2FW.A1D)) {
            1Xj A0S = r6.A0S();
            if (A0S == null || A0S.A0C.BQf() != null || A0S.A4y()) {
                return false;
            }
        } else if (r3.equals(2FW.A1v)) {
            ImmutableList A0H = r6.A0H();
            if (A0H == null || (r0 = (C254873tC) A0H.iterator().next()) == null || !r0.A04()) {
                return false;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(r3);
            throw new IllegalStateException(sb.toString());
        }
        return true;
    }

    public final boolean AFl(UserSession userSession, C254703su r5) {
        return 182.A06(0Tu.A05, userSession, 36311281314038247L);
    }

    public final boolean AG2(UserSession userSession, C254703su r3, int i) {
        return AnonymousClass7FL.A00(r3, userSession.A06);
    }

    public final String C1n(UserSession userSession, C254703su r5) {
        Object obj = r5.A1T;
        if (AnonymousClass9JI.A00(2, obj)) {
            String str = ((AnonymousClass9JI) obj).A04;
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } else if (r5.A10 == 2FW.A1v) {
            return r5.A1q;
        }
        return null;
    }

    public final boolean AFk(UserSession userSession, C254703su r4) {
        if (r4.A1X() || r4.A0g() == null || r4.A2P) {
            return false;
        }
        return true;
    }

    public final boolean CRy(UserSession userSession) {
        1Av A00 = 1Au.A00(userSession);
        0qQ.A0B(A00, 0);
        0xa r3 = A00.A01;
        if (r3.getBoolean("direct_forwarding_has_forwarded", false) || r3.getInt("direct_forwarding_nux_count", 0) > 3 || System.currentTimeMillis() - r3.getLong("direct_forwarding_seen_timestamp", 0) <= TimeUnit.DAYS.toMillis(1)) {
            return false;
        }
        return true;
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
}
