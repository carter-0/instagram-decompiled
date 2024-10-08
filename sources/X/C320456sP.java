package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6sP  reason: invalid class name and case insensitive filesystem */
public final class C320456sP {
    public final 1se A00;

    public final ArrayList A00(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C267324bN r2 = (C267324bN) it.next();
            1se r0 = this.A00;
            if (!r0.A00.getBoolean(r2.getId(), false)) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    public C320456sP(1se r1) {
        this.A00 = r1;
    }
}
