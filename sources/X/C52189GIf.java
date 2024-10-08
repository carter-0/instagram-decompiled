package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GIf  reason: case insensitive filesystem */
public final class C52189GIf implements C243873aF {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C52187GId A01;

    public C52189GIf(1Xj r1, C52187GId gId) {
        this.A01 = gId;
        this.A00 = r1;
    }

    public final void DVJ() {
        C52187GId gId = this.A01;
        AnonymousClass3W1 r4 = gId.A02.A0E;
        if (r4 != null) {
            1Xj r3 = this.A00;
            gId.A05.C41().Duu(r3, r4, r3.A4b(), true);
        }
    }

    public final boolean EsG() {
        if (this.A00.A4b()) {
            UserSession userSession = this.A01.A04;
            if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36320279273283779L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
