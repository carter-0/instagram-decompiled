package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.OJl  reason: case insensitive filesystem */
public final class C70740OJl {
    public final /* synthetic */ List A00;

    public C70740OJl(List list) {
        this.A00 = list;
    }

    public final void A00() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            DbY.A0G(JTO.A0H(it)).start();
        }
    }
}
