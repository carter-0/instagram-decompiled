package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HeX  reason: case insensitive filesystem */
public abstract class C55242HeX {
    public static final Object A00(UserSession userSession, B5G b5g, AnonymousClass4D7 r5) {
        C53452Gok gok;
        C55892HpD hpD;
        C53332GmI A08;
        List list = b5g.A00;
        if (list != null && (hpD = (C55892HpD) 00k.A0J(list)) != null && (A08 = I7H.A00.A08(C51966G9m.A0P(userSession), userSession, hpD)) != null) {
            return A08;
        }
        List list2 = b5g.A01;
        if (list2 == null || (gok = (C53452Gok) 00k.A0J(list2)) == null) {
            return null;
        }
        return I7H.A00.A09(C51966G9m.A0P(userSession), gok, userSession, r5);
    }
}
