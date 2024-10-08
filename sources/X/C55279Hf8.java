package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hf8  reason: case insensitive filesystem */
public abstract class C55279Hf8 {
    public static final AnonymousClass2vG A00(UserSession userSession, C233172vA r8, AnonymousClass4DU r9, String str, String str2) {
        UserSession userSession2 = userSession;
        IYG iyg = new IYG(userSession, 3);
        boolean A03 = 1P7.A03(userSession);
        C233192vD A00 = GEV.A00(str2);
        String str3 = str;
        HF2 hf2 = new HF2(userSession, r8, r9, iyg, str3);
        if (A03) {
            return C55154Hd4.A00(userSession2, iyg, A00, hf2, str3, str3, str3);
        }
        AnonymousClass2vG A002 = C233232vL.A00(userSession, iyg, A00, hf2, str3);
        0qQ.A0A(A002);
        return A002;
    }
}
