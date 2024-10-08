package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class R0m extends R1G<K, Collection<V>> {
    public final /* synthetic */ R0w A00;

    public R0m(R0w r0w) {
        this.A00 = r0w;
    }

    public final Iterator iterator() {
        return new R1M(new C12608Szs((Object) this, 7), this.A00.A00.keySet().iterator(), 1);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        R0w r0w = this.A00;
        r0w.A00.keySet().remove(entry.getKey());
        return true;
    }
}
