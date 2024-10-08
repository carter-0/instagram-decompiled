package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GUq  reason: case insensitive filesystem */
public abstract class C52488GUq {
    public static final AnonymousClass2vG A00(UserSession userSession, C233172vA r10, AnonymousClass4DU r11, String str, String str2, int i) {
        UserSession userSession2 = userSession;
        IYG iyg = new IYG(userSession, 2);
        boolean A03 = 1P7.A03(userSession);
        C233192vD A00 = GEV.A00(str2);
        C52486GUo gUo = new C52486GUo(userSession2, r10, r11, iyg, str, i);
        if (A03) {
            return C55154Hd4.A00(userSession2, iyg, A00, gUo, str, str, str);
        }
        AnonymousClass2vG A002 = C233232vL.A00(userSession2, iyg, A00, gUo, str);
        0qQ.A0A(A002);
        return A002;
    }
}
