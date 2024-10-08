package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vof  reason: case insensitive filesystem */
public abstract class C18265Vof {
    public static final C17869VhM A00(UserSession userSession, C16580Uxa uxa) {
        0qQ.A0B(userSession, 0);
        1QP A00 = AnonymousClass1QO.A00(userSession);
        C66466MSu A01 = A01(userSession);
        C51972G9s.A1C(A00, A01);
        return new C17869VhM(A00, uxa, A01, A00.generateNewFlowId(383984041));
    }

    public static final C66466MSu A01(UserSession userSession) {
        C66466MSu mSu;
        0Tu r3 = 0Tu.A06;
        if (!182.A06(r3, userSession, 36314996460293042L) || ((double) 2SP.A01.A06(1, 100)) > 182.A00(r3, userSession, 37159421390356577L) * 100.0d) {
            mSu = C19634Wcx.A00;
        } else {
            mSu = (C64836Liy) userSession.A01(C64836Liy.class, new C13999To1(userSession, 12));
        }
        return mSu;
    }
}
