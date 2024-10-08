package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;

public final class R0d extends C267594bo<K> {
    public final /* synthetic */ MapMakerInternalMap A00;

    public R0d(MapMakerInternalMap mapMakerInternalMap) {
        this.A00 = mapMakerInternalMap;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new AnonymousClass58S(this.A00);
    }

    public final boolean remove(Object obj) {
        return AnonymousClass7TF.A1V(this.A00.remove(obj));
    }

    public final int size() {
        return this.A00.size();
    }
}
