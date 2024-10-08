package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EeG  reason: case insensitive filesystem */
public abstract class C48421EeG {
    public static Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        List list = (List) r6.A01();
        boolean A1W = DbW.A1W(r6, 1);
        UserSession A01 = 0Gl.A01(C308206Td.A0B(r5));
        if (A01 == null) {
            return null;
        }
        AnonymousClass7TF.A0Q(A01).A03.EYe(true);
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!A1W || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1Nd.A00(A01).A00(new C323526xd(AnonymousClass7TE.A18(it), Collections.unmodifiableList(A1C)));
        }
        return null;
    }
}
