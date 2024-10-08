package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kqq  reason: case insensitive filesystem */
public abstract class C63061Kqq {
    public static final LGV A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Class<LGV> cls = LGV.class;
        LGV lgv = (LGV) userSession.A00(cls);
        if (lgv != null) {
            return lgv;
        }
        LGV lgv2 = new LGV(AnonymousClass0kN.A02(userSession));
        userSession.A04(cls, lgv2);
        return lgv2;
    }
}
