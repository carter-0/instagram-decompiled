package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8BT  reason: invalid class name */
public abstract class AnonymousClass8BT {
    public static final ArrayList A00(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AnonymousClass8BU(((Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
