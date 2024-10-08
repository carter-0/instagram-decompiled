package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.V8y  reason: case insensitive filesystem */
public abstract class C16869V8y {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        HashMap hashMap;
        Object A03 = r11.A03(0);
        0qQ.A0C(A03, C66579MXk.A00(0));
        boolean z = true;
        C277014uI A0P = DbW.A0P(r11, 1);
        AbstractCollection abstractCollection = (AbstractCollection) r11.A00();
        Object obj = r11.A00.get(3);
        UserSession A0A = C308206Td.A0A((C307786Rm) A03);
        DbS.A1Z(A0A);
        UserSession userSession = A0A;
        VPL A04 = W3U.A04(userSession);
        if (abstractCollection == null || obj == null) {
            if (A04 == null) {
                z = false;
            }
            DbX.A1P(r10, new C308276Tl(), A0P, Boolean.valueOf(z), 0);
            return null;
        }
        C277014uI r5 = ((C280064zw) obj).A00;
        VPK A032 = W3U.A03(userSession);
        Iterator A1G = AnonymousClass7TE.A1G(abstractCollection);
        while (A1G.hasNext()) {
            String str = (String) AnonymousClass7TF.A0a(A1G);
            if ((A032 == null || (hashMap = A032.A00) == null || !hashMap.containsKey(str)) && (!new 11S("\\d+").A08(str) || A04 == null)) {
                DbX.A1P(r10, new C308276Tl(), r5, str, 0);
                return null;
            }
        }
        DbX.A1P(r10, new C308276Tl(), r5, (Object) null, 0);
        return null;
    }
}
