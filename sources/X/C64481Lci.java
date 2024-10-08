package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Lci  reason: case insensitive filesystem */
public abstract class C64481Lci implements 1Fb {
    public static void A00(17Z r4, Map map, Map map2) {
        r4.A0c();
        ArrayList A0f = JTQ.A0f(map);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            Object value = A1J.getValue();
            r4.A0q(A13);
            r4.A0J(value);
            A0f.add(C60340gF.A00);
        }
        ArrayList A0f2 = JTQ.A0f(map2);
        Iterator A0u2 = AnonymousClass7TF.A0u(map2);
        while (A0u2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
            String A132 = DbT.A13(A1J2);
            Object value2 = A1J2.getValue();
            r4.A0q(A132);
            r4.A0J(value2);
            A0f2.add(C60340gF.A00);
        }
        r4.A0Z();
    }
}
