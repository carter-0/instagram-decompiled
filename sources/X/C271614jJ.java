package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.4jJ  reason: invalid class name and case insensitive filesystem */
public final class C271614jJ {
    public static final C271614jJ A00 = new Object();

    public final AnonymousClass50X A00(UserSession userSession, 1Xj r6, AnonymousClass4DU r7, AnonymousClass3W1 r8) {
        0qQ.A0B(r6, 1);
        0qQ.A0B(r8, 2);
        0qQ.A0B(r7, 3);
        int A15 = r6.A15(userSession);
        0sn A3A = r6.A3A();
        if (A3A == null) {
            A3A = 0sn.A00;
        }
        r8.A07(A15, -1);
        ArrayList A3A2 = r6.A3A();
        boolean z = false;
        if (A3A2 == null || A3A2.isEmpty() || r8.A20 || !C246413eY.A00(userSession).A02(r7, r6, r6) || AnonymousClass3eZ.A01(userSession, r6, false)) {
            z = true;
        }
        return new AnonymousClass50X(r8, A3A, A15, z);
    }
}
