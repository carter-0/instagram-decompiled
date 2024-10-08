package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Stj  reason: case insensitive filesystem */
public final class C12407Stj implements 2FO {
    public final Stl A00;

    public final void Cgl(String str, Map map) {
        0qQ.A0B(str, 0);
        if (map != null) {
            HashMap A19 = Pxe.A19(map);
            C268194cw r5 = new C268194cw(C269474fB.A00);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                Object value = A1J.getValue();
                if (value instanceof Integer) {
                    r5.A0C(A13, AnonymousClass7TE.A0M(value));
                } else {
                    r5.A0E(A13, DbX.A0t(value));
                }
            }
            A19.put(AnonymousClass000.A00(3725), DbT.A10(r5));
            this.A00.Cgl(str, Collections.unmodifiableMap(A19));
        }
    }

    public C12407Stj(0lg r4) {
        AnonymousClass0kM r1 = new AnonymousClass0kM(r4);
        r1.A01 = "payflows";
        0wc A002 = r1.A00();
        this.A00 = new Stl(A002, new 2FN(A002));
    }
}
