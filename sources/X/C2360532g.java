package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.32g  reason: invalid class name and case insensitive filesystem */
public final class C2360532g {
    public final UserSession A00;
    public final C62320sa A01;
    public final C62320sa A02;
    public final C62320sa A03;
    public final C62320sa A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final C62320sa A08;

    public /* synthetic */ C2360532g(UserSession userSession) {
        C377219Kz r8 = new C377219Kz(userSession, 4);
        C377219Kz r7 = new C377219Kz(userSession, 5);
        C377219Kz r6 = new C377219Kz(userSession, 6);
        C377219Kz r5 = new C377219Kz(userSession, 7);
        C377219Kz r4 = new C377219Kz(userSession, 8);
        C377219Kz r3 = new C377219Kz(userSession, 9);
        C377219Kz r2 = new C377219Kz(userSession, 10);
        C377219Kz r0 = new C377219Kz(userSession, 11);
        this.A00 = userSession;
        this.A06 = r8;
        this.A03 = r7;
        this.A04 = r6;
        this.A05 = r5;
        this.A01 = r4;
        this.A02 = r3;
        this.A07 = r2;
        this.A08 = r0;
    }

    public static final boolean A00(1Xj r5, C2360532g r6, AnonymousClass3W1 r7) {
        1sy r1;
        if (r5 != null) {
            if (r7 != null) {
                r1 = r7.A0o;
            } else {
                r1 = null;
            }
            if (r1 == 1sy.A0H) {
                return !182.A06(0Tu.A05, r6.A00, 36316070202642336L) && r5.A60();
            }
        }
    }

    public final boolean A02(1Xj r7, AnonymousClass3W1 r8) {
        0qQ.A0B(r8, 1);
        if (r7 != null && r8.A0o == 1sy.A0H) {
            return !182.A06(0Tu.A05, this.A00, 36316070202249115L) && r7.A60();
        }
    }

    public final boolean A03(1Xj r7, AnonymousClass3W1 r8) {
        0qQ.A0B(r8, 1);
        if (r8.A0o == 1sy.A0H) {
            UserSession userSession = this.A00;
            0Tu r2 = 0Tu.A05;
            return 182.A06(r2, userSession, 36316070202380189L) && (182.A06(r2, userSession, 36316070202249115L) || !r7.A60()) && !r7.A5H() && r7.A0C.BFi() == null;
        }
    }

    public final long A01(1Xj r7, AnonymousClass3W1 r8) {
        double d;
        UserSession userSession;
        0Tu r4;
        long j;
        long A002;
        if (A00(r7, this, r8)) {
            if (182.A06(0Tu.A05, this.A00, 36323534854696182L)) {
                A002 = 3000;
            } else {
                A002 = 4000;
            }
        } else {
            if (r7 != null) {
                userSession = this.A00;
                r4 = 0Tu.A05;
                if (182.A06(r4, userSession, 36316070202511262L) && r7.CeS()) {
                    d = 1000.0d;
                    j = 37160495132573813L;
                    A002 = (long) (d * 182.A00(r4, userSession, j));
                }
            }
            d = 1000.0d;
            userSession = this.A00;
            r4 = 0Tu.A05;
            j = 37160495131721844L;
            A002 = (long) (d * 182.A00(r4, userSession, j));
        }
        if (r7 != null) {
            r7.getId();
        }
        return A002;
    }
}
