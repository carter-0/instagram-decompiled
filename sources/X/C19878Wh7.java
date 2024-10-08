package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Wh7  reason: case insensitive filesystem */
public final class C19878Wh7 implements Iterable {
    public List A00 = Collections.emptyList();
    public Set A01 = Collections.emptySet();
    public final Object A02 = new Object();
    public final Map A03 = new HashMap();

    public final int A00(Object obj) {
        int i;
        synchronized (this.A02) {
            Map map = this.A03;
            if (map.containsKey(obj)) {
                i = ((Integer) map.get(obj)).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final Set A01() {
        Set set;
        synchronized (this.A02) {
            set = this.A01;
        }
        return set;
    }

    public final Iterator iterator() {
        Iterator it;
        synchronized (this.A02) {
            it = this.A00.iterator();
        }
        return it;
    }
}
