package X;

import java.util.LinkedHashMap;
import java.util.Map;

public final class TSW extends LinkedHashMap {
    public TSW() {
        super(1, 0.75f, true);
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        return C51970G9q.A1W(size(), 10);
    }
}
