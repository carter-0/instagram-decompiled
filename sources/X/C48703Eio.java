package X;

import com.facebook.AccessToken;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.Eio  reason: case insensitive filesystem */
public abstract class C48703Eio {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.1qK, java.lang.Object] */
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        Object A01 = r14.A01();
        String A0p = DbS.A0p(A01);
        String str = (String) A01;
        0qQ.A0C(r14.A03(1), A0p);
        String A0p2 = DbX.A0p(r14, A0p);
        0lg A0B = C308206Td.A0B(r13);
        0qQ.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        if (A0p2.length() == 0) {
            0qQ.A0B(A0B, 1);
            1KM.A02(A0B, true);
        } else {
            Date date = AccessToken.A0A;
            new AccessToken(AnonymousClass05K.A1F, A0p2, AnonymousClass1KO.A02, str, EW3.A04.A00, (Collection) null, (Date) null, new Date());
            UserSession A0B2 = C308206Td.A0B(r13);
            0qQ.A0C(A0B2, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            UserSession userSession = A0B2;
            1Au.A00(userSession).A0o(userSession);
        }
        AnonymousClass1Nd.A00(A0B).A00(new Object());
        return null;
    }
}
