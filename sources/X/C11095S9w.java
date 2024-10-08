package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.S9w  reason: case insensitive filesystem */
public abstract class C11095S9w {
    public static void A01(C10260RpK rpK, S2R s2r, Iterator it, Map map, Map map2) {
        Iterator it2 = it;
        S2R s2r2 = s2r;
        Map map3 = map2;
        if (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            S32 s32 = new S32(rpK, s2r2, A18, it2, map3, map);
            C12494SvQ svQ = rpK.A00;
            svQ.A00.Eva((C11330SNj) Pxe.A0r(A18, svQ.A01), s32, (byte[]) Pxe.A0r(A18, map));
            return;
        }
        s2r.A00((Throwable) null, map2);
    }

    public static C12494SvQ A00(C13620Tdm tdm, Set set) {
        String A0R;
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C11330SNj sNj = (C11330SNj) it.next();
            if (sNj.A00 == AnonymousClass05K.A00) {
                A0R = sNj.A05;
            } else {
                A0R = 002.A0R("RSA::", sNj.A05);
            }
            A1E.put(A0R, sNj);
        }
        return new C12494SvQ(tdm, A1E);
    }
}
