package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7A1  reason: invalid class name */
public final class AnonymousClass7A1 extends LinkedHashMap<K, V> {
    public final /* synthetic */ AnonymousClass7A0 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7A1(AnonymousClass7A0 r3, int i) {
        super(i, 0.75f, true);
        this.A00 = r3;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.A00.A00) {
            return true;
        }
        return false;
    }
}
