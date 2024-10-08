package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4dE  reason: invalid class name and case insensitive filesystem */
public final class C268344dE implements AnonymousClass0lh {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.clear();
    }

    public final void A00(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C268364dG r2 = (C268364dG) it.next();
            this.A00.put(r2.A07, r2);
        }
    }
}
