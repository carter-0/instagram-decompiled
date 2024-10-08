package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Vgj  reason: case insensitive filesystem */
public final class C17830Vgj {
    public final int A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();

    public final void A00() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A01);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            02m.A0p.markerAnnotate(this.A00, DbT.A13(A1J), (String) A1J.getValue());
        }
        02m.A0p.markerEnd(this.A00, 467);
    }

    public C17830Vgj(int i) {
        this.A00 = i;
    }
}
