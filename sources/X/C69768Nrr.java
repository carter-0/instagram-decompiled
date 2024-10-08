package X;

import java.util.Locale;

/* renamed from: X.Nrr  reason: case insensitive filesystem */
public abstract class C69768Nrr {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        Object A01 = r8.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        String A0k = DbW.A0k(r8, "null cannot be cast to non-null type kotlin.String");
        Object A00 = r8.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        C370818x7 r2 = new C370818x7(C308206Td.A0B(r7));
        Locale locale = Locale.ROOT;
        String upperCase = ((String) A01).toUpperCase(locale);
        0qQ.A07(upperCase);
        String upperCase2 = ((String) A00).toUpperCase(locale);
        0qQ.A07(upperCase2);
        r2.A04(upperCase, A0k, upperCase2, (String) DbT.A0q(r8, "null cannot be cast to non-null type kotlin.String", 3));
        return null;
    }
}
