package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

public final class MapMakerInternalMap$WeakKeyWeakValueSegment extends MapMakerInternalMap.Segment {
    public final ReferenceQueue queueForKeys = new ReferenceQueue();
    public final ReferenceQueue queueForValues = new ReferenceQueue();

    public final void A03() {
        do {
        } while (this.queueForKeys.poll() != null);
    }

    public final void A04() {
        A08(this.queueForKeys);
        A09(this.queueForValues);
    }

    public MapMakerInternalMap$WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
        super(mapMakerInternalMap, i);
    }
}
