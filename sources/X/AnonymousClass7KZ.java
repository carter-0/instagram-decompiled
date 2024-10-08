package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7KZ  reason: invalid class name */
public final class AnonymousClass7KZ extends AnonymousClass7KY {
    public final boolean A05() {
        2Er r0;
        if (((C329757Kc) this.A05.invoke()).CON() && !((Boolean) this.A06.invoke()).booleanValue() && !A01() && A03() && (((r0 = this.A01) == null || !r0.CbX()) && ((Boolean) this.A02.A04.getValue()).booleanValue())) {
            if (!182.A06(0Tu.A05, this.A00, 36324136150118217L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A06(boolean z) {
        2Er r2;
        long j;
        if (((C329757Kc) this.A05.invoke()).CWc() && !((Boolean) this.A06.invoke()).booleanValue() && !A01() && A03() && (r2 = this.A01) != null && !r2.CbX() && r2.BBQ() && ((Boolean) this.A02.A09.getValue()).booleanValue()) {
            UserSession userSession = this.A00;
            0Tu r22 = 0Tu.A05;
            if (z) {
                j = 36321125378040961L;
            } else {
                j = 36321125378303107L;
            }
            boolean A06 = 182.A06(r22, userSession, j);
            0qQ.A0A(Boolean.valueOf(A06));
            if (!A06) {
                return false;
            }
            return true;
        }
        return false;
    }
}
