package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Qoc extends C11335SNp {
    public Map A00 = new HashMap(4);

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String valueOf = String.valueOf(A1J.getKey());
            A1E.put(Pxg.A0s("dimension", valueOf, Pxe.A14(Pxf.A09(valueOf) + 9)), A1J.getValue());
        }
        return C11335SNp.A00(0, A1E);
    }
}
