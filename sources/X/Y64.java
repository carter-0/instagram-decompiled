package X;

import java.util.Iterator;
import java.util.Map;

public final class Y64 extends 047 {
    public final C286845Ya A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.5Ya] */
    public final int A00() {
        return this.A00.size();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.5Ya] */
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractMap, X.5Ya] */
    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        ? r2 = this.A00;
        Object obj2 = r2.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != null) {
            return obj2.equals(value);
        }
        if (value != null || !r2.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new C22438Y3u(this.A00);
    }

    public final /* bridge */ boolean remove(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        return this.A00.remove(entry.getKey(), entry.getValue());
    }

    public Y64(C286845Ya r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C66580MXl.A11();
    }

    public Y64() {
    }
}
