package X;

import com.instagram.common.session.UserSession;

public abstract class GFM {
    public static final 2WX A00(C238863Ds r12, 2WX r13, C59543JNp jNp, C267324bN r15, UserSession userSession, AnonymousClass4DU r17, Integer num, boolean z, boolean z2) {
        0qQ.A0B(r15, 1);
        AnonymousClass4DU r9 = r17;
        0qQ.A0B(r9, 2);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        AnonymousClass9JS r1 = new AnonymousClass9JS(AnonymousClass05K.A00, new C244233ar(GGA.A00, new GG9(r12, jNp, r15, userSession2, r9, num, z, z2)), 2);
        if (r13 == 2WX.A02) {
            r13 = null;
        }
        return new 2WX(r13, r1);
    }

    public static final 2WX A01(C238863Ds r8, 2WX r9, C267324bN r10, UserSession userSession, AnonymousClass4DU r12) {
        return A00(r8, r9, (C59543JNp) null, r10, userSession, r12, (Integer) null, false, false);
    }

    public static final 2WX A02(C238863Ds r8, 2WX r9, C267324bN r10, UserSession userSession, AnonymousClass4DU r12, boolean z) {
        return A00(r8, r9, (C59543JNp) null, r10, userSession, r12, (Integer) null, false, z);
    }

    public static final 2WX A03(C238863Ds r6, 2WX r7, UserSession userSession, AnonymousClass4DU r9, 0sP r10) {
        AnonymousClass7TG.A1O(userSession, r9);
        return C51973G9u.A0Z(r7, new C58767IxE(0, r10, r6, (Object) null, new C52046GCs(userSession, r9)));
    }
}
