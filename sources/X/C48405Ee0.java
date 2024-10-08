package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Ee0  reason: case insensitive filesystem */
public abstract class C48405Ee0 {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        Object obj;
        String A0g = DbY.A0g(r8);
        int A04 = DbW.A04(r8.A03(1), "null cannot be cast to non-null type kotlin.Number");
        C307786Rm r0 = r7.A03;
        if (r0 != null) {
            AnonymousClass2XD.A00(r0.A00);
            Iterator it = ((Collection) AnonymousClass2XL.A02.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (00p.A0j(((2Xa) obj).A09, A0g, true)) {
                    break;
                }
            }
            2Xa r1 = (2Xa) obj;
            if (r1 != null) {
                r1.A01(((2XX) r1.A07.A00.get(A04)).A01);
            }
        }
        return null;
    }
}
