package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.7CG  reason: invalid class name */
public final class AnonymousClass7CG implements C327687Bu {
    public final boolean ABE() {
        return false;
    }

    public final boolean AFJ(UserSession userSession, C254703su r3) {
        return true;
    }

    public final boolean AFS(UserSession userSession, C254703su r6, int i) {
        boolean z;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36323272861690923L) && (i != 29 || 182.A06(r2, userSession, 36319342967004300L))) {
            synchronized (r6) {
                ImmutableList A0H = r6.A0H();
                z = false;
                if (A0H != null && !A0H.isEmpty()) {
                    String str = ((C254873tC) A0H.get(0)).A0u;
                    if (r6.A10 == 2FW.A1p && str != null && str.startsWith("instagram://share_to_direct_preview")) {
                        z = true;
                    }
                }
            }
            if (z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean AFY(C254703su r2) {
        return true;
    }

    public final boolean AFk(UserSession userSession, C254703su r3) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = ((X.C254873tC) r1).A0u;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFl(com.instagram.common.session.UserSession r5, X.C254703su r6) {
        /*
            r4 = this;
            r3 = 1
            X.0qQ.A0B(r6, r3)
            java.lang.Object r1 = r6.A1T
            r2 = 0
            if (r1 == 0) goto L_0x0026
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0026
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = X.00k.A0A(r1)
            boolean r0 = r1 instanceof X.C254873tC
            if (r0 == 0) goto L_0x0026
            X.3tC r1 = (X.C254873tC) r1
            java.lang.String r1 = r1.A0u
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = "share_to_direct_preview"
            boolean r0 = X.00l.A0d(r1, r0, r2)
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CG.AFl(com.instagram.common.session.UserSession, X.3su):boolean");
    }

    public final boolean AFm(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AFn(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AG2(UserSession userSession, C254703su r3, int i) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        return AnonymousClass7FL.A00(r3, userSession.A06);
    }

    public final String C1n(UserSession userSession, C254703su r4) {
        0qQ.A0B(r4, 1);
        if (r4.A10 == 2FW.A1p) {
            return r4.A1q;
        }
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
        return false;
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
