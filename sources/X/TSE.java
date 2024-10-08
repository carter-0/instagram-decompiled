package X;

import com.google.common.collect.HashBiMap;
import java.util.AbstractSet;
import java.util.Iterator;

public abstract class TSE<K, V, T> extends AbstractSet<T> {
    public final HashBiMap A00;

    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        return new TMP(this);
    }

    public final int size() {
        return this.A00.A02;
    }

    public TSE(HashBiMap hashBiMap) {
        this.A00 = hashBiMap;
    }
}
