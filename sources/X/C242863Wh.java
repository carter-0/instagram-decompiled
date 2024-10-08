package X;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Wh  reason: invalid class name and case insensitive filesystem */
public final class C242863Wh {
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();

    public final void A00(C242843Wf r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj == null || obj.equals(r3)) {
                it.remove();
            }
        }
    }
}
