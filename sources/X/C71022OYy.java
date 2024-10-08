package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OYy  reason: case insensitive filesystem */
public final class C71022OYy {
    public static final C71022OYy A00 = new Object();

    public static final Object A00(C307896Rx r3, String str, C62320sa r5, 0sP r6) {
        0qQ.A0B(str, 1);
        UserSession A0R = DbW.A0R(r3);
        if (!C66580MXl.A1X(A0R, str)) {
            r5.invoke();
            return null;
        }
        AnonymousClass4D6 A0C = C308206Td.A0C(r3);
        1NY A0a = AnonymousClass7TG.A0a(A0R);
        A0a.A0A("fxcal/get_native_linking_auth_blob/");
        1OC A0S = DbU.A0S(A0a, CFM.class, D1I.class);
        A0S.A00 = new CHB(0, r6, r5);
        A0C.schedule(A0S);
        return null;
    }

    public final Object A01(C307896Rx r6, AnonymousClass6Tm r7) {
        String A0g = DbY.A0g(r7);
        C277014uI r3 = ((C280064zw) r7.A02()).A00;
        return A00(r6, A0g, new C58716IwP(r6, r3, 34), new C59101J6j(r6, r3, 13));
    }
}
