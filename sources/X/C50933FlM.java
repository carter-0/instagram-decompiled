package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FlM  reason: case insensitive filesystem */
public final class C50933FlM implements G7L {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C50933FlM(C307896Rx r1, C277014uI r2, C277014uI r3, UserSession userSession, int i) {
        this.A00 = i;
        this.A04 = userSession;
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
    }

    public final void DED() {
        DbZ.A1V((C307896Rx) this.A01, this.A02);
    }

    public final void Don(boolean z, boolean z2) {
        int i = this.A00;
        C294055lm A002 = C294045ll.A00((UserSession) this.A04);
        if (1 - i != 0) {
            A002.A01(AnonymousClass05K.A00, z, false);
        } else {
            A002.A01(AnonymousClass05K.A01, z2, false);
        }
        DbZ.A1V((C307896Rx) this.A01, this.A03);
    }
}
