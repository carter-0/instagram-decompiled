package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.94N  reason: invalid class name */
public final class AnonymousClass94N implements C258743zZ {
    public final Double A00;
    public final Double A01;
    public final boolean A02;
    public final C60400gq A03;

    public AnonymousClass94N(UserSession userSession) {
        1AA r3;
        Double d;
        1AV A022;
        0qQ.A0B(userSession, 1);
        183 r0 = 183.A01;
        Double d2 = null;
        if (r0 == null || (A022 = r0.A02(userSession)) == null) {
            r3 = null;
        } else {
            r3 = A022.A01.A00;
        }
        this.A03 = r3;
        boolean z = true;
        this.A02 = (r3 == null || !r3.Agw(36318715902302615L)) ? false : z;
        if (r3 != null) {
            d = Double.valueOf(r3.Ayd(37163140832624897L));
        } else {
            d = null;
        }
        this.A01 = d;
        this.A00 = r3 != null ? Double.valueOf(r3.Ayd(37163140832690434L)) : d2;
    }

    public final int Bis() {
        return 424096228;
    }

    public final long Bsd() {
        return 4320;
    }

    public final /* synthetic */ String CCQ() {
        return AAG.A01(this);
    }

    public final boolean CdU() {
        return false;
    }

    public final String BTd() {
        String C1i;
        C60400gq r2 = this.A03;
        if (r2 == null || (C1i = r2.C1i(36881665855193484L)) == null) {
            return "invalid";
        }
        return C1i;
    }

    public final String BTg() {
        String C1i;
        C60400gq r2 = this.A03;
        if (r2 == null || (C1i = r2.C1i(36881665855062411L)) == null) {
            return "invalid";
        }
        return C1i;
    }

    public final long BTh() {
        C60400gq r2 = this.A03;
        if (r2 != null) {
            return r2.BON(36600190878420721L);
        }
        return 1;
    }

    public final /* synthetic */ Integer BeZ() {
        return AnonymousClass05K.A00;
    }

    public final /* synthetic */ boolean Bux() {
        return false;
    }

    public final String CCP() {
        String C1i;
        C60400gq r2 = this.A03;
        if (r2 == null || (C1i = r2.C1i(36881665854865800L)) == null) {
            return "invalid";
        }
        return C1i;
    }

    public final String CCR() {
        String C1i;
        C60400gq r2 = this.A03;
        if (r2 == null || (C1i = r2.C1i(36881665854996874L)) == null) {
            return "invalid";
        }
        return C1i;
    }

    public final String CCS() {
        String C1i;
        C60400gq r2 = this.A03;
        if (r2 == null || (C1i = r2.C1i(36881665854931337L)) == null) {
            return "invalid";
        }
        return C1i;
    }

    public final /* synthetic */ boolean CCa() {
        return true;
    }

    public final /* synthetic */ boolean CTQ() {
        return true;
    }

    public final boolean CZg() {
        C60400gq r3 = this.A03;
        if (r3 == null || !r3.Agw(36318715901385107L)) {
            return false;
        }
        return true;
    }

    public final boolean CaD() {
        C60400gq r3 = this.A03;
        if (r3 == null || !r3.Agw(36318715902171541L)) {
            return false;
        }
        return true;
    }
}
