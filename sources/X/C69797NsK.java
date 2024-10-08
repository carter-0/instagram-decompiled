package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.NsK  reason: case insensitive filesystem */
public abstract class C69797NsK {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        String str;
        Object A03 = r7.A03(0);
        if (A03 instanceof String) {
            str = (String) A03;
        } else {
            str = null;
        }
        Object A02 = r7.A02();
        if (!(A02 instanceof String)) {
            A02 = null;
        }
        2Dm A00 = 2L2.A00(C308206Td.A0B(r6));
        A00.A8r(new DirectThreadKey(str, (List) null), (String) null);
        if (0qQ.A0K(A02, "CLEAR_USER")) {
            A00.A8d(new DirectThreadKey(str, (List) null), false);
        }
        return null;
    }
}
