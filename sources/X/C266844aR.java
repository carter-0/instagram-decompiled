package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4aR  reason: invalid class name and case insensitive filesystem */
public final class C266844aR {
    public static final 0bY A05 = new 1Q7("IgSecureUriParser").A00;
    public static final String A06 = C266844aR.class.getName();
    public C241943Rz A00;
    public final 16e A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;

    public C266844aR(UserSession userSession, boolean z, boolean z2) {
        C241943Rz A002;
        0qQ.A0B(userSession, 1);
        this.A04 = z;
        this.A03 = z2;
        16d r0 = 16d.A06;
        0qQ.A08(r0);
        this.A01 = r0;
        if (182.A06(0Tu.A05, userSession, 36320790370591584L)) {
            A002 = C241923Rx.A00(userSession);
        } else {
            A002 = Ky0.A00(userSession);
        }
        this.A00 = A002;
        this.A02 = userSession;
    }
}
