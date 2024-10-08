package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Rpa  reason: case insensitive filesystem */
public final class C10276Rpa {
    public final Map A00 = AnonymousClass7TE.A1E();

    public C10276Rpa(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.A00.put(C10092RmU.class, ((C10275RpZ) it.next()).A00);
        }
    }
}
