package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ekv  reason: case insensitive filesystem */
public abstract class C48833Ekv {
    public static final List A00(List list) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((C68303N9q) it.next()).getId());
        }
        return A0r;
    }
}
