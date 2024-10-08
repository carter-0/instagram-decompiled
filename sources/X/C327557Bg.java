package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Bg  reason: invalid class name and case insensitive filesystem */
public abstract class C327557Bg {
    public static final C327577Bi A00(AnonymousClass9J6 r4, UserSession userSession) {
        AnonymousClass3U9 r42;
        boolean z;
        AnonymousClass9LX r1;
        Class cls;
        2Dr A00 = 1bJ.A00(userSession);
        if (A00 != null) {
            String str = r4.A01;
            0qQ.A0B(str, 0);
            r42 = A00.A0N(str);
        } else {
            r42 = null;
        }
        0Tu r2 = 0Tu.A06;
        boolean A06 = 182.A06(r2, userSession, 36318664362432879L);
        boolean A062 = 182.A06(r2, userSession, 36318664362367342L);
        boolean z2 = false;
        if (r42 != null) {
            z = r42.CUG();
        } else {
            z = false;
        }
        if (A06 && z) {
            z2 = true;
        }
        if (A062) {
            if (z2) {
                r1 = new AnonymousClass9LX(userSession, 22);
                cls = C68949NbY.class;
            } else {
                r1 = new AnonymousClass9LX(userSession, 23);
                cls = C68948NbX.class;
            }
        } else if (z2) {
            r1 = new AnonymousClass9LX(userSession, 24);
            cls = C389029om.class;
        } else {
            r1 = new AnonymousClass9LX(userSession, 25);
            cls = AnonymousClass78J.class;
        }
        return (C327577Bi) userSession.A01(cls, r1);
    }
}
