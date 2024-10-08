package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5CI  reason: invalid class name */
public final class AnonymousClass5CI implements AnonymousClass5CJ, AnonymousClass0lh {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public final List A01 = new ArrayList();

    public final void ENY(16V r3, String str) {
        0qQ.A0B(str, 0);
        if (!(r3 == null || r3 == 16V.A08)) {
            this.A00.put(str, r3);
            Iterator it = this.A01.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("getAuthorIds");
            }
        }
        this.A01.clear();
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
