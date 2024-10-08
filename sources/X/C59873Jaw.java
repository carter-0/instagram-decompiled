package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.Jaw  reason: case insensitive filesystem */
public final class C59873Jaw implements Iterable, C62650uo {
    public C59874Jax A00;
    public final LinkedList A01 = new LinkedList();

    public final C59796JYp A01() {
        Object obj;
        LinkedList linkedList = this.A01;
        if (!linkedList.isEmpty()) {
            obj = 00k.A0K(linkedList);
        } else {
            obj = null;
        }
        return (C59796JYp) obj;
    }

    public final void A02(Object obj) {
        this.A01.add(obj);
        C59874Jax jax = this.A00;
        if (jax != null) {
            C59796JYp jYp = (C59796JYp) obj;
            for (C66523MVb D3P : jax.A00.A02) {
                D3P.D3P(jYp);
            }
        }
    }

    public final Iterator iterator() {
        return new C59875Jay(this);
    }

    public final int A00() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += (int) Math.max(0, ((C59796JYp) it.next()).A03);
        }
        return i;
    }
}
