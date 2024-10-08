package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3LA  reason: invalid class name */
public final class AnonymousClass3LA<K, V> extends LinkedHashMap<K, V> {
    public final int A00;

    public AnonymousClass3LA(int i) {
        this.A00 = i;
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.A00) {
            return true;
        }
        return false;
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }
}
