package X;

import java.util.Collection;
import java.util.Iterator;

public final class R0o extends R1G<K, Collection<V>> {
    public final /* synthetic */ R0u A00;

    public R0o(R0u r0u) {
        this.A00 = r0u;
    }

    public final Iterator iterator() {
        return new C8662Qz3(this);
    }

    public final boolean removeAll(Collection collection) {
        return this.A00.A00.A08(new T00(collection));
    }

    public final boolean retainAll(Collection collection) {
        return this.A00.A00.A08(new T02(new T00(collection)));
    }

    public final int size() {
        Iterator it = iterator();
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return 1WJ.A02(j);
    }
}
