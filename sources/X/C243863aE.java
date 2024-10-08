package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3aE  reason: invalid class name and case insensitive filesystem */
public final class C243863aE implements C243873aF {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C243553Zf A01;

    public C243863aE(1Xj r1, C243553Zf r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DVJ() {
        1Xj r2 = this.A00;
        boolean A4b = r2.A4b();
        C242813Wa r0 = this.A01.A02;
        if (A4b) {
            r0.D4L(r2);
        } else {
            r0.Cx1(r2);
        }
    }

    public final boolean EsG() {
        1Xj r4 = this.A00;
        if (r4.A4t()) {
            UserSession userSession = this.A01.A00;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36320279273218242L)) {
                return true;
            }
        }
        if (!r4.A4b()) {
            return false;
        }
        UserSession userSession2 = this.A01.A00;
        0qQ.A0B(userSession2, 0);
        if (182.A06(0Tu.A05, userSession2, 36320279273283779L)) {
            return true;
        }
        return false;
    }
}
