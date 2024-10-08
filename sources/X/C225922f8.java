package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2f8  reason: invalid class name and case insensitive filesystem */
public final class C225922f8 extends LinkedHashMap<String, C243373Ym> {
    public final /* synthetic */ C225892f5 A00;

    public C225922f8(C225892f5 r1) {
        this.A00 = r1;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
