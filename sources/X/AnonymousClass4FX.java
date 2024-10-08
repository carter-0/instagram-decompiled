package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4FX  reason: invalid class name */
public abstract class AnonymousClass4FX {
    public static final float A00(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            1Xj r1 = (1Xj) obj;
            if (!r1.A5p()) {
                if (r1.CeS()) {
                    break;
                }
            } else {
                break;
            }
        }
        1Xj r2 = (1Xj) obj;
        if (r2 != null) {
            return r2.A0l();
        }
        return -1.0f;
    }

    public static final void A01(1Xj r1, AnonymousClass3W1 r2) {
        if (r1.A56()) {
            int A0o = r1.A0o() - 1;
            r2.A0A(Math.min(r2.A02, A0o));
            r2.A0B(Math.min(r2.A03, A0o));
            r2.A09 = Math.min(r2.A09, A0o);
        }
    }
}
