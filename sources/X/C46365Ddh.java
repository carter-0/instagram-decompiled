package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ddh  reason: case insensitive filesystem */
public final class C46365Ddh {
    public UserSession A00;
    public boolean A01;

    public static synchronized void A00(C46365Ddh ddh, boolean z) {
        synchronized (ddh) {
            ddh.A01 = z;
        }
    }

    public final synchronized void A01(C46361Ddd ddd) {
        synchronized (this) {
            if (!this.A01) {
                A00(this, true);
                C239113Fa r0 = new C239113Fa(C41845B3m.A04(), C46363Ddf.class, "IGPaymentsAccountDisabledRiskQuery", false);
                UserSession userSession = this.A00;
                1OC A002 = C46479Dfi.A00(r0, userSession);
                EDV.A00(A002, this, ddd, 37);
                1ES.A05(A002, 216, 3, 182.A06(0Tu.A05, userSession, 36328216370494549L), false);
            }
        }
    }
}
