package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class GEU {
    public static final AnonymousClass2vG A00(UserSession userSession, C233172vA r14, AnonymousClass4DU r15, JPY jpy, C54575HJk hJk, AnonymousClass93T r18, String str, String str2) {
        AnonymousClass2vG A00;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r7 = r15;
        String str3 = str;
        String str4 = str2;
        C51974G9v.A1O(userSession, str3, str4, r15);
        C54575HJk hJk2 = hJk;
        AnonymousClass93T r3 = r18;
        AnonymousClass7TG.A1S(hJk2, r3);
        IYG iyg = new IYG(userSession, 1);
        boolean A03 = 1P7.A03(userSession);
        C233192vD A002 = GEV.A00(str4);
        String str5 = r3.A01;
        C233172vA r6 = r14;
        JPY jpy2 = jpy;
        if (A03) {
            A00 = C55154Hd4.A00(userSession2, iyg, A002, new GEX(hJk2, userSession2, r6, r7, new IYF(r3), iyg, jpy2, hJk2, str5), str3, str3, str3);
        } else {
            A00 = C233232vL.A00(userSession2, iyg, A002, new GEX(hJk2, userSession2, r6, r7, new GEW(r3), iyg, jpy2, hJk2, str5), str3);
            0qQ.A0A(A00);
        }
        if (!182.A06(0Tu.A05, userSession2, 36318509744920756L)) {
            return A00;
        }
        GHF ghf = new GHF();
        0qQ.A0B(A00, 0);
        List list = ghf.A00;
        list.add(A00);
        C3728893a A01 = AnonymousClass93Z.A01(userSession2);
        if (A01 != null) {
            list.add(A01);
        }
        return ghf;
    }
}
