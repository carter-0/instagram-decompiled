package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Rfr  reason: case insensitive filesystem */
public abstract class C9733Rfr {
    public static void A00(C239023El r2, Appendable appendable, String str, Iterator it) {
        if (it.hasNext()) {
            while (true) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                appendable.append(r2.A01(A1J.getKey()));
                appendable.append(str);
                appendable.append(r2.A01(A1J.getValue()));
                if (it.hasNext()) {
                    appendable.append(r2.A00);
                } else {
                    return;
                }
            }
        }
    }
}
