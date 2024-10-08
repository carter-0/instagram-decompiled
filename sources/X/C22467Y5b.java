package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Y5b  reason: case insensitive filesystem */
public final class C22467Y5b extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ Y44 A00;

    public C22467Y5b(Y44 y44) {
        this.A00 = y44;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Y44 y44 = this.A00;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int A002 = Y44.A00(y44, key);
        if (A002 < 0) {
            return false;
        }
        Object obj2 = y44.A03[(A002 << 1) + 1];
        if (value == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (value.equals(obj2)) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new XIO(this.A00);
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Y44 y44 = this.A00;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int A002 = Y44.A00(y44, key);
        if (A002 < 0) {
            return false;
        }
        Object obj2 = y44.A03[(A002 << 1) + 1];
        if (value == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!value.equals(obj2)) {
            return false;
        }
        Y44.A03(y44, A002);
        return true;
    }

    public final int size() {
        return this.A00.size();
    }
}
