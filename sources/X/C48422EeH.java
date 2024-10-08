package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.EeH  reason: case insensitive filesystem */
public abstract class C48422EeH {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        String A0g = DbY.A0g(r6);
        boolean A1W = DbW.A1W(r6, 1);
        UserSession A01 = 0Gl.A01(C308206Td.A0B(r5));
        if (A01 == null) {
            return null;
        }
        AnonymousClass7TF.A0Q(A01).A03.EYe(true);
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!A1W) {
            return null;
        }
        1Ng A00 = AnonymousClass1Nd.A00(A01);
        List unmodifiableList = Collections.unmodifiableList(A1C);
        0qQ.A07(unmodifiableList);
        A00.A00(new C323526xd(A0g, unmodifiableList));
        return null;
    }
}
