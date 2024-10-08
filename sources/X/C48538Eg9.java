package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eg9  reason: case insensitive filesystem */
public abstract class C48538Eg9 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.FW4, X.1qK, java.lang.Object] */
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String A0c = Dbb.A0c(r8);
        0qQ.A07(A0c);
        int A04 = DbW.A04(r8.A02(), "null cannot be cast to non-null type kotlin.Int");
        C277014uI A0O = DbW.A0O(r8);
        UserSession A0W = DbX.A0W(r7);
        User A0j = DbV.A0j(A0W, A0c);
        if (A0j != null) {
            0qQ.A0B(A0W, 2);
            1Ng A00 = AnonymousClass1Nd.A00(A0W);
            ? obj = new Object();
            obj.A01 = A0j;
            obj.A00 = A04;
            A00.A00(obj);
        } else {
            AnonymousClass441.A02.A02(A0W, new C51021FnD(A0W, A04, 1), A0c);
        }
        DbS.A1Q(r7, A0O);
        return null;
    }
}
