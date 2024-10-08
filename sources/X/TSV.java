package X;

import java.util.LinkedHashMap;
import java.util.Map;

public final class TSV<K, V> extends LinkedHashMap<K, V> {
    public int A00;

    public final boolean removeEldestEntry(Map.Entry entry) {
        return C51970G9q.A1W(size(), this.A00);
    }
}
