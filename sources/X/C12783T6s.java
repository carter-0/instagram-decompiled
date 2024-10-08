package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.T6s  reason: case insensitive filesystem */
public final class C12783T6s implements AnonymousClass6SD {
    public final 0vq A00 = new 0vq(6);
    public final S53 A01;

    public final void A7d(String str) {
        0qQ.A0B(str, 0);
        this.A00.A09(str);
        S53 s53 = this.A01;
        Map map = s53.A09;
        if (!map.containsKey(str)) {
            map.put(str, (Object) null);
            s53.A03.A01(new Q3P(str, (Object) null));
        }
    }

    public final void A7n(Iterable iterable) {
        this.A00.A08(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            S53 s53 = this.A01;
            Map map = s53.A09;
            if (!map.containsKey(A18)) {
                map.put(A18, (Object) null);
                s53.A03.A01(new Q3P(A18, (Object) null));
            }
        }
    }

    public C12783T6s(S53 s53) {
        this.A01 = s53;
        0vq r0 = AnonymousClass01q.A00;
    }
}
