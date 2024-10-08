package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.8PY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8PY implements C62320sa {
    public final /* synthetic */ AnonymousClass8PW A00;

    public /* synthetic */ AnonymousClass8PY(AnonymousClass8PW r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        ADJ adj;
        List<C255783ui> list = this.A00.A0E;
        HashSet hashSet = new HashSet();
        if (list != null) {
            for (C255783ui r2 : list) {
                if (!(r2 == null || (adj = r2.A12) == null)) {
                    adj.A09 = Float.valueOf(r2.A03);
                    adj.A0A = Float.valueOf(r2.A04);
                    adj.A0F = Integer.valueOf(r2.A09);
                    adj.A08 = Float.valueOf(r2.A02);
                    adj.A06 = Float.valueOf(r2.A00);
                    adj.A07 = Float.valueOf(r2.A01);
                    hashSet.add(adj);
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
