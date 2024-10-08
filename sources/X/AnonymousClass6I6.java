package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6I6  reason: invalid class name */
public final class AnonymousClass6I6 implements SubcomposeSlotReusePolicy {
    public final AnonymousClass6I5 A00;
    public final Map A01 = new LinkedHashMap();

    public final boolean ACG(Object obj, Object obj2) {
        AnonymousClass6I5 r0 = this.A00;
        return 0qQ.A0K(r0.A00(obj), r0.A00(obj2));
    }

    public final void Bwt(AnonymousClass6IN r6) {
        int i;
        Map map = this.A01;
        map.clear();
        Iterator it = r6.iterator();
        while (it.hasNext()) {
            Object A002 = this.A00.A00(it.next());
            Number number = (Number) map.get(A002);
            if (number != null) {
                i = number.intValue();
                if (i == 7) {
                    it.remove();
                }
            } else {
                i = 0;
            }
            map.put(A002, Integer.valueOf(i + 1));
        }
    }

    public AnonymousClass6I6(AnonymousClass6I5 r2) {
        this.A00 = r2;
    }
}
