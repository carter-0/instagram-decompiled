package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.HDm  reason: case insensitive filesystem */
public final class C54437HDm extends C252733pa {
    public final 1Ng A00;
    public final UserSession A01;
    public final 1E8 A02;

    public static final void A00(C54437HDm hDm, String str, String str2, boolean z) {
        hDm.A01(str, z, 182.A06(0Tu.A05, hDm.A01, 36327688088533620L));
        if (str2 != null) {
            hDm.A01(str2, z, false);
        }
    }

    private final void A01(String str, boolean z, boolean z2) {
        C274354oA A0x;
        User A2A;
        1E8 r3 = this.A02;
        1Xj A022 = r3.A02(str);
        if (A022 != null && (A0x = C51966G9m.A0x(A022)) != null) {
            HB4 A002 = C274354oA.A00.A00();
            A002.A0Q = Boolean.valueOf(z);
            if (C21519Xdl.A00(A0x, A002.A01()) != null) {
                if (z2 && (A2A = A022.A2A(this.A01)) != null) {
                    A2A.A17(z);
                }
                r3.A03(A022);
                UserSession userSession = this.A01;
                if (182.A06(DbS.A0J(userSession, 0), userSession, 36327688088074864L)) {
                    1sd.A00(userSession).A02(A022, z);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54437HDm(UserSession userSession) {
        super("barcelona_algo_tune", AnonymousClass43D.A00(1721950311));
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        1E8 A003 = 1E7.A00(userSession);
        this.A01 = userSession;
        this.A00 = A002;
        this.A02 = A003;
    }
}
