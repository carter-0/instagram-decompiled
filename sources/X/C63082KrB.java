package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.equity.diversity.DiversityInfoRepository;

/* renamed from: X.KrB  reason: case insensitive filesystem */
public abstract class C63082KrB {
    /* JADX WARNING: type inference failed for: r0v7, types: [X.1pi, java.lang.Object] */
    public static final Object A00(C307896Rx r4) {
        UserSession A0W = DbX.A0W(r4);
        if (C66631pj.A00 == null) {
            C66631pj.A00 = new Object();
        }
        C66631pj.A00();
        0qQ.A0B(A0W, 0);
        DiversityInfoRepository A00 = C63496Ky2.A00(A0W);
        String str = A0W.A06;
        UserSession userSession = A00.A00;
        0qQ.A0B(userSession, 0);
        ((C64822Lii) userSession.A01(C64822Lii.class, MM0.A00)).A00.remove(str);
        DbX.A1W(A00, str, A00.A02, 42);
        return null;
    }
}
