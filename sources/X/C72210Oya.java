package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Oya  reason: case insensitive filesystem */
public final class C72210Oya implements 0lm {
    public final Map A00 = AnonymousClass7TE.A1H();

    public final synchronized void onUserSessionWillEnd(boolean z) {
        Map map = this.A00;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            Collection values = ((Map) A0v.next()).values();
            ArrayList<0lm> A1C = AnonymousClass7TE.A1C();
            for (Object next : values) {
                if (next instanceof 0lm) {
                    A1C.add(next);
                }
            }
            for (0lm onUserSessionWillEnd : A1C) {
                onUserSessionWillEnd.onUserSessionWillEnd(z);
            }
        }
        map.clear();
    }
}
