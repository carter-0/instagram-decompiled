package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2kx  reason: invalid class name and case insensitive filesystem */
public abstract class C228202kx {
    public static final C228222kz A00(UserSession userSession, AnonymousClass4DU r45, C249763kK r46) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        C249763kK r1 = r46;
        0qQ.A0B(r1, 2);
        1L5 A01 = 1L0.A01(userSession2, r1);
        0Tu r9 = 0Tu.A05;
        boolean A06 = 182.A06(r9, userSession2, 36318140376487834L);
        boolean A062 = 182.A06(r9, userSession2, 36318140377012128L);
        boolean A063 = 182.A06(r9, userSession2, 2342161149591426986L);
        AnonymousClass4DU r8 = r45;
        AnonymousClass9MF r0 = new AnonymousClass9MF(22, r8, userSession2, A01);
        AnonymousClass9MF r02 = new AnonymousClass9MF(23, r8, userSession2, A01);
        AnonymousClass9MF r03 = new AnonymousClass9MF(24, r8, userSession2, A01);
        AnonymousClass9MF r04 = new AnonymousClass9MF(25, r8, userSession2, A01);
        C377419Lt r05 = new C377419Lt(16, A01, userSession2);
        AnonymousClass9MF r06 = new AnonymousClass9MF(26, r8, userSession2, A01);
        AnonymousClass9MF r15 = new AnonymousClass9MF(27, r8, userSession2, A01);
        AnonymousClass9MF r14 = new AnonymousClass9MF(28, r8, userSession2, A01);
        AnonymousClass9MF r13 = new AnonymousClass9MF(29, r8, userSession2, A01);
        AnonymousClass9MF r12 = new AnonymousClass9MF(17, r8, userSession2, A01);
        AnonymousClass9MF r11 = new AnonymousClass9MF(18, r8, userSession2, A01);
        C377419Lt r6 = new C377419Lt(15, r8, userSession2);
        AnonymousClass9MF r5 = new AnonymousClass9MF(19, r8, userSession2, A01);
        AnonymousClass9MF r4 = new AnonymousClass9MF(20, r8, userSession2, A01);
        AnonymousClass9MF r3 = new AnonymousClass9MF(21, r8, userSession2, A01);
        return new C228222kz(r8, A01, r0, r02, r03, r04, r05, r06, r15, r14, r13, r12, r11, r6, r5, r4, r3, new AnonymousClass9MA(6, userSession2, A01, A062), A06, A062, A063, 182.A06(r9, userSession2, 36316744511394422L), 182.A06(r9, userSession2, 36318140375766927L));
    }

    public static final String A01(UserSession userSession, 1Xj r4) {
        boolean A06 = 182.A06(0Tu.A05, userSession, 36318140376160149L);
        User A2A = r4.A2A(userSession);
        if (A06) {
            if (A2A == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (A2A == null) {
            0wj.A01.AEf(002.A0R("Fail to extract author id from media for signal data, media id: ", r4.getId()), 817894654).report();
            return "";
        }
        return A2A.getId();
    }
}
