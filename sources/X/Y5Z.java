package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class Y5Z extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C2807854a A00;

    public Y5Z(C2807854a r1) {
        this.A00 = r1;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            C2807854a r3 = this.A00;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AnonymousClass54c r1 = null;
            if (key != null) {
                try {
                    r1 = r3.A04(key, false);
                } catch (ClassCastException unused) {
                }
                if (r1 == null || !2Ob.A00(r1.A06, entry.getValue())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return new XPE(this);
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        C2807854a r3 = this.A00;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        AnonymousClass54c r2 = null;
        if (key == null) {
            return false;
        }
        try {
            r2 = r3.A04(key, false);
        } catch (ClassCastException unused) {
        }
        if (r2 == null || !2Ob.A00(r2.A06, entry.getValue())) {
            return false;
        }
        r3.A05(r2, true);
        return true;
    }

    public final int size() {
        return this.A00.A01;
    }
}
