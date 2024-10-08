package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eqd  reason: case insensitive filesystem */
public abstract class C49172Eqd {
    public static final 1XP A00(16F r16, UserSession userSession) {
        1XQ r4 = new 1XQ();
        16F r5 = r16;
        if (r5.A11() == 16L.A0D) {
            while (true) {
                16L A1J = r5.A1J();
                16L r3 = 16L.A09;
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r5);
                0qQ.A0A(A17);
                0qQ.A0B(A17, 2);
                if (!AnonymousClass000.A00(611).equals(A17)) {
                    1XY.A01(r5, r4, A17);
                } else {
                    while (r5.A1J() != r3) {
                        C320136rp r7 = new C320136rp((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, false, false);
                        String A0q = r5.A0q();
                        if (A0q != null) {
                            UserSession userSession2 = userSession;
                            User A0j = DbV.A0j(userSession2, A0q);
                            r5.A1J();
                            while (r5.A1J() != r3) {
                                C320146rq.A00(r5, r7, AnonymousClass7TE.A17(r5));
                            }
                            if (A0j != null) {
                                C294695ms.A00(userSession2).A0C(r7, A0j, (String) null);
                                if (r5 instanceof 0c9) {
                                    ((0c9) r5).A1U(A0j, true);
                                }
                            }
                        }
                    }
                }
                r5.A0z();
            }
        } else {
            r5.A0z();
        }
        return r4;
    }
}
