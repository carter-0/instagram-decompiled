package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2wp  reason: invalid class name and case insensitive filesystem */
public final class C234002wp {
    public 1Xj A00;
    public boolean A01 = true;
    public final UserSession A02;
    public final C234012wq A03;
    public final C234032ws A04;
    public final C234022wr A05;

    public C234002wp(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = new C234012wq(userSession);
        this.A05 = new C234022wr(userSession);
        this.A04 = new C234032ws(userSession);
    }

    public final Boolean A01(1Xj r4) {
        String id = r4.getId();
        UserSession userSession = this.A02;
        if (id == null) {
            return false;
        }
        C53269GlH glH = (C53269GlH) C55136Hck.A00(userSession).A00.get(id);
        if (glH != null) {
            return glH.A00;
        }
        return null;
    }

    public final void A02() {
        1Av A002 = 1Au.A00(this.A03.A02);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = A002.A01.AR4();
        AR4.E5c("delayed_skip_display_time_stamp", currentTimeMillis);
        AR4.apply();
    }

    public final boolean A03() {
        UserSession userSession = this.A02;
        0Tu r3 = 0Tu.A06;
        if (!182.A06(r3, userSession, 36324840526066072L) || !182.A06(r3, this.A05.A00, 36324840524755349L)) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        UserSession userSession = this.A02;
        0Tu r2 = 0Tu.A06;
        if (!182.A06(r2, userSession, 36324840526066072L) || !182.A06(r2, userSession, 36324840524820886L)) {
            return false;
        }
        return true;
    }

    public final boolean A05(1Xj r5) {
        C250513lZ injected;
        if (182.A06(0Tu.A06, this.A02, 36324840526197145L)) {
            if (r5 == null || (injected = r5.A0C.getInjected()) == null) {
                return false;
            }
            return 0qQ.A0K(injected.CRH(), true);
        } else if (r5 == null || !r5.CcK() || r5.A60() || r5.A5n() || r5.A5e() || r5.A5o()) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean A06(1Xj r10) {
        C250513lZ injected;
        String AZ4;
        if (182.A06(0Tu.A06, this.A02, 36324840529211812L)) {
            return false;
        }
        UserSession userSession = this.A03.A02;
        long j = 1Au.A00(userSession).A01.getLong(AnonymousClass000.A00(684), 0);
        long j2 = 1Au.A00(userSession).A01.getLong("delayed_skip_display_time_stamp", 0);
        String str = HQQ.A01;
        boolean z = true;
        if (str != null && (r10 == null || (injected = r10.A0C.getInjected()) == null || (AZ4 = injected.AZ4()) == null || !AZ4.equals(str))) {
            z = false;
        }
        if (z || HQQ.A00 || j2 == 0 || j2 <= j) {
            return false;
        }
        return true;
    }

    public final int A00(C255773uh r6) {
        if (r6.A1m()) {
            1Xj r0 = r6.A0b;
            r0.getClass();
            return Math.min((int) C297785sK.A00(r0), (int) 182.A01(0Tu.A06, this.A02, 36606315502310780L));
        }
        return (int) 182.A01(0Tu.A06, this.A02, 36606315502245243L);
    }

    public final boolean A07(1Xj r6) {
        String str;
        C250513lZ injected;
        if (A04()) {
            if (A05(r6)) {
                boolean A012 = this.A03.A01();
                boolean A06 = A06(r6);
                if (!A012 && !A06) {
                    if (this.A01) {
                        HQQ.A02 = false;
                        HQQ.A03 = false;
                        this.A01 = false;
                    }
                    if (r6 == null || (injected = r6.A0C.getInjected()) == null) {
                        str = null;
                    } else {
                        str = injected.AZ4();
                    }
                    HQQ.A01 = str;
                    return true;
                } else if (this.A01) {
                    HQQ.A02 = A012;
                    HQQ.A03 = A06;
                    this.A01 = false;
                    return false;
                }
            } else {
                this.A01 = true;
            }
        }
        return false;
    }
}
