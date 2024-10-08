package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5r6  reason: invalid class name and case insensitive filesystem */
public final class C297055r6 implements C2814457q {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final String AZ4() {
        return this.A00;
    }

    public final String C9J() {
        return this.A01;
    }

    public final String C9L() {
        return this.A02;
    }

    public final boolean CcK() {
        return this.A03;
    }

    public C297055r6(C246153e7 r4) {
        String organicTrackingToken;
        1Xj r2 = r4.A03;
        UserSession userSession = r4.A01;
        this.A01 = C297065r7.A01(userSession, r2);
        this.A03 = r2.CcK();
        this.A00 = C231122qu.A07(userSession, r2);
        if (r2.CcK()) {
            organicTrackingToken = C231122qu.A0F(userSession, r2);
        } else {
            organicTrackingToken = r2.A0C.getOrganicTrackingToken();
        }
        this.A02 = organicTrackingToken;
    }
}
