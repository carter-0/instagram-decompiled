package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Zq  reason: invalid class name and case insensitive filesystem */
public final class C333617Zq {
    public int A00;
    public final 02m A01 = 02m.A0p;
    public final UserSession A02;

    public final void A00(boolean z) {
        02m r3 = this.A01;
        r3.markerPoint(814286340, this.A00, "data_fetched");
        if (!z) {
            r3.markerEnd(814286340, this.A00, 2);
        }
    }

    public C333617Zq(UserSession userSession) {
        this.A02 = userSession;
    }
}
